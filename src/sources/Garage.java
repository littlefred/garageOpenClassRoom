/**
 * 
 */
package sources;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Fr�d�rick P.
 * 
 *         exercice openClassRoom du Garage (cours de java)
 *
 */
public class Garage {
    /**
     * le garage poss�de une liste de voiture lorsque une instance est cr��.
     */
    private List<Vehicule> voitures;

    /**
     * constructeur de la class garage qui ne prends pas d'argument mais initialise la liste des v�hicules � partir d'un
     * fichier.
     * 
     * S'il n'y a pas encore de fichier, on alerte alors l'utilisateur en indiquant qu'il n'y a pas de v�hicule pour le
     * moment.
     */
    @SuppressWarnings("unchecked")
    public Garage() {
        voitures = new ArrayList<Vehicule>();
        try (ObjectInputStream reader = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(new File("garage.txt"))))) {
            voitures = (ArrayList<Vehicule>) reader.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("Aucune voiture sauvegard�e !");
        } catch (ClassNotFoundException e) {
            System.err.println("Le fichier ne contient pas de liste de v�hicule.");
        } catch (IOException e) {
            System.err.println("Erreur Technique, nous ne pouvons pas acc�der aux informations.");
        }
    }

    /**
     * on redefinie le mode d'affichage par d�faut du garage pour pouvoir indiquer directement les informations qu'on
     * souhaite.
     */
    public String toString() {
        String str = "***************************\n";
        str += "*  Garage OpenClassRooms  *\n";
        str += "***************************\n";
        for (Vehicule voit : voitures) {
            str += voit + "\n";
        }
        return str;
    }

    /**
     * method pour ajouter et sauvegarder un nouveau v�hicule sous forme d'une liste d'objet enregistr�e dans un fichier
     * 
     * visibilit� r�duite au package car n'est appel� que dans ce package (package principal)
     * @param voit : correspond au nouveau v�hicule qu'on souhaite ajouter
     */
    void addVoiture(Vehicule voit) {
        voitures.add(voit); // ajout du nouveau v�hicule � la liste de v�hicule initialis�e lors de l'instanciation du
                            // garage
        try (ObjectOutputStream writer = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(new File("garage.txt"))))) {
            writer.writeObject(voitures); // sauvegarde de la nouvelle liste dans le fichier.
        } catch (FileNotFoundException e) {
            System.err.println("Aucune nouvelle voiture d'enregistr�e !");
        } catch (IOException e) {
            System.err.println("Erreur Technique, nous ne pouvons pas enregistrer le v�hicule.");
            e.printStackTrace();
        }
    }

}
