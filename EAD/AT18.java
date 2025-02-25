package Listas_Matrizes_ForEach;

import java.util.Scanner;
import java.util.Random;

public class AT18 {
    public static void main(String[] args) {

        Random gerador = new Random();

                int[][] matriz = new int[4][4];

                int soma = 0;
                int totalElementos = matriz.length * matriz[0].length;

                // Preencher a matriz com números aleatórios e calcular a soma
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        matriz[i][j] = gerador.nextInt(100); // Valores aleatórios entre 0 e 99
                        soma += matriz[i][j];
                    }
                }

                // Calcular a média
                double media = soma / (double) totalElementos;

                // Exibir a matriz
                System.out.println("Matriz 4x4:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }

                // Exibir a média
                System.out.println("A média dos elementos da matriz é: " + media);
            }
        }
