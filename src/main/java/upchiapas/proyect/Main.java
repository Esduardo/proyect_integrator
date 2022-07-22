package upchiapas.proyect;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import upchiapas.proyect.models.Alimento;
import upchiapas.proyect.models.Bebida;
import upchiapas.proyect.models.MenuAlimentoBebida;
import upchiapas.proyect.models.User;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    public static ArrayList<User> listaUsers = new ArrayList<>();
    public static ArrayList<Alimento> listaAlimentos =  new ArrayList<>();
    public static ArrayList<Bebida> listaBebidas =  new ArrayList<>();
    static public void addAlimentos(){
        listaAlimentos.add(new Alimento("Quesadilla", (byte) 1, "Normales", 12.34));
        listaAlimentos.add(new Alimento("Quesadilla", (byte) 1, "Carne Azada", 13.00));
        listaAlimentos.add(new Alimento("Quesadilla", (byte) 1, "con Chorizo", 15.00));
        listaAlimentos.add(new Alimento("Quesadilla", (byte) 1, "con Repollo", 12.50));

        listaAlimentos.add(new Alimento("Hamburguesa", (byte) 2, "Doble Carne", 35.00));
        listaAlimentos.add(new Alimento("Hamburguesa", (byte) 2, "Hawaiana", 37.00));
        listaAlimentos.add(new Alimento("Hamburguesa", (byte) 2, "Cubana", 40.00));
        listaAlimentos.add(new Alimento("Hamburguesa", (byte) 2, "sin Verduras", 30.00));

        listaAlimentos.add(new Alimento("Empanada", (byte) 3, "de Pollo", 23.23));
        listaAlimentos.add(new Alimento("Empanada", (byte) 3, "de Carne Azada", 23.23));
        listaAlimentos.add(new Alimento("Empanada", (byte) 3, "de Quesillo", 23.23));
        listaAlimentos.add(new Alimento("Empanada", (byte) 3, "de Frijol", 23.23));

        listaAlimentos.add(new Alimento("Maruchan", (byte) 4, "Pollo", 15.00));
        listaAlimentos.add(new Alimento("Maruchan", (byte) 4, "Fuego Diablo", 17.00));
        listaAlimentos.add(new Alimento("Maruchan", (byte) 4, "Camaron", 20.00));
        listaAlimentos.add(new Alimento("Maruchan", (byte) 4, "Extra Picante", 18.00));
    }
    static public void addBebidas(){
        listaBebidas.add(new Bebida("Cafe", (byte) 5, "Americano", 12.00));
        listaBebidas.add(new Bebida("Chocomilk",(byte) 6, "Cocomilk", 45.00));
        listaBebidas.add(new Bebida("Licuados", (byte) 7, "Fresas", 23.50));
        listaBebidas.add(new Bebida("Soda", (byte) 8, "Coca-Cola", 17.00));
    }

    private static Stage stage;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        addAlimentos();
        addBebidas();
        listaUsers.add(new User("Esduardo","eduartrob@gmail.com","12345678"));
        scene = new Scene(loadFXML("login-view"));
        stage.setTitle("Login - Express Foot");
        stage.setScene(scene);
        stage.centerOnScreen(); //centra la pantalla en tiempo de ejecución
        stage.setResizable(false); //impide que el usuario pueda modificar el tamaño del formulario
        stage.show();
    }

    public static Parent loadFXML(String nameView){
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(nameView + ".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setFXML(String nameView, String title){
        scene.setRoot(loadFXML(nameView)); //sustituir en el objeto scene el archivo de vistar
        stage.sizeToScene(); //renderizar el tamaño del stage con las dimenciones de la nueva vista
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setTitle(title);
    }
    public static Stage getStage(){ return stage;}
    public static void main(String[] args) {
        launch();
    }
}