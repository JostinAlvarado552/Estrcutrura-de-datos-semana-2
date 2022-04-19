/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SALA H
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File file = new File("C:\\Users\\SALA A\\Desktop\\a\\estudiantes.txt");
            if (file.createNewFile()) {
                System.out.println("archivo creado: " + file.getName());
            } else {
                System.out.println("archivo ya creado");
            }

        } catch (IOException e) {
            System.out.println("eror");

        }
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\SALA A\\Desktop\\a\\estudiantes.txt");
            myWriter.write("ajsdhasdjhkahsd kjhfaldf");
            myWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("eror");
        }
        System.out.println("leemos el archivo");
        try {
            FileReader myReader = new FileReader("C:\\Users\\SALA A\\Desktop\\a\\estudiantes.txt");
            int i;
            while ((i = myReader.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("eror de lectura");
        }
    }
}
