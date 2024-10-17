package VerificaParOuImpar;
import java.util.Scanner;

public class VerificaParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
