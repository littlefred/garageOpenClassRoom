/**
 * 
 */
package basics;

import outils.Marque;
import sources.Vehicule;

/**
 * @author Frederick P.
 * 
 *         class enfant de Vehicule pour d�finir type D4 TROEN
 *
 */
public class D4 extends Vehicule {
    /**
     * attribut pour g�rer les versions de la class car de par la class parent cette class est aussi s�rializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * constructeur qui permet de d�finir directement la marque du v�hicule � partir de l'�num�ration Marque, et le prix
     * de d�part (hors moteur et hors options)
     */
    public D4() {
        super(10467.5, Marque.TROEN);
    }
}
