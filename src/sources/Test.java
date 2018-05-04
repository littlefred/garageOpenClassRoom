package sources;

import basics.A300B;
import basics.D4;
import basics.Lagouna;
import basics.MoteurDiesel;
import basics.MoteurElectrique;
import basics.MoteurEssence;
import basics.MoteurHybride;
import outils.BarreDeToit;
import outils.Climatisation;
import outils.GPS;
import outils.SiegeChauffant;
import outils.VitreElectrique;

public class Test {

    public static void main(String[] args) {
        Garage garage = new Garage();
        
        System.out.println(garage);
        
        Vehicule lag1 = new Lagouna();
        lag1.setMoteur(new MoteurEssence("150 Chevaux", 8025.6d));
        lag1.addOption(new GPS());
        lag1.addOption(new SiegeChauffant());
        lag1.addOption(new VitreElectrique());
        garage.addVoiture(lag1);
        
        Vehicule A300B_2 = new A300B();
        A300B_2.setMoteur(new MoteurElectrique("1500 W", 10234d));
        A300B_2.addOption(new Climatisation());
        A300B_2.addOption(new BarreDeToit());
        A300B_2.addOption(new SiegeChauffant());
        garage.addVoiture(A300B_2);
        
        Vehicule d4_1 = new D4();
        d4_1.setMoteur(new MoteurDiesel("200 Hdi", 9584d));
        d4_1.addOption(new BarreDeToit());
        d4_1.addOption(new Climatisation());
        d4_1.addOption(new GPS());
        garage.addVoiture(d4_1);        
        
        Vehicule lag2 = new Lagouna();
        lag2.setMoteur(new MoteurDiesel("500 Hdi", 10987d));
        garage.addVoiture(lag2);
        
        Vehicule A300B_1 = new A300B();
        A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
        A300B_1.addOption(new VitreElectrique());
        A300B_1.addOption(new BarreDeToit());
        garage.addVoiture(A300B_1);
        
        Vehicule d4_2 = new D4();
        d4_2.setMoteur(new MoteurElectrique("100 KW", 12242d));
        d4_2.addOption(new SiegeChauffant());
        d4_2.addOption(new BarreDeToit());
        d4_2.addOption(new Climatisation());
        d4_2.addOption(new GPS());
        d4_2.addOption(new VitreElectrique());
        garage.addVoiture(d4_2);
        
        Vehicule d4_3 = new D4();
        d4_3.setMoteur(new MoteurElectrique("150 KW", 13242d));
        d4_3.addOption(new SiegeChauffant());
        d4_3.addOption(new BarreDeToit());
        garage.addVoiture(d4_3);
        
        System.out.println(garage);
        
    }

}
