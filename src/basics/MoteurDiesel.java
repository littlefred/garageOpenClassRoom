/**
 * 
 */
package basics;

import outils.Moteur;
import outils.TypeMoteur;

/**
 * @author Frederick P.
 * 
 *         class du modele de moteur Diesel
 *
 */
public class MoteurDiesel extends Moteur {
    /**
     * attribut pour g�rer les versions de la class car celle_ci est serializable de part la class parent afin de
     * pouvoir sauvegarder les informations sous forme d'objet
     */
    private static final long serialVersionUID = 1L;

    private static final TypeMoteur TYPE = TypeMoteur.DIESEL;

    public MoteurDiesel(String cylindre, Double prix) {
        super(TYPE, cylindre, prix);
    }
}
