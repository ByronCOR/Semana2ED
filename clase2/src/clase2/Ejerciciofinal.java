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
import java.util.Scanner;

public class Ejerciciofinal {
// BUFFERING CRACTERES

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        try (BufferedWriter bd = new BufferedWriter(new FileWriter("Registronom.txt", true));) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Escriba su nombre");
                String name = entrada.nextLine();
                System.out.println("Escriba su edad");
                int age = entrada.nextInt();
                entrada.nextLine();
                bd.write(i + ".Nombre: " + name + "  ");
                bd.write("Edad: " + age + "\n");
            }
            bd.close();
            System.out.println("Se ha escrito en el archivo");
        } catch (IOException e) {
            System.out.println("Error de escribir archivo");
        }

        //leer el archivo
        System.out.println("Leemos el archivo");
        try (BufferedReader br = new BufferedReader(new FileReader("Registronom.txt"));) {
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
