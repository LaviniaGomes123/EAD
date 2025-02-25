package Listas_Matrizes_ForEach;
import java.util.Arrays;
import java.util.List;

public class AT24 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (int num : lista) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}

