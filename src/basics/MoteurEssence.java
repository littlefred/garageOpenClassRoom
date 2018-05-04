/**
 * 
 */
package basics;

import outils.Moteur;
import outils.TypeMoteur;

/**
 * @author Frederick P.
 * 
 *         class du modele de moteur Essence
 *
 */
public class MoteurEssence extends Moteur {
    /**
     * attribut pour g�rer les versions de la class car celle_ci est serializable de part la class parent afin de
     * pouvoir sauvegarder les informations sous forme d'objet
     */
    private static final long serialVersionUID = 1L;

    private static final TypeMoteur TYPE = TypeMoteur.ESSENCE;

    public MoteurEssence(String cylindre, Double prix) {
        super(TYPE, cylindre, prix);
    }
}
