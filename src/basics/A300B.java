/**
 * 
 */
package basics;

import outils.Marque;
import sources.Vehicule;

/**
 * @author Frederick P.
 * 
 *         class enfant de Vehicule pour d�finir type A300B PIGEOT
 *
 */
public class A300B extends Vehicule {
    /**
     * attribut pour g�rer les versions de la class car de par la class parent cette class est aussi s�rializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * constructeur qui permet de d�finir directement la marque du v�hicule � partir de l'�num�ration Marque, et le prix
     * de d�part (hors moteur et hors options)
     */
    public A300B() {
        super(15030.25,Marque.PIGEOT);
    }
}
