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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try (FileWriter escribir = new FileWriter("eucalipto.txt");) {
            escribir.write("que tal");
            escribir.close();
            System.out.println("El archivo se ha escrito");

        } catch (IOException e) {
            System.out.println("Error de escritura");
        }
        
        System.out.println("Leemos el archivo");
                try (FileReader leer = new FileReader("eucalipto.txt");) {
                    int i;
                    while((i=leer.read())!=-1){
            System.out.print((char)i);
                    }
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}