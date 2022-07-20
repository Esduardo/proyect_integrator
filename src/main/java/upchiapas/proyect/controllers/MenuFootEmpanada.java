package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;

public class MenuFootEmpanada {

    @FXML
    private ImageView bntRegresar;

    @FXML
    private Button btnRegresar;

    @FXML
    void btnRegresarOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuComida-view", "Menu - Express Foot");
    }

}
