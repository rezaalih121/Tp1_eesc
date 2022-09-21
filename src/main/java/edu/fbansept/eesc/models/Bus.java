package edu.fbansept.eesc.models;

public class Bus extends Vehicule{

    private int nombreDePassager;

    public Bus(int nombreDeRoue, String marque, int nombreDePassager) {
        super(nombreDeRoue, marque);
        this.nombreDePassager = nombreDePassager;
    }

    public int getNombreDePassager() {
        return nombreDePassager;
    }

    public void setNombreDePassager(int nombreDePassager) {
        this.nombreDePassager = nombreDePassager;
    }

    @Override
    public String getVehiculeInfo() {
        return super.getVehiculeInfo()+ " NombreDePassager = " + nombreDePassager;
    }
}
