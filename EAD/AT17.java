package Listas_Matrizes_ForEach;

import java.util.Scanner;

public class AT17 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Criando a matriz 3x3
            int[][] matriz = new int[3][3];

            // Solicitando ao usuário os elementos da matriz
            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // Solicitando o número escalar
            System.out.print("Digite o número escalar: ");
            int escalar = scanner.nextInt();

            // Multiplicando todos os elementos da matriz pelo número escalar
            int[][] matrizResultante = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrizResultante[i][j] = matriz[i][j] * escalar;
                }
            }

            // Exibindo a matriz resultante
            System.out.println("\nMatriz resultante após multiplicação pelo número escalar:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrizResultante[i][j] + " ");
                }
                System.out.println();
            }

            scanner.close();
        }
    }

