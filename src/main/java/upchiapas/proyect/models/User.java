package upchiapas.proyect.models;

import java.util.ArrayList;

public class User{
    public static  ArrayList<Comprar> listaCompras =  new ArrayList<>();
    private String nombre;
    private String email;
    private String password;
    private double pagar = 0;

    public User(String nombre, String email, String password, ArrayList<Comprar>listaCompras, double pagar ) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.listaCompras = listaCompras;
        this.pagar = pagar;
    }

    public double getPagar() {
        return pagar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Comprar> getListaCompras() {
        return listaCompras;
    }

    public void setPagar(double pagar) {
        this.pagar = pagar;
    }
}
