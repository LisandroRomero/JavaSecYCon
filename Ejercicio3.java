import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione su nivel de condición fisica: ");
        System.out.println("[1] Principiante\n[2] Intermedio\n[3] Avanzado");
        int opcion = sc.nextInt();

        String rutina = "";
        switch (opcion) {
            case 1:
                rutina = "Rutina para Principiantes:\n" +
                        "1. Caminar 30 minutos, 3 veces por semana.\n" +
                        "2. Ejercicios de estiramiento diarios (10 minutos).\n" +
                        "3. Sentadillas: 2 series de 10 repeticiones.\n" +
                        "4. Flexiones de brazos: 2 series de 10 repeticiones.\n" +
                        "5. Abdominales: 2 series de 15 repeticiones.";
                System.out.println(rutina);
                break;
            case 2:
                rutina = "Rutina para Intermedios:\n" +
                        "1. Correr 30 minutos, 3 veces por semana.\n" +
                        "2. Ejercicios de fuerza:\n" +
                        "   - Pesas: 3 series de 12 repeticiones.\n" +
                        "   - Flexiones de brazos: 3 series de 15 repeticiones.\n" +
                        "   - Abdominales: 3 series de 20 repeticiones.\n" +
                        "3. Nadar 20 minutos, 2 veces por semana.\n" +
                        "4. Ejercicios de estiramiento diarios (15 minutos).";
                System.out.println(rutina);
                break;
                case 3:
                rutina = "Rutina para Avanzados:\n" +
                        "1. Correr 45 minutos, 4 veces por semana.\n" +
                        "2. Ejercicios de fuerza:\n" +
                        "   - Pesas: 4 series de 15 repeticiones.\n" +
                        "   - Flexiones de brazos: 4 series de 20 repeticiones.\n" +
                        "   - Abdominales: 4 series de 25 repeticiones.\n" +
                        "   - Sentadillas con pesas: 4 series de 15 repeticiones.\n" +
                        "3. Nadar 30 minutos, 3 veces por semana.\n" +
                        "4. Andar en bicicleta 45 minutos, 2 veces por semana.\n" +
                        "5. Ejercicios de estiramiento diarios (20 minutos).";
                System.out.println(rutina);
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    }