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

    boolean isExit = false;
    @FXML
    private  Label lblNameUsuario;
    @FXML
    private AnchorPane btnDesarrolladores;

    @FXML
    private Button btnDesconectarse;

    @FXML
    private ImageView btnRegresar;


    static void usuario(String txtEmail){
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

    @FXML
    public void initialize(){
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                lblNameUsuario.setText(String.valueOf(Main.listaUsers.get(i).getNombre()));
                isExit = true;
            }
            else if(!isExit){
                for (int j = 0; j < ValideUser.cajas.size(); j++) {
                    if(ValideUser.cajas.get(i).getEmail().equals(Main.getStage().getUserData())){
                        lblNameUsuario.setText(String.valueOf(ValideUser.cajas.get(i).getNombre()));
                    }
                }
            }
        }
    }
}
