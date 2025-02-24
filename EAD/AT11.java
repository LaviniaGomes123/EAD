package EAD;
import java.util.Scanner;
public class AT11 {
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

            // Exibindo a matriz no formato 3x3
            System.out.println("\nMatriz 3x3 preenchida:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + "\t"); // Exibe cada número com espaçamento
                }
                System.out.println(); // Quebra de linha após cada linha da matriz
            }


            scanner.close();
        }
    }


