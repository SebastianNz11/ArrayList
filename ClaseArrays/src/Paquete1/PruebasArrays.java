package Paquete1;

import java.util.Scanner;
import java.util.Scanner;

public class PruebasArrays {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int numeros = 64;
        int tablero[][] = new int[8][8];
        boolean ruta = true;

        for (int i = 0; i < tablero.length; i++) {

            if (ruta) {
                for (int j = tablero[i].length - 1; j >= 0; j--) {

                    tablero[i][j] = numeros;
                    numeros--;

                }
                ruta = false;
            } else {
                for (int j = 0; j < tablero[i].length; j++) {

                    tablero[i][j] = numeros;
                    numeros--;

                }
                ruta = true;
            }

        }

        //imprimir
        for (int i = 0; i < tablero.length; i++) {
            System.out.println("-------------------------------------------------");
            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] >= 10) {
                    System.out.print("|   " + tablero[i][j]);
                } else {
                    System.out.print("|    " + tablero[i][j]);

                }

            }
            System.out.print("|");
            System.out.println("");

        }
    }
}
