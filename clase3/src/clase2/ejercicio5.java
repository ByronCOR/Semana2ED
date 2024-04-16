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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try (FileOutputStream salida = new FileOutputStream("gato.txt", true);) {
            String data = "hola gato\n";
            byte b[] = data.getBytes();
            salida.write(b);
            salida.close();
            System.out.println("Se ha escrito en el archivo");
        } catch (IOException e) {
            System.out.println("Error de escritura");
        }

        //leer el archivo
        System.out.println("Leemos el archivo");
        try (FileInputStream entrada = new FileInputStream("gato.txt");) {
            int i;
            while ((i = entrada.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }

    }
}
