package upchiapas.proyect.controllers;


import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;

public class MenuCafeController {

    @FXML
    private ImageView bntRegresar;

    @FXML
    void btnRegresarOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuBebidas-view", "Menu - Express Foot");
    }

}
