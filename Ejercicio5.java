import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioCombustible = 1200;
        System.out.println("Ingrese la distancia del viaje en km: ");
        double distancia = sc.nextDouble();
        System.out.println("Ingrese el consumo de combustible por km en litros");
        double consumo = sc.nextDouble();

        double total = consumo * precioCombustible * distancia;
        System.out.printf("El costo del viaje será de: %.2f%n", total);
    }
    }