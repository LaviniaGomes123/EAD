package Listas_Matrizes_ForEach;
import java.util.Arrays;
import java.util.List;

public class AT25 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Maria", "José");

        for (String nome : nomes) {
            System.out.println("Olá, " + nome + "!");
        }
    }
}

