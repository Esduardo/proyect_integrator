package upchiapas.proyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import upchiapas.proyect.Main;

public class ListaComprasController {

    @FXML
    private TextArea TextAreaLista;

    @FXML
    private ImageView btnConfiguracion;

    @FXML
    void btnConfiguracionOnMouseClick(MouseEvent event) {
        Main.setFXML("Configuraciones-view", "Menu - Express Foot");
    }

    @FXML
    public void initialize(){
        for(int i = 0; i < Main.listaUsers.size(); i++){
            if(Main.listaUsers.get(i).getEmail().equals(Main.getStage().getUserData())) {
                TextAreaLista.appendText(String.valueOf(Main.listaUsers.get(i).getNombre() + " Cantidad Compras" + Main.listaUsers.get(i).getListaCompras().size() + " :$ " + Main.listaUsers.get(i).getPagar() + "\n"));
            }
        }
    }

}
