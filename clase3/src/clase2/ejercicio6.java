/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

/**
 *
 * @author utpl
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio6 {
// BUFFERING CRACTERES

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("gato2.txt", true));) {
            bw.write("ejemplo usando buff\n");
            bw.close();
            System.out.println("Se ha escrito en el archivo");
        } catch (IOException e) {
            System.out.println("Error de escribir archivo");
        }

        //leer el archivo
        System.out.println("Leemos el archivo");
        try (BufferedReader br = new BufferedReader(new FileReader("gato2.txt"));) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error en archico");
        }

    }
}
