package edu.fbansept.eesc.models;

public class Voiture extends Vehicule {
    private int nombreDeChevaux;

    public Voiture( String marque, int nombreDeChevaux) {
        super(4, marque);
        this.nombreDeChevaux = nombreDeChevaux;
    }

    public int getNombreDeChevaux() {
        return nombreDeChevaux;
    }

    public void setNombreDeChevaux(int nombreDeChevaux) {
        this.nombreDeChevaux = nombreDeChevaux;
    }

    public int fraisKilometrique(int nombreKilometre){
        return nombreKilometre * nombreDeChevaux * 34;
    }

    @Override
    public String getVehiculeInfo() {
        return super.getVehiculeInfo() + " NombreDeChevaux = " + nombreDeChevaux;
    }
}
