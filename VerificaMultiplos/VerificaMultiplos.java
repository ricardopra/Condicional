package VerificaMultiplos;
import java.util.Scanner;

public class VerificaMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê dois valores inteiros
        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        // Verifica se A é múltiplo de B ou B é múltiplo de A
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
