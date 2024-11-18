import java.util.Scanner;

public class RecomendacionActividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cómo te sientes?");
        System.out.println("[1] feliz\n[2] triste\n[3] enérgico\n[4] relajado");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("¡bien! ¿Qué tal si disfrutas de un paseo al aire libre o pasas tiempo con amigos?");
                break;
            case 2:
                System.out.println("Lo siento. ¿Qué tal si ves una película que te guste o hablas con alguien cercano?");
                break;
            case 3:
                System.out.println("¡Genial! ¿Qué tal si haces ejercicio o trabajas en un proyecto que te apasione?");
                break;
            case 4:
                System.out.println("¡Bien! ¿Qué tal si lees un libro o practicas meditación?");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
    }
}
