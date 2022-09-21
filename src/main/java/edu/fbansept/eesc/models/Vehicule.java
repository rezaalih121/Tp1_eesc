package edu.fbansept.eesc.models;

public class Vehicule {

    private int nombreDeRoue;
    private String marque;

    public Vehicule(int nombreDeRoue, String marque) {
        this.nombreDeRoue = nombreDeRoue;
        this.marque = marque;
    }

    public String getVehiculeInfo (){
        return "Marque = " + marque + " NombreDeRoue = " + nombreDeRoue;
    }

    public int getNombreDeRoue() {
        return nombreDeRoue;
    }

    public void setNombreDeRoue(int nombreDeRoue) {
        this.nombreDeRoue = nombreDeRoue;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
