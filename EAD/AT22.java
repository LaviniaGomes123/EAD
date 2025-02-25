package Listas_Matrizes_ForEach;
import java.util.Arrays;
import java.util.List;

public class AT22 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        int soma = 0;

        for (int num : lista) {
            soma += num;
        }

        System.out.println("Soma de todos os elementos: " + soma);
    }
}
