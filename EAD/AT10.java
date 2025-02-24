package EAD;
import java.util.ArrayList;
import java.util.Scanner;
public class AT10 {



        public static void main(String[] args) {
            // Criando um objeto Scanner para capturar a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Criando duas listas para armazenar os números
            ArrayList<Integer> lista1 = new ArrayList<>();
            ArrayList<Integer> lista2 = new ArrayList<>();

            // Solicitando 5 números para a primeira lista
            System.out.println("Digite 5 números para a primeira lista:");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int numero = scanner.nextInt();
                lista1.add(numero);
            }

            // Solicitando 5 números para a segunda lista
            System.out.println("\nDigite 5 números para a segunda lista:");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int numero = scanner.nextInt();
                lista2.add(numero);
            }

            // Criando a terceira lista que será a junção das duas listas
            ArrayList<Integer> lista3 = new ArrayList<>(lista1);  // Inicializando com os elementos de lista1
            lista3.addAll(lista2);  // Adicionando os elementos de lista2

            // Exibindo as três listas
            System.out.println("\nPrimeira lista:");
            for (int num : lista1) {
                System.out.println(num);
            }

            System.out.println("\nSegunda lista:");
            for (int num : lista2) {
                System.out.println(num);
            }

            System.out.println("\nTerceira lista (junção das duas):");
            for (int num : lista3) {
                System.out.println(num);
            }


            scanner.close();
        }
    }


