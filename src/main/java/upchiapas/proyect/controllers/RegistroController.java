package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;
import upchiapas.proyect.models.User;

import java.io.IOException;
import java.util.ArrayList;

public class RegistroController {
    ArrayList<RegistroController> registroTemporal = new ArrayList<>();
    @FXML
    private Button btnRegistrar;

    @FXML
    private Button btnSalirRegistro;

    @FXML
    private PasswordField txtConfirmPasswordRegistro;

    @FXML
    private TextField txtEmailRegistro;

    @FXML
    private TextField txtNameRegistro;

    @FXML
    private PasswordField txtPasswordRegistro;




    @FXML
    void btnRegistroOnMouseClick(MouseEvent event) throws IOException{
        if(txtPasswordRegistro.getText().equals(txtConfirmPasswordRegistro.getText())){
            Main.listaUsers.add(new User(txtNameRegistro.getText(), txtEmailRegistro.getText(), txtPasswordRegistro.getText()));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Login");
            alert.setContentText("Creado con exito");
            alert.showAndWait();
            Main.setFXML("Login-view", "Login - Express Foot");
        }
    }

    @FXML
    void btnSalirRegistroOnMouseClick(MouseEvent event) {
        Main.setFXML("Login-view", "Login - Express Foot");
    }
}
