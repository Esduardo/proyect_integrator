package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;
import upchiapas.proyect.models.User;
import upchiapas.proyect.models.ValideUser;

import static upchiapas.proyect.Main.total;


public class ListaPedidosController {
    @FXML
    private Button btnComprar;

    @FXML
    private ImageView btnSalir;

    @FXML
    private Label lblCantidadPedidos;

    @FXML
    private Label lblTtotal;

    @FXML
    private Label lblUsuario;

    @FXML
    private Label txtLprecios;

    @FXML
    private Label txtLpredidos;

    @FXML
    private Label txtPedidos;

    @FXML
    private Label txtPrecio;

    @FXML
    void btnSalirOnMouseClick(MouseEvent event) {
        Main.setFXML("MenuComida-view", "Registro - Express Foot");
    }

    @FXML
    void btnComprarOnMouseClick(MouseEvent event) {
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())) {
                User.listaCompras.clear();
            }
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Menu");
        alert.setContentText("Compra hecha");
        alert.showAndWait();
    }


    public void initialize(){
        for(int i = 0; i < Main.listaUsers.size(); i++){
            boolean isExit = false;
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())){
                lblUsuario.setText(String.valueOf(Main.listaUsers.get(i).getNombre()));
                isExit = true;
            }
            else if(!isExit){
                for (int j = 0; j < ValideUser.cajas.size(); j++) {
                    if(ValideUser.cajas.get(i).getEmail().equals(Main.getStage().getUserData())){
                        lblUsuario.setText(String.valueOf(ValideUser.cajas.get(i).getNombre()));
                    }
                }
            }
        }
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())) {
                for (int j = 0; j < Main.listaUsers.get(i).getListaCompras().size(); j++) {
                    total = total + Main.listaUsers.get(i).getListaCompras().get(j).getPrecio();
                }
                lblTtotal.setText(String.valueOf(total));
                Main.listaUsers.get(i).setPagar(total);
                lblCantidadPedidos.setText(String.valueOf(Main.listaUsers.get(i).getListaCompras().size()));
            }
        }
        total = 0;
    }
}




