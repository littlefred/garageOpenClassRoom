/**
 * 
 */
package outils;

import java.io.Serializable;

/**
 * @author Frederick P.
 * 
 *         class option GPS
 */
public class GPS implements Option, Serializable {
    /**
     * attribut pour g�rer les versions de la class car celle_ci est serializable afin de pouvoir sauvegarder les
     * informations sous forme d'objet
     */
    private static final long serialVersionUID = 1L;

    private final String NAME = "GPS"; // nom de l'option
    private final Double PRIX = 113.5; // prix de l'option

    /**
     * getter pour remonter le prix de l'option et pouvoir l'inclure dans le prix total du vehicule
     */
    public Double getPRIX() {
        return PRIX;
    }

    /**
     * on redefinie l'affichage de l'option afin d'indiquer les informations souhait�es
     */
    public String toString() {
        return NAME + " (" + PRIX + "�)";
    }
}
