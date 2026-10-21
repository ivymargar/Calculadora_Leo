package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Controlador principal de la calculadora.
 * Gestiona la interacción entre la interfaz gráfica y el modelo,
 * permitiendo introducir operaciones, limpiar la pantalla
 * y realizar los cálculos matemáticos.
 *
 * @author Leo Martínez
 */
public class PrimaryController {

    @FXML
    private TextField pantalla;

    @FXML
    private Button botonLimpiar;

    /**
     * Instancia del modelo utilizada para realizar las
     * operaciones matemáticas de la calculadora.
     */
    private final CalculadoraModel modelo = new CalculadoraModel();

    /**
     * Limpia todo el contenido mostrado en la pantalla de la calculadora.
     */
    @FXML
    private void limpiar() {
        pantalla.clear();
    }

    /**
     * Obtiene el botón pulsado por el usuario y añade su texto
     * al contenido actual de la pantalla.
     *
     * @param event evento generado al pulsar uno de los botones
     */
    @FXML
    private void pulsarBoton(ActionEvent event) {

        Button boton = (Button) event.getSource();

        pantalla.appendText(boton.getText());
    }

    /**
     * Obtiene la operación introducida por el usuario,
     * identifica el operador matemático, obtiene los operandos
     * y utiliza el modelo para realizar el cálculo correspondiente.
     * Finalmente, muestra el resultado en la pantalla.
     *
     * Si se produce un error durante el cálculo,
     * se muestra el texto "Error" en la pantalla.
     */
    @FXML
    private void calcular() {

        String operacion = pantalla.getText();

        try {

            if (operacion.contains("+")) {

                String[] partes = operacion.split("\\+");

                double numero1 = Double.parseDouble(partes[0]);
                double numero2 = Double.parseDouble(partes[1]);

                double resultado = modelo.sumar(numero1, numero2);

                pantalla.setText(String.valueOf(resultado));

            } else if (operacion.contains("-")) {

                String[] partes = operacion.split("-");

                double numero1 = Double.parseDouble(partes[0]);
                double numero2 = Double.parseDouble(partes[1]);

                double resultado = modelo.restar(numero1, numero2);

                pantalla.setText(String.valueOf(resultado));

            } else if (operacion.contains("*")) {

                String[] partes = operacion.split("\\*");

                double numero1 = Double.parseDouble(partes[0]);
                double numero2 = Double.parseDouble(partes[1]);

                double resultado = modelo.multiplicar(numero1, numero2);

                pantalla.setText(String.valueOf(resultado));

            } else if (operacion.contains("/")) {

                String[] partes = operacion.split("/");

                double numero1 = Double.parseDouble(partes[0]);
                double numero2 = Double.parseDouble(partes[1]);

                double resultado = modelo.dividir(numero1, numero2);

                pantalla.setText(String.valueOf(resultado));
            }

        } catch (Exception e) {

            pantalla.setText("Error");
        }
    }
}