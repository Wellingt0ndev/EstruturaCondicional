import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hora inicial do jogo: ");
        int horaInicial = scanner.nextInt();
        System.out.print("Hora final do jogo: ");
        int horaFinal = scanner.nextInt();
        int horaTotal = 0;
        if(horaInicial < horaFinal){
            horaTotal = horaFinal - horaInicial;
        }else{
            horaTotal = 24 - horaInicial + horaFinal;
        }
        System.out.printf("O jogo durou %d hora(s)", horaTotal);

        scanner.close();
    }
}