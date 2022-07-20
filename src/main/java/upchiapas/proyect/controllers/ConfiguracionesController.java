package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import upchiapas.proyect.Main;
import upchiapas.proyect.models.ValideUser;

public class ConfiguracionesController extends ValideUser {

    @FXML
    private static Label lblNameUsuario;
    @FXML
    private AnchorPane btnDesarrolladores;

    @FXML
    private Button btnDesconectarse;

    @FXML
    private ImageView btnRegresar;


    static void usuario(String txtEmail){
        String email = txtEmail;
        for(int i = 0; i < ValideUser.admins.size(); i++){
            lblNameUsuario.setText(ValideUser.admins.get(i).getNombre());
        }
    }
    @FXML
    void btnDesarrolladoresOnMouseClick(MouseEvent event) {
        Main.setFXML("Desarrolladores-view", "Config - Express Foot");
    }

    @FXML
    void btnDesconectOnMouseClick(MouseEvent event) {
        Main.setFXML("Login-view", "Login - Express Foot");
    }

    @FXML
    void btnRegresarOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuComida-view", "Registro - Express Foot");
    }

}
