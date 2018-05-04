/**
 * 
 */
package outils;

import java.io.Serializable;

/**
 * @author Frederick P.
 * 
 *         class abstraite permettant de g�rer les diff�rents types de moteur qui seront d�finis par les classes enfants
 *
 */
public abstract class Moteur implements Serializable {
    /**
     * attribut pour g�rer les versions de la class car celle_ci est serializable afin de pouvoir sauvegarder les
     * informations sous forme d'objet
     */
    private static final long serialVersionUID = 1L;

    private TypeMoteur type;
    private String cylindre;
    private Double prix;

    // constructeur appel� par la class enfant directement et permet ainsi de d�finir les caract�ristiques du moteur
    protected Moteur(TypeMoteur type, String cylindre, Double prix) {
        this.type = type;
        this.cylindre = cylindre;
        this.prix = prix;
    }

    /**
     * red�finition de la m�thode d'affichage du moteur pour indiquer les diff�rentes caract�ristiques.
     */
    public String toString() {
        return "Moteur " + type + " " + cylindre;
    }

    /**
     * getter pour pouvoir reprendre le prix du moteur et l'ajouter au prix du v�hicule
     * @return prix du moteur
     */
    public Double getPrix() {
        return prix;
    }

}
