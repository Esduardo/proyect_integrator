package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;
import upchiapas.proyect.models.ValideUser;

public class LoginController {

    private int confirmEmail = 0;
    private int confirmPasssword = 0;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnSalirSesion;

    @FXML
    private Hyperlink linkRegistro;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    public void btnIniciarOnMouseClick(MouseEvent event) {
        ValideUser user = new ValideUser();
        for (int j = 0; j < Main.listaUsers.size(); j++) {
            if(Main.listaUsers.get(j).getEmail().equals(txtEmail.getText())) {
                if (Main.listaUsers.get(j).getPassword().equals(txtPassword.getText())) {
                    Main.setFXML("MenuComida-view", "Menu - Express Foot");
                }
            } else if(user.autenticarUser(txtEmail.getText(), txtPassword.getText())){
                Main.setFXML("ListaComprasCaja-view", "Menu - Express Foot");
            }
            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Login");
                alert.setContentText("Error de inicio de Sesión");
                alert.showAndWait();
                Main.setFXML("Login-view", "Login - Express Foot");
            }
        }
            Main.getStage().setUserData(txtEmail.getText());
    }
    @FXML
    public void btnSalirOnMouseClick(MouseEvent mouseEvent) {
        System.exit(1);
    }
    public void linkIniciarSesionOnMouseClick(MouseEvent mouseEvent) {
        Main.setFXML("Registro-view", "Registro - Express Foot");
    }
}