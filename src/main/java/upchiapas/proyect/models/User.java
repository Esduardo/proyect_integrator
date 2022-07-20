package upchiapas.proyect.models;

import java.util.ArrayList;

public class User{
    private ArrayList<Comprar> listaCompras =  new ArrayList<>();
    private String nombre;
    private String email;
    private String password;

    public User(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
