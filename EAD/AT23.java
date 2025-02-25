package Listas_Matrizes_ForEach;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AT23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

        System.out.print("Digite o valor para multiplicar: ");
        int valor = scanner.nextInt();

        for (int num : lista) {
            System.out.println(num * valor);
        }
    }
}
