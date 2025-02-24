package EAD;
//Crie uma lista com 10 números aleatórios entre 1 e 100 e exiba o maior e o menor número da lista.
import java.util.ArrayList;
import java.util.Random;

public class AT4 {
    public static void main(String[] args) {
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

        // Encontrando o maior e o menor número
        int maior = numeros.get(0);
        int menor = numeros.get(0);

        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        // Exibindo o maior e o menor número
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}

