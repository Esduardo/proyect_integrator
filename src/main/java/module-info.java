module upchiapas.proyect {
    requires javafx.controls;
    requires javafx.fxml;


    opens upchiapas.proyect to javafx.fxml;
    exports upchiapas.proyect;
    exports upchiapas.proyect.controllers;
    opens upchiapas.proyect.controllers to javafx.fxml;
}