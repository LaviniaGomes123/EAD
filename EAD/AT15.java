package EAD;
import java.util.Scanner;
public class AT15 {
        public static void main(String[] args) {
            // Criando um objeto Scanner para capturar a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Criando uma matriz 3x3
            int[][] matriz = new int[3][3];

            // Solicitando ao usuário para preencher a matriz
            System.out.println("Preencha a matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Digite o número para a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // Calculando a soma dos elementos da diagonal secundária
            int somaDiagonalSecundaria = 0;
            for (int i = 0; i < 3; i++) {
                somaDiagonalSecundaria += matriz[i][2 - i]; // Elementos da diagonal secundária são [i][2-i]
            }

            // Exibindo o resultado da soma
            System.out.println("\nA soma dos elementos da diagonal secundária é: " + somaDiagonalSecundaria);

            // Fechando o scanner
            scanner.close();
        }
    }


