/**
 * 
 */
package sources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import outils.Marque;
import outils.Moteur;
import outils.Option;

/**
 * @author Fr�d�rick P.
 * 
 *         class abstraite de v�hicule qui sert � alimenter le garage. Les diff�rents type de v�hicules h�riteront de
 *         cette class. Cette class implements Serializable afin de pouvoir enregistrer les v�hicules comme des objets
 *         dans un fichier
 *
 */
public abstract class Vehicule implements Serializable {
    /**
     * attribut pour g�rer les versions de la class car celle_ci est serializable afin de pouvoir sauvegarder les
     * informations sous forme d'objet
     */
    private static final long serialVersionUID = 1L;

    private Double prix;
    private String nom = getClass().getSimpleName();
    private List<Option> options = new ArrayList<>();
    private Marque nomMarque;
    private Moteur moteur;

    // constructeur appel� par la class enfant directement et permet ainsi de d�finir les caract�ristiques du v�hicule
    protected Vehicule(Double prix, Marque nomMarque) {
        this.prix = prix;
        this.nomMarque = nomMarque;
    }

    /**
     * on redefinie la m�thode d'affichage pour indiquer les informations comme on le souhaite
     */
    public String toString() {
        Double prixVehicule = prix + moteur.getPrix(); // prix du v�hicule hors option (prix modele+prix moteur)
        // Calcul du prix des options
        Double prixOptions = 0d;
        for (Option o : options) {
            prixOptions += o.getPRIX();
        }
        Double prixFinal = prixVehicule + prixOptions; // prix total du v�hicule (inclus options et moteur)
        // mode d'affichage
        return "=> Voiture " + nomMarque + " : " + nom + " " + moteur + " (" + prixVehicule + "€)" + options
                + " d'une valeur totale de " + prixFinal + "€";
    }

    /**
     * method pour initialiser/ajouter les diff�rentes options du v�hicule.
     * 
     * visibilit� r�duite au package car n'est appel� que dans ce package (package principal)
     * @param opt : nouvelle option � ajouter au vehicule
     */
    void addOption(Option opt) {
        options.add(opt);
    }

    /**
     * method pour initialiser/ajouter l'object(caract�ristiques) moteur correspondant au v�hicule.
     * 
     * visibilit� r�duite au package car n'est appel� que dans ce package (package principal)
     * @param moteur : instance de la class Moteur
     */
    void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

}
