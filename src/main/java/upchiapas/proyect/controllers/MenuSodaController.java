package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;
import upchiapas.proyect.models.Comprar;

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
        lblNombre1.setText(Main.listaBebidas.get(12).getNombre());
        lblDefinition1.setText(Main.listaBebidas.get(12).getNomBebida());
        lblCosto1.setText("$" + Main.listaBebidas.get(12).getCosto());

        lblNombre2.setText(Main.listaBebidas.get(13).getNombre());
        lblDefinition2.setText(Main.listaBebidas.get(13).getNomBebida());
        lblCosto2.setText("$" + Main.listaBebidas.get(13).getCosto());

        lblNombre3.setText(Main.listaBebidas.get(14).getNombre());
        lblDefinition3.setText(Main.listaBebidas.get(14).getNomBebida());
        lblCosto3.setText("$" + Main.listaBebidas.get(14).getCosto());

        lblNombre4.setText(Main.listaBebidas.get(15).getNombre());
        lblDefinition4.setText(Main.listaBebidas.get(15).getNomBebida());
        lblCosto4.setText("$" + Main.listaBebidas.get(15).getCosto());
    }

    @FXML
    void btnAgregar1OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(12).getNomBebida(), Main.listaBebidas.get(12).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(12).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(12).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar2OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())) {
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(13).getNomBebida(), Main.listaBebidas.get(13).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(13).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(13).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar3OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(14).getNomBebida(), Main.listaBebidas.get(14).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(14).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(14).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar4OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(15).getNomBebida(), Main.listaBebidas.get(15).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(15).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(15).getPrecio());
            }
        }
    }
}

