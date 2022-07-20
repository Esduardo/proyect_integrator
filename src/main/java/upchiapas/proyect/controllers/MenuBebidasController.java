package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;

public class MenuBebidasController {

    @FXML
    private Button btnConfig;

    @FXML
    private Button btnMenuCafe;

    @FXML
    private Button btnMenuChocomil;

    @FXML
    private Button btnMenuComida;

    @FXML
    private Button btnMenuLicuado;

    @FXML
    private Button btnMenuSodas;

    @FXML
    void bntCafeOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuCafe-view", "Menu - Express Foot");
    }

    @FXML
    void bntChocoOnMouseClick(MouseEvent event) {

    }

    @FXML
    void bntLicuadOnMouseClick(MouseEvent event) {

    }

    @FXML
    void bntSodasOnMouseClick(MouseEvent event) {

    }

    @FXML
    void btnConfigOnMouseClick(MouseEvent event) {
        Main.setFXML("Configuraciones-view", "Menu - Express Foot");
    }

    @FXML
    void btnMenuComidaOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuComida-view", "Menu - Express Foot");
    }

}
