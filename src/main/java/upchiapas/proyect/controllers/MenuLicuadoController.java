package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;
import upchiapas.proyect.models.Comprar;

public class MenuLicuadoController {

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
        lblNombre1.setText(Main.listaBebidas.get(8).getNombre());
        lblDefinition1.setText(Main.listaBebidas.get(8).getNomBebida());
        lblCosto1.setText("$" + Main.listaBebidas.get(8).getCosto());

        lblNombre2.setText(Main.listaBebidas.get(9).getNombre());
        lblDefinition2.setText(Main.listaBebidas.get(9).getNomBebida());
        lblCosto2.setText("$" + Main.listaBebidas.get(9).getCosto());

        lblNombre3.setText(Main.listaBebidas.get(10).getNombre());
        lblDefinition3.setText(Main.listaBebidas.get(10).getNomBebida());
        lblCosto3.setText("$" + Main.listaBebidas.get(10).getCosto());

        lblNombre4.setText(Main.listaBebidas.get(11).getNombre());
        lblDefinition4.setText(Main.listaBebidas.get(11).getNomBebida());
        lblCosto4.setText("$" + Main.listaBebidas.get(11).getCosto());
    }

    @FXML
    void btnAgregar1OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(8).getNomBebida(), Main.listaBebidas.get(8).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(8).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(8).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar2OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())) {
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(9).getNomBebida(), Main.listaBebidas.get(9).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(9).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(9).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar3OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(10).getNomBebida(), Main.listaBebidas.get(10).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(10).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(10).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar4OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(11).getNomBebida(), Main.listaBebidas.get(11).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(11).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(11).getPrecio());
            }
        }
    }
}

