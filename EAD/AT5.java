package EAD;
//Permita que o usuário informe um número e verifique se ele está presente na lista previamente preenchida.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AT5 {
    public static void main(String[] args) {
        // Criando um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Criando uma lista para armazenar os números
        ArrayList<Integer> numeros = new ArrayList<>();

        // Gerando 10 números aleatórios entre 1 e 100 e adicionando na lista
        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(100) + 1; // Gera números entre 1 e 100
            numeros.add(numero);
        }

        // Exibindo os números gerados
        System.out.println("Números gerados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        // Solicitando que o usuário informe um número
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para verificar se está na lista: ");
        int numeroInformado = sc.nextInt();

        // Verificando se o número está na lista
        if (numeros.contains(numeroInformado)) {
            System.out.println("O número " + numeroInformado + " está presente na lista.");
        } else {
            System.out.println("O número " + numeroInformado + " não está presente na lista.");
        }
        sc.close();
    }
}

