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
    String btnIniciarOnMouseClick(MouseEvent event) {
        ValideUser user = new ValideUser();
        for (int i = 0; i < Main.listaUsers.size(); i++) {
            if(Main.listaUsers.get(i).getEmail().equals(txtEmail.getText())){
                if(Main.listaUsers.get(i).getPassword().equals(txtPassword.getText()))
                    Main.setFXML("MenuComida-view", "Registro - Express Foot");

            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Login");
                alert.setContentText("Error");
                alert.showAndWait();
                Main.setFXML("Login-view", "Login - Express Foot");
            }
        }
        if (user.autenticarUser(txtEmail.getText(), txtPassword.getText())){

            Main.setFXML("MenuComida-view", "Registro - Express Foot");
        }
        return txtEmail.getText();
    }

    @FXML
    public void btnSalirOnMouseClick(MouseEvent mouseEvent) {
        System.exit(1);
    }
    public void linkIniciarSesionOnMouseClick(MouseEvent mouseEvent) {
        Main.setFXML("Registro-view", "Registro - Express Foot");
    }
}