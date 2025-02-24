package EAD;
import java.util.Scanner;
public class AT13 {



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

            // Inicializando o maior número com o primeiro elemento da matriz
            int maior = matriz[0][0];

            // Percorrendo a matriz para encontrar o maior elemento
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j]; // Atualiza o maior valor encontrado
                    }
                }
            }

            // Exibindo o maior elemento encontrado
            System.out.println("\nO maior elemento da matriz é: " + maior);


            scanner.close();
        }
    }


