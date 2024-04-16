/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

/**
 *
 * @author utpl
 */
import java.io.File;

import java.io.IOException;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            File entrada = new File("gato.txt");
            if (entrada.createNewFile()) {
                System.out.println("Archivo creado:" + entrada.getName());
                System.out.println("Archivo creado:" + entrada.getPath());
            } else {
                System.out.println("El archivo ya existe");
                System.out.println("Archivo creado:" + entrada.getPath());
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
