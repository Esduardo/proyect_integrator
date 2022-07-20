package upchiapas.proyect;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import upchiapas.proyect.controllers.LoginController;
import upchiapas.proyect.models.User;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    public static ArrayList<User> listaUsers = new ArrayList<>();
    private static Stage stage;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        listaUsers.add(new User("juan","juan@com","1234"));
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