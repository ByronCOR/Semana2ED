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

public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try (FileWriter escribir = new FileWriter("eucalipto.txt",true);) {
            escribir.write("hola mundo\n");
            //escribir.append("EJEMPLO2\n").append("HOLA\n");
            escribir.close();
            System.out.println("El archivo se ha escrito");

        } catch (IOException e) {
            System.out.println("Error de escritura");
        }
        
        //leer el archivo
        System.out.println("Leemos el archivo");
                try (FileReader leer = new FileReader("eucalipto.txt");) {
                    int i;
                    while((i=leer.read())!=-1){
            System.out.print((char)i);
                    }
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
                File flujo = new File("eucalipto.txt");
                System.out.println("Longitud del archivo: "+flujo.length());
    }
}
