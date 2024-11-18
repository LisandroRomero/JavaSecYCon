import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Su IMC es: " + imc);
            System.out.println("Recomendación: Usted tiene bajo peso. Considere aumentar su ingesta calórica y consultar a un nutricionista.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Su IMC es: " + imc);
            System.out.println("Recomendación: Usted tiene un peso normal. Mantenga una dieta equilibrada y realice actividad física regularmente.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Su IMC es: " + imc);
            System.out.println("Recomendación: Usted tiene sobrepeso. Considere reducir su ingesta calórica y aumentar su actividad física.");
        } else {
            System.out.println("Su IMC es: " + imc);
            System.out.println("Recomendación: Usted tiene obesidad. Es importante que consulte a un profesional de la salud para recibir orientación adecuada.");
        }
    }
}
