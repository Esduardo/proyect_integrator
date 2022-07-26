package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Label lblCantidadCompras;


    @FXML
    private Button btnVerCompras;

    @FXML
    void bntCafeOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuCafe-view", "Menu - Express Foot");
    }

    @FXML
    void bntChocoOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuChocomilk-view", "Menu - Express Foot");
    }

    @FXML
    void bntLicuadOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuLicuado-view", "Menu - Express Foot");
    }

    @FXML
    void bntSodasOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuSoda-view", "Menu - Express Foot");
    }

    @FXML
    void btnConfigOnMouseClick(MouseEvent event) {

    }

    @FXML
    void btnMenuComidaOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuComida-view", "Menu - Express Foot");
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
