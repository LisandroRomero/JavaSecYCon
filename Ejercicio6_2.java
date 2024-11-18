import java.util.Random;
import java.util.Scanner;

public class Ejercicio6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuántas horas al día duermes?: ");
        int horasS = sc.nextInt();

        System.out.print("Cuántas horas al día te ejercitas?: ");
        int horasE = sc.nextInt();

        System.out.print("Cuántas comidas saludables consume al día?: ");
        int comidasSalud = sc.nextInt();

        System.out.println("Evaluación de hábitos saludables:");

        if (horasS >= 7 && horasS <= 9) {
            System.out.println("Horas de sueño: Bueno");
        } else if (horasS > 9) {
            System.out.println("Horas de sueño: Excesivo");
        } else {
            System.out.println("Horas de sueño: Insuficiente");
        }

        if (horasE >= 2) {
            System.out.println("Horas de ejercicio: Bueno");
        } else {
            System.out.println("Horas de ejercicio: Insuficiente");
        }

        if (comidasSalud >= 3) {
            System.out.println("Comidas saludables: Bueno");
        } else {
            System.out.println("Comidas saludables: Insuficiente");
        }

    }
}
