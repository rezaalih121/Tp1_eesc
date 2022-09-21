import edu.fbansept.eesc.models.Bus;
import edu.fbansept.eesc.models.Vehicule;
import edu.fbansept.eesc.models.Voiture;

public class Main {
    public static void main(String[] args) {

        Vehicule vehicule = new Vehicule(8 , "Grand Camion");

        Voiture bmw = new Voiture("BMW",7);

        Bus volvo = new Bus(8,"VOLVO",70);
        System.out.println("Vehicules !");

        System.out.println(vehicule.getVehiculeInfo());
        System.out.println(bmw.getVehiculeInfo());
        System.out.println(bmw.fraisKilometrique(121));
        System.out.println(volvo.getVehiculeInfo());
        bmw.toString();


    }
}