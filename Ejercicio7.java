import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Responda con numeros del 1 al 10");
        String[] escalas = {"Satisfaccion con la vida", "Estres", "Salud"};
        double sum = 0;
        for (int i = 0; i < escalas.length; i++) {
            System.out.println("En escalas de " + escalas[i] + " como se ecuentra ahora? [1-10]");
            sum += validar();
        }
        System.out.printf("En promedio, su indice de felicidad es de: %.2f%n", sum/escalas.length);


    }

    public static double validar(){
        Scanner sc = new Scanner(System.in);
        boolean valido = true;
        double num = 0;
        while(valido){
            System.out.println("Introduzca un numero del 1 al 10");
            num = sc.nextInt();
            if (num >= 1 && num <= 10){
                valido = false;
            }
        }
        return num;
    }
    }