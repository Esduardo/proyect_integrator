package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;
import upchiapas.proyect.models.Comprar;

public class MenuHamburguesaController {
    @FXML
    private ImageView btnAgregar1;

    @FXML
    private ImageView btnAgregar2;

    @FXML
    private ImageView btnAgregar3;

    @FXML
    private ImageView btnAgregar4;

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

    @FXML
    void btnAgregar1OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaAlimentos.get(4).getNomAlimento(), Main.listaAlimentos.get(4).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(4).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(4).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar2OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())) {
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaAlimentos.get(5).getNomAlimento(), Main.listaAlimentos.get(5).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(5).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(5).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar3OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaAlimentos.get(6).getNomAlimento(), Main.listaAlimentos.get(6).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(6).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(6).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar4OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaAlimentos.get(7).getNomAlimento(), Main.listaAlimentos.get(7).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(7).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(7).getPrecio());
            }
        }
    }
}
