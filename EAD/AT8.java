package EAD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class AT8 {



        public static void main(String[] args) {
            // Criando um objeto Scanner para capturar a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Criando uma lista para armazenar os nomes
            ArrayList<String> nomes = new ArrayList<>();

            // Solicitando 5 nomes ao usuário e adicionando na lista
            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + i + "º nome: ");
                String nome = scanner.nextLine();
                nomes.add(nome);
            }

            // Exibindo os nomes originais
            System.out.println("\nNomes inseridos:");
            for (String nome : nomes) {
                System.out.println(nome);
            }

            // Ordenando os nomes em ordem alfabética
            Collections.sort(nomes);

            // Exibindo os nomes ordenados em ordem alfabética
            System.out.println("\nNomes ordenados em ordem alfabética:");
            for (String nome : nomes) {
                System.out.println(nome);
            }


            scanner.close();
        }
    }


