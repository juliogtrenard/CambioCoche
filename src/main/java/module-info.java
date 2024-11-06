module es.juliogtrenard.cambiocoche {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.juliogtrenard.cambiocoche to javafx.fxml;
    exports es.juliogtrenard.cambiocoche;
}