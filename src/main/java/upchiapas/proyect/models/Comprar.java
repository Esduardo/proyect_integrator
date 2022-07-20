package upchiapas.proyect.models;

public class Comprar {
    private String nameProduct;
    private double precio;

    public Comprar(String nameProduct, double precio) {
        this.nameProduct = nameProduct;
        this.precio = precio;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

