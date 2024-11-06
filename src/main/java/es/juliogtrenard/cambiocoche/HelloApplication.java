package es.juliogtrenard.cambiocoche;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * Clase donde se ejecuta la aplicación
 */
public class HelloApplication extends Application {
    /**
     * Muestra la ventana de la aplicación.
     *
     * @param stage La ventana
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/es/juliogtrenard/cambiocoche/fxml/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("MINI COOPER");
        stage.getIcons().add(new Image(Objects.requireNonNull(HelloApplication.class.getResourceAsStream("/es/juliogtrenard/cambiocoche/img/Cooper.png"))));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Lanza la aplicación
     * @param args Argumentos de linea de comandos
     */
    public static void main(String[] args) {
        launch();
    }
}