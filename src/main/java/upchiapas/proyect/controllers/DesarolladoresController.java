package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;

public class DesarolladoresController {

    @FXML
    private ImageView btnRegresarDesarrro;

    @FXML
    void btnRegresarDesarrollaOnMouseClick(MouseEvent event) {
        Main.setFXML("Configuraciones-view", "Config - Express Foot");
    }

}
