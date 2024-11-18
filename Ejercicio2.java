import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double calCorrer = 12;
       double calNadar = 10;
       double calBici = 10;
       double calQuemadas = 0;

        System.out.println("Por favor, introduzca su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.println("Por favor, introduzca el ejercicio: ");
        System.out.println("[1] Nadar\n[2] Correr\n[3] Andar en bicicleta");
        int opcion = sc.nextInt();

        System.out.println("Cuanto tiempo entrenó? En minutos: ");
        int duracion = sc.nextInt();
        switch (opcion) {
            case 1:
                calQuemadas = (calNadar + (0.04 * peso)) * duracion;
                System.out.println("Calorias quemadas: " + calQuemadas);
                break;
            case 2:
                calQuemadas = (calCorrer + (0.04 * peso)) * duracion;
                System.out.println("Calorias quemadas: " + calQuemadas);
                break;
            case 3:
                calQuemadas = (calBici + (0.04 * peso)) * duracion;
                System.out.println("Calorias quemadas: " + calQuemadas);
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }
    }