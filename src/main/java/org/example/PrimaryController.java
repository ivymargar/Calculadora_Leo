package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField pantalla;

    @FXML
    private Button botonLimpiar;

    private final CalculadoraModel modelo = new CalculadoraModel();

    @FXML
    private void limpiar() {
        pantalla.clear();
    }

    @FXML
    private void pulsarBoton(ActionEvent event) {

        Button boton = (Button) event.getSource();

        pantalla.appendText(boton.getText());
    }

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