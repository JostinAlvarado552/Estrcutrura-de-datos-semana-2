/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author SALA A
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la palabra a comprobar: ");
        palabra = entrada.nextLine();
        String palabrainvertida = invertirpalabra(palabra);
        if (palabra.equals(palabrainvertida)) {
            System.out.println("Si es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }

    public static String invertirpalabra(String palabra) {

        if (palabra.length() == 1) {
            return palabra;
        } else {
            return invertirpalabra(palabra.substring(1)) + palabra.charAt(0);
        }

    }

}
