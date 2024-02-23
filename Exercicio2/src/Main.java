import java.util.Scanner;
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int number = scanner.nextInt();

        if(number % 2 == 0)
            System.out.println("PAR");
        else
            System.out.println("IMPAR");
        scanner.close();
    }
}