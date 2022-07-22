package upchiapas.proyect.models;

public class Bebida extends MenuAlimentoBebida {
    private String nomBebida;
    private double costo;
    public Bebida(String nombre, byte id, String nomBebida, double costo) {
        super(nombre, id, nomBebida);
        this.nomBebida = nomBebida;
        this.costo = costo;
    }

    public String getNomBebida() {
        return nomBebida;
    }

    public void setNomBebida(String nomBebida) {
        this.nomBebida = nomBebida;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
