package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;

public class MenuSodaController {

    @FXML
    private ImageView bntRegresar;

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
        Main.setFXML("MenuBebidas-view", "Menu - Express Foot");
    }

    @FXML
    public void initialize(){
        lblNombre4.setText(Main.listaBebidas.get(12).getNombre());
        lblDefinition4.setText(Main.listaBebidas.get(12).getNomBebida());
        lblCosto4.setText("$" + Main.listaAlimentos.get(12).getCosto());

        lblNombre1.setText(Main.listaBebidas.get(13).getNombre());
        lblDefinition1.setText(Main.listaBebidas.get(13).getNomBebida());
        lblCosto1.setText("$" + Main.listaBebidas.get(13).getCosto());

        lblNombre2.setText(Main.listaBebidas.get(14).getNombre());
        lblDefinition2.setText(Main.listaBebidas.get(14).getNomBebida());
        lblCosto2.setText("$" + Main.listaBebidas.get(14).getCosto());

        lblNombre3.setText(Main.listaBebidas.get(15).getNombre());
        lblDefinition3.setText(Main.listaBebidas.get(15).getNomBebida());
        lblCosto3.setText("$" + Main.listaBebidas.get(15).getCosto());
    }
}

