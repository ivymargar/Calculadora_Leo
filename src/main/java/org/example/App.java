package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Aplicación principal de la calculadora JavaFX.
 *
 * @author Leo Martínez
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        // Carga el archivo primary.fxml
        Parent root = loadFXML("primary");

        /*
         * La escena obtiene automáticamente el tamaño preferido
         * definido en el contenedor raíz del archivo FXML.
         */
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Calculadora");

        /*
         * Ajusta la ventana al tamaño preferido del contenido FXML.
         */
        stage.sizeToScene();

        /*
         * Impide que la ventana pueda redimensionarse y que
         * la distribución de la calculadora se deforme.
         */
        stage.setResizable(false);

        stage.show();
    }

    /**
     * Cambia la vista mostrada en la escena.
     *
     * @param fxml nombre del archivo FXML sin extensión
     * @throws IOException si no se puede cargar el archivo
     */
    static void setRoot(String fxml) throws IOException {

        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Carga un archivo FXML.
     *
     * @param fxml nombre del archivo FXML sin extensión
     * @return contenido cargado del archivo FXML
     * @throws IOException si no se puede cargar el archivo
     */
    private static Parent loadFXML(String fxml) throws IOException {

        FXMLLoader fxmlLoader =
                new FXMLLoader(App.class.getResource(fxml + ".fxml"));

        return fxmlLoader.load();
    }

    public static void main(String[] args) {

        launch();
    }
}