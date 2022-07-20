package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;

public class MenuComidaController {



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
        Main.setFXML("Bebidas-view", "Menu - Express Foot");
    }

}

