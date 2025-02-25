package Listas_Matrizes_ForEach;

import java.util.Scanner;

public class AT16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho N para a matriz identidade: ");
        int N = sc.nextInt();
        int [][] matriz = new int[N][N];  // Cria a matriz identidade de tamanho N x N

        /* Preencher a matriz com 1s na diagonal principal
        (onde o índice da linha é igual ao da coluna) e 0s nos outros lugares. */
        for (int linha = 0; linha < N; linha++) {
            for (int coluna = 0; coluna < N; coluna++) {
                if (linha == coluna) {
                    matriz[linha][coluna] = 1; // Diagonal principal
                } else {
                    matriz[linha][coluna] = 0; // Fora da diagonal
                }
            }
        }

                //loop é responsável por imprimir a matriz identidade após ela ter sido preenchida.
                for (int i = 0; i < N; i++) { //  percorre todas as linhas da matriz
                    for (int j = 0; j < N; j++) { // percorre todas as colunas
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();  // Nova linha após cada linha da matriz

                    sc.close();
        }
    }
}
