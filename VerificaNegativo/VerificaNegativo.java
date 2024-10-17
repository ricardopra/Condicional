package VerificaNegativo;
import java.util.Scanner;

public class VerificaNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        // Verifica se o número é negativo ou não
        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }
}
