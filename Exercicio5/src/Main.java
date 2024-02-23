import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============CARDÁPIO==============");
        System.out.println("1 - Cachorro Quente   R$ 4,00");
        System.out.println("2 - X-Salada          R$ 4,50");
        System.out.println("3 - X - Bacon         R$ 5,00");
        System.out.println("4 - Torrada Simples   R$ 2,00");
        System.out.println("5 - Refrigerante      R$ 1,50");

        System.out.print("Digite o código do produto: ");
        int code = scanner.nextInt();
        System.out.print("Digite a quantidade: ");
        int qtd = scanner.nextInt();
        double total = 0;

        switch (code){
            case 1:
                total = 4.00 * qtd;
                break;
            case 2:
                total = 4.50 * qtd;
                break;
            case 3:
                total = 5.00 * qtd;
                break;
            case 4:
                total = 2.00 * qtd;
                break;
            case 5:
                total = 1.50 * qtd;
                break;
            default:
                System.out.println("Código inválido");
        }
        System.out.printf("Total = %.2f", total);
        scanner.close();
    }
}