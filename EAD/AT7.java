package EAD;
//Solicite 8 números ao usuário, armazene em uma lista e exiba os números ordenados em ordem crescente.
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class AT7 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Criando uma lista para armazenar os números
        ArrayList<Integer> numeros = new ArrayList<>();

        // Solicitando 8 números ao usuário e adicionando na lista
        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        // Exibindo os números originais
        System.out.println("\nNúmeros inseridos:");
        for (int num : numeros) {
            System.out.println(num);
        }

        // Ordenando os números em ordem crescente
        Collections.sort(numeros);

        // Exibindo os números ordenados
        System.out.println("\nNúmeros ordenados em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }


        scanner.close();
    }
}



