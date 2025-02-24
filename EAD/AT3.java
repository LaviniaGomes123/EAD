package EAD;
//Solicite 6 números ao usuário, armazene em uma lista e calcule a média dos valores.
import java.util.ArrayList;
import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando uma lista para armazenar os números
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i =1; i<=6;i++){
            System.out.println("Digite o " +i+ "º numero: ");
            int numero = sc.nextInt();
            numeros.add(numero);

        }

        System.out.println("Os numeros digitados foram: ");
        for (int num : numeros){
            System.out.println(num);
        }

        int soma = 0;
        int media =0 ;
        for (int num : numeros) {
            soma += num;
            media = soma / 6;
        }
        System.out.println(" a media de todos os numeros é: " + media);
    }
}
