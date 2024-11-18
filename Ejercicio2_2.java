import java.util.*;
public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextInt();

        System.out.println("Ingrese su categoria");
        System.out.println("[1] Estudiante\n[2] Adulto\n[3] Jubilado");
        int categoria = sc.nextInt();

        double desE = 0.10, desA = 0.05, desJ = 0.15;
        boolean bol = true;
        double precioFinal = 0;
        while (bol) {
            if (categoria == 1 || categoria == 2 || categoria == 3) {
                System.out.println("Perfecto");
                bol = false;
            } else {
                System.out.println("Ingrese su categoria");
                categoria = sc.nextInt();
            }
        }

        if (categoria == 1) {
            precioFinal = precio - precio*desE;
        } else if (categoria == 2) {
            precioFinal = precio - precio*desA;
        } else {
            precioFinal = precio - precio*desJ;
        }

        System.out.println("El producto de " + precio + " con su descuento queda en: " + precioFinal);




    }

}