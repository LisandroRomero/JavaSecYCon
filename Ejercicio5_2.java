import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numSistema = rand.nextInt(3) + 1;
        String Sistema;

        if (numSistema == 1) {
            Sistema = "Papel";
        } else if (numSistema == 2) {
            Sistema = "Piedra";
        } else {
            Sistema = "Tijeras";
        }
        System.out.println("Seleccione: ");
        System.out.println("[1] Papel\n[2] Piedra\n[3] Tijeras");
        int selec = sc.nextInt();

        if ((selec == 1 && numSistema == 2)||(selec == 2 && numSistema == 3)||(selec == 3 && numSistema == 1)) {
            System.out.println("El sistema eligió " + Sistema);
            System.out.println("Ganaste!!");
        } else if ((selec == 1 && numSistema == 1)||(selec == 2 && numSistema == 2)||(selec == 3 && numSistema == 3)){
            System.out.println("El sistema eligió " + Sistema);
            System.out.println("Empate");
        } else {
            System.out.println("El sistema eligió " + Sistema);
            System.out.println("Perdiste, suerte la proxima");
        }

    }
}
