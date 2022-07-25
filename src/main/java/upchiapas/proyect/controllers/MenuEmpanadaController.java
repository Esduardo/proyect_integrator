package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;
import upchiapas.proyect.models.Comprar;

public class MenuEmpanadaController {

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
        lblNombre1.setText(Main.listaAlimentos.get(8).getNombre());
        lblDefinition1.setText(Main.listaAlimentos.get(8).getNomAlimento());
        lblCosto1.setText("$" + Main.listaAlimentos.get(8).getCosto());

        lblNombre2.setText(Main.listaAlimentos.get(9).getNombre());
        lblDefinition2.setText(Main.listaAlimentos.get(9).getNomAlimento());
        lblCosto2.setText("$" + Main.listaAlimentos.get(9).getCosto());

        lblNombre3.setText(Main.listaAlimentos.get(10).getNombre());
        lblDefinition3.setText(Main.listaAlimentos.get(10).getNomAlimento());
        lblCosto3.setText("$" + Main.listaAlimentos.get(10).getCosto());

        lblNombre4.setText(Main.listaAlimentos.get(11).getNombre());
        lblDefinition4.setText(Main.listaAlimentos.get(11).getNomAlimento());
        lblCosto4.setText("$" + Main.listaAlimentos.get(11).getCosto());
    }

    @FXML
    void btnAgregar1OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaAlimentos.get(8).getNomAlimento(), Main.listaAlimentos.get(8).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(8).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(8).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar2OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())) {
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaAlimentos.get(9).getNomAlimento(), Main.listaAlimentos.get(9).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(9).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(9).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar3OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaAlimentos.get(10).getNomAlimento(), Main.listaAlimentos.get(10).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(10).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(10).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar4OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaAlimentos.get(11).getNomAlimento(), Main.listaAlimentos.get(11).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(11).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(11).getPrecio());
            }
        }
    }

}


