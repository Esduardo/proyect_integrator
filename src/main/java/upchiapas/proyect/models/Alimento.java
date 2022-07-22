package upchiapas.proyect.models;

public class Alimento extends MenuAlimentoBebida {
    private String nomAlimento;
    private double costo;


    public Alimento(String nombre, byte id, String nomAlimento, double costo) {
        super(nombre, id, nomAlimento);
        this.nomAlimento = nomAlimento;
        this.costo = costo;
    }

    public String getNomAlimento() {
        return nomAlimento;
    }

    public void setNomAlimento(String nomAlimento) {
        this.nomAlimento = nomAlimento;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
