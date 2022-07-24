package upchiapas.proyect.models;

import java.util.ArrayList;

public class User{
    public static  ArrayList<Comprar> listaCompras =  new ArrayList<>();
    private String nombre;
    private String email;
    private String password;


    public User(String nombre, String email, String password, ArrayList<Comprar>listaCompras ) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.listaCompras = listaCompras;
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
}
