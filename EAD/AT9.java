package EAD;
import java.util.ArrayList;
import java.util.Collections;
public class AT9 {
        public static void main(String[] args) {
            // Criando uma lista para armazenar os números
            ArrayList<Integer> numeros = new ArrayList<>();

            // Adicionando 7 elementos à lista
            numeros.add(10);
            numeros.add(20);
            numeros.add(30);
            numeros.add(40);
            numeros.add(50);
            numeros.add(60);
            numeros.add(70);

            // Exibindo a lista original
            System.out.println("Lista original:");
            for (int num : numeros) {
                System.out.println(num);
            }

            // Invertendo a ordem dos elementos na lista
            Collections.reverse(numeros);

            // Exibindo a lista na ordem inversa
            System.out.println("\nLista na ordem inversa:");
            for (int num : numeros) {
                System.out.println(num);
            }
        }
    }


