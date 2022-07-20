package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;

public class MenuBebidasController {

    @FXML
    private Button btnMenuComida;

    @FXML
    void btnMenuComidaOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuComida-view", "Menu - Express Foot");
    }
}
