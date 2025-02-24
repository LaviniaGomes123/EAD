package EAD;
//Crie um programa que solicite 5 números ao usuário e os armazene em uma lista. Depois, exiba os números digitados.
import java.util.Scanner;
import java.util.ArrayList;

public class AT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando uma lista para armazenar os números
        ArrayList<Integer> numeros = new ArrayList<>();

        // Solicitando 5 números ao usuário e adicionando na lista
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }

                // Exibindo os números digitados
        System.out.println("Os números digitados foram:");
                for (int num : numeros) {
                    System.out.println(num);
                }

        sc.close();
    }
}