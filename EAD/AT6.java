package EAD;
//Crie uma lista com 10 números e remova todos os números ímpares dela.
import java.util.Random;
import java.util.Iterator;
import java.util.ArrayList;

public class AT6 {
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

        // Exibindo a lista original
        System.out.println("Lista original:");
        for (int num : numeros) {
            System.out.println(num);
        }

        // Removendo todos os números ímpares
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (numero % 2 != 0) { // Verifica se o número é ímpar
                iterator.remove(); // Remove o número ímpar
            }
        }

        // Exibindo a lista após remoção dos números ímpares
        System.out.println("\nLista após remoção dos números ímpares:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }

}



