package EAD;
import java.util.Scanner;
public class AT12 {



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

            // Calculando a soma de todos os elementos da matriz
            int soma = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    soma += matriz[i][j]; // Adiciona o valor de cada elemento da matriz à soma
                }
            }

            // Exibindo o resultado da soma
            System.out.println("\nA soma de todos os elementos da matriz é: " + soma);


            scanner.close();
        }
    }


