package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;

public class MenuHamburguesaController {

    @FXML
    private ImageView bntRegresar;

    @FXML
    private Button btnRegresar;

    @FXML
    private Label lblCosto1;

    @FXML
    private Label lblCosto2;

    @FXML
    private Label lblCosto3;

    @FXML
    private Label lblCosto4;

    @FXML
    private Label lblDefinition1;

    @FXML
    private Label lblDefinition2;

    @FXML
    private Label lblDefinition3;

    @FXML
    private Label lblDefinition4;

    @FXML
    private Label lblNombre1;

    @FXML
    private Label lblNombre2;

    @FXML
    private Label lblNombre3;

    @FXML
    private Label lblNombre4;

    @FXML
    void btnRegresarOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuComida-view", "Menu - Express Foot");
    }

    @FXML
    public void initialize(){
        lblNombre1.setText(Main.listaAlimentos.get(4).getNombre());
        lblDefinition1.setText(Main.listaAlimentos.get(4).getNomAlimento());
        lblCosto1.setText("$" + Main.listaAlimentos.get(4).getCosto());

        lblNombre2.setText(Main.listaAlimentos.get(5).getNombre());
        lblDefinition2.setText(Main.listaAlimentos.get(5).getNomAlimento());
        lblCosto2.setText("$" + Main.listaAlimentos.get(5).getCosto());

        lblNombre3.setText(Main.listaAlimentos.get(6).getNombre());
        lblDefinition3.setText(Main.listaAlimentos.get(6).getNomAlimento());
        lblCosto3.setText("$" + Main.listaAlimentos.get(6).getCosto());

        lblNombre4.setText(Main.listaAlimentos.get(7).getNombre());
        lblDefinition4.setText(Main.listaAlimentos.get(7).getNomAlimento());
        lblCosto4.setText("$" + Main.listaAlimentos.get(7).getCosto());
    }

}
