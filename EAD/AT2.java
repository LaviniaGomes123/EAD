package EAD;
//Solicite 5 números ao usuário, armazene em uma lista e calcule a soma de todos os elementos.
import java.util.ArrayList;
import java.util.Scanner;

public class AT2 {
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

        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        // Exibindo a soma
        System.out.println("A soma de todos os números é: " + soma);

        sc.close();
    }
}
