import java.util.Scanner;
//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Múltiplos" ou "Nao são
//Múltiplos", indicando se os valores lidos são múltiplos entre si.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

            if(a % b == 0 || b % a == 0)
                System.out.println("São Múltiplos");
            else
                System.out.println("Não são Múltiplos");

        scanner.close();
    }
}