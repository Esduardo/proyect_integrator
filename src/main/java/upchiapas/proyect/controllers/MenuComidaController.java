package upchiapas.proyect.controllers;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import upchiapas.proyect.Main;

import java.io.IOException;


public class MenuComidaController {
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
}

