import java.util.Scanner;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double value = scanner.nextDouble();

        if (value < 0.0 || value > 100)
            System.out.println("Fora de intervalo");
        else if(value <= 25.0)
            System.out.println("Intervalo[0,25]");
        else if(value <= 50.0)
            System.out.println("Intervalo[25,50]");
        else if(value <= 75.0)
            System.out.println("Intervalo[50,75]");
        else
            System.out.println("Intervalo[75,100]");


        scanner.close();
    }
}