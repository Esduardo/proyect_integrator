package upchiapas.proyect.models;

public class MenuAlimentoBebida {
    private String nombre;
    private byte id;

    public MenuAlimentoBebida(String nombre, byte id, String nomAlimento) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

}
