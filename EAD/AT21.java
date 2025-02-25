package Listas_Matrizes_ForEach;
import java.util.Arrays;
import java.util.List;

public class AT21 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

        for (int num : lista) {
            System.out.println(num);
        }
    }
}
