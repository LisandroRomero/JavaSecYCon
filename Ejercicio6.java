import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] materias = {"Matemáticas", "Fisica", "Inglés", "Cs. Naturales"};
        System.out.println("Ingrese la cantidad de horas que puede estudiaar:");
        boolean bol = true;
        double horas = 0;
        while (bol) {
            horas = sc.nextDouble();
            if (horas < 0) {
                System.out.println("El valor de horas no puede ser negativo");
            } else if (horas == 0) {
                System.out.println("El valor de horas no puede ser 0");
            } else{
                bol = false;
            }
        }
        double horasMateria = materias.length / horas ;
        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i] + ": " + horasMateria);
        }
    }
    }