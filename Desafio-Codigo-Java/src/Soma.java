import java.util.Locale;
import java.util.Scanner;

public class Soma { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, soma;

        System.out.println("Digite o valor de A: "); //recebendo o valor de A
        A = scanner.nextInt();
        System.out.println("Digite o valor de B: "); //recebendo o valor de B
        B = scanner.nextInt();

        soma = A + B;
        System.out.println("Resultado de  " + A + "+" + B + " é igual a: " + soma);

        scanner.close();
    }
    
}
