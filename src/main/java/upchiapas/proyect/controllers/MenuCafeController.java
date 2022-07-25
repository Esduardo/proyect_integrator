package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;
import upchiapas.proyect.models.Comprar;

public class MenuCafeController {

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
        lblNombre1.setText(Main.listaBebidas.get(0).getNombre());
        lblDefinition1.setText(Main.listaBebidas.get(0).getNomBebida());
        lblCosto1.setText("$" + Main.listaBebidas.get(0).getCosto());

        lblNombre2.setText(Main.listaBebidas.get(1).getNombre());
        lblDefinition2.setText(Main.listaBebidas.get(1).getNomBebida());
        lblCosto2.setText("$" + Main.listaBebidas.get(1).getCosto());

        lblNombre3.setText(Main.listaBebidas.get(2).getNombre());
        lblDefinition3.setText(Main.listaBebidas.get(2).getNomBebida());
        lblCosto3.setText("$" + Main.listaBebidas.get(2).getCosto());

        lblNombre4.setText(Main.listaBebidas.get(3).getNombre());
        lblDefinition4.setText(Main.listaBebidas.get(3).getNomBebida());
        lblCosto4.setText("$" + Main.listaBebidas.get(3).getCosto());
    }

    @FXML
    void btnAgregar1OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(0).getNomBebida(), Main.listaBebidas.get(0).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(0).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(0).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar2OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())) {
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(1).getNomBebida(), Main.listaBebidas.get(1).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(1).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(1).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar3OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(2).getNomBebida(), Main.listaBebidas.get(2).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(2).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(2).getPrecio());
            }
        }
    }

    @FXML
    void btnAgregar4OnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                Main.listaUsers.get(i).getListaCompras().add(new Comprar(Main.listaBebidas.get(3).getNomBebida(), Main.listaBebidas.get(3).getCosto()));
                System.out.println(Main.listaUsers.get(i).getListaCompras().get(3).getNameProduct() + Main.listaUsers.get(i).getListaCompras().get(3).getPrecio());
            }
        }
    }
}
