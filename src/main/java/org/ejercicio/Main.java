package org.ejercicio;

import org.ejercicio.services.TransformWordsService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra o palabras a transformar:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = reader.readLine();
            if (input.isEmpty()) {
                System.out.println("No se ha ingresado una palabra");
                return;
            }

            long start = System.currentTimeMillis();

            String result = TransformWordsService.transform(input);
            System.out.println("El resultado es:");
            System.out.println(result);

            long end = System.currentTimeMillis();
            System.out.println("Tiempo de ejecucion: " + (end - start) + " milisegundos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}