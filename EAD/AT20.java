package Listas_Matrizes_ForEach;

import java.util.Random;
import java.util.Scanner;

public class AT20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz4x4 = new int[4][4];
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz4x4[i][j] = scanner.nextInt();
            }
        }

        int[] somaLinhas = new int[4];
        int[] somaColunas = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                somaLinhas[i] += matriz4x4[i][j];
                somaColunas[j] += matriz4x4[i][j];
            }
        }

        System.out.println("Soma das linhas:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
        }

        System.out.println("Soma das colunas:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }
    }
}
