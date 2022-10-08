/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int matriz[][] = new int[3][5];

        System.out.println("Ingrese 15 numeros");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese un numero: ");
                matriz[i][j] = en.nextInt();

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }

    }
}
