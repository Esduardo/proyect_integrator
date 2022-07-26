package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;

import java.io.IOException;

public class MenuComidaController {
    @FXML
    private Button btnVerCompras;
    @FXML
    private Label lblCantidadCompras;
    @FXML
    private Button btnMenuMaruchan;
    @FXML
    private Button btnMenuEmpanadas;

    @FXML
    private Button btnMenuHamburguesa;

    @FXML
    private Button btonMenuQuesadilla;
    @FXML
    private Button btnConfig;

    @FXML
    private Button btnMenuBebida;

    @FXML
    void btnConfigOnMouseClick(MouseEvent event) {
        Main.setFXML("Configuraciones-view", "Config - Express Foot");
    }

    @FXML
    void btnMenuBebidaOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuBebidas-view", "Menu - Express Foot");
    }

    @FXML
    void btnEmpanadasOnMouseClick(MouseEvent event) throws IOException {
        Main.setFXML("MenuEmpanada-view", "Menu - Express Foot");
    }

    @FXML
    void btnHamburguesaOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuHamburguesa-view", "Menu - Express Foot");
    }

    @FXML
    void btnMaruchanOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuMaruchan-view", "Menu - Express Foot");
    }

    @FXML
    void bntQuesadillaOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuQuesadilla-view", "Menu - Express Foot");
    }

    @FXML
    void btnVerComprasOnMouseClick(MouseEvent event) {
        Main.setFXML("notificaciones-view", "Menu - Express Foot");
    }

    @FXML
    public void initialize(){
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())) {
                lblCantidadCompras.setText(String.valueOf(Main.listaUsers.get(i).getListaCompras().size()));
            }
        }
    }
}

