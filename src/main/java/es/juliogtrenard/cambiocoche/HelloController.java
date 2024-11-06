package es.juliogtrenard.cambiocoche;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * Clase que controla la ventana principal de la aplicación
 */
public class HelloController implements Initializable {
    /**
     * ToggleButton que cambia el color del coche
     */
    @FXML
    private ToggleButton colorBlazingRed;

    /**
     * ToggleButton que cambia el color del coche
     */
    @FXML
    private ToggleButton colorElectricBlue;

    /**
     * ToggleButton que cambia el color del coche
     */
    @FXML
    private ToggleButton colorLapisluxuryBlue;

    /**
     * ToggleButton que cambia el color del coche
     */
    @FXML
    private ToggleButton colorMidnightBlack;

    /**
     * ToggleButton que cambia el color del coche
     */
    @FXML
    private ToggleButton colorMoonwalkGrey;

    /**
     * ToggleButton que cambia el color del coche
     */
    @FXML
    private ToggleButton colorPepperWhite;

    /**
     * ToggleButton que cambia el color del coche
     */
    @FXML
    private ToggleButton colorThunderGray;

    /**
     * ToggleButton que cambia el color del coche
     */
    @FXML
    private ToggleButton colorVolcaninOrange;

    /**
     * Imagen del coche
     */
    @FXML
    private ImageView imagen;

    /**
     * Imagen para encender y apagar las luces
     */
    @FXML
    private ImageView imagenLuz;

    /**
     * Imagen de la luz
     */
    @FXML
    private ImageView luzImagen;

    /**
     * ToggleGroup para los colores
     */
    @FXML
    private ToggleGroup toggleColor;

    /**
     * Determinar si las luces están encendidas o no
     */
    private boolean luces;

    /**
     * Se ejecuta cuando se inicia la ventana.
     *
     * @param url la url
     * @param resourceBundle los recursos
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        luces = false;
        toggleColor.selectedToggleProperty().addListener((_, _, newValue) -> {
            if (newValue != null) {
                ToggleButton selectedButton = (ToggleButton) newValue;
                String image = "";
                if (selectedButton.equals(colorBlazingRed)) {
                    image = "BlazingRed";
                } else if (selectedButton.equals(colorElectricBlue)) {
                    image = "ElectricBlue";
                } else if (selectedButton.equals(colorLapisluxuryBlue)) {
                    image = "LapisluxuryBlue";
                } else if (selectedButton.equals(colorMidnightBlack)) {
                    image = "MidnightBlack";
                } else if (selectedButton.equals(colorMoonwalkGrey)) {
                    image = "MoonwalkGrey";
                } else if (selectedButton.equals(colorPepperWhite)) {
                    image = "PepperWhite";
                } else if (selectedButton.equals(colorThunderGray)) {
                    image = "ThunderGray";
                } else if (selectedButton.equals(colorVolcaninOrange)) {
                    image = "VolcaninOrange";
                }
                Image img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/es/juliogtrenard/cambiocoche/img/coches/mini" + image + ".png")));
                imagen.setImage(img);
            }
        });
    }

    /**
     * Controla las luces del coche
     */
    @FXML
    public void luces() {
        Image img;
        if (luces) {
            // Apagar luces
            img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/es/juliogtrenard/cambiocoche/img/lucesOff.png")));
            luces = false;
        } else {
            // Encender luces
            img = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/es/juliogtrenard/cambiocoche/img/lucesOn.png")));
            luces = true;
        }
        imagenLuz.setImage(img);
        luzImagen.setVisible(luces);
    }

}