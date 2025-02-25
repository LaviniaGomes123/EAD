package Listas_Matrizes_ForEach;

import java.util.Arrays;
import java.util.List;

public class AT30 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(-1, 2, -3, 4, -5);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < 0) {
                lista.set(i, 0);
            }
        }

        System.out.println("Lista após substituir negativos por zero: " + lista);
    }
}

