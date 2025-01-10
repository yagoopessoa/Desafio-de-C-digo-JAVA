import java.util.Locale;
import java.util.Scanner;


public class Multiplicação {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int A, B, PROD;

        System.out.println("Digite o valor de A: "); //recebendo o valor de A
        A = scanner.nextInt();
        System.out.println("Digite o valor de B: "); //recebendo o valor de B
        B = scanner.nextInt();

        PROD = A * B;
        System.out.println("Resultado de  " + A + "*" + B + " é igual a: " + PROD);

        scanner.close();
        

    }
}