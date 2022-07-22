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
        boolean isExist = false;
        int i=0;
        do {
            if(Main.listaUsers.get(i).getEmail().equals(txtEmail.getText()))
                if(Main.listaUsers.get(i).getPassword().equals(txtPassword.getText()))
                    isExist = true;
            i++;
        } while(!isExist && i < Main.listaUsers.size());

        if (!isExist)
            if (user.autenticarUser(txtEmail.getText(), txtPassword.getText()))
                isExist = true;
        if (isExist) {
            Main.getStage().setUserData(txtEmail.getText());
            Main.setFXML("MenuComida-view", "Menu - Express Foot");
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
    @FXML
    public void btnSalirOnMouseClick(MouseEvent mouseEvent) {
        System.exit(1);
    }
    public void linkIniciarSesionOnMouseClick(MouseEvent mouseEvent) {
        Main.setFXML("Registro-view", "Registro - Express Foot");
    }
}