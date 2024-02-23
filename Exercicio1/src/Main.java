import java.util.Scanner;
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int number = scanner.nextInt();
        if(number >= 0 )
            System.out.println("Positivo");
        else
            System.out.println("Negativo");

        scanner.close();
    }
}