import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione su estado de animo: ");
        System.out.println("[1] Feliz\n[2] Triste\n[3] Enérgico\n[4] Relajado");
        int opcion = sc.nextInt();

        String list = "";
        switch (opcion) {
            case 1:
                list = "Lista de canciones para cuando estás Feliz:\n" +
                        "1. Happy - Pharrell Williams\n" +
                        "2. Don't Stop Me Now - Queen\n" +
                        "3. La Renga - El Final es en donde Partí\n" +
                        "4. Soda Stereo - De Música Ligera";
                System.out.println(list);
                break;
            case 2:
                list = "Lista de canciones para cuando estás Triste:\n" +
                        "1. Someone Like You - Adele\n" +
                        "2. Fix You - Coldplay\n" +
                        "3. Soda Stereo - Cuando Pase el Temblor\n" +
                        "4. Los Piojos - Mariposa Pontiac";
                System.out.println(list);
                break;
            case 3:
                list = "Lista de canciones para cuando estás Enérgico:\n" +
                        "1. Eye of the Tiger - Survivor\n" +
                        "2. Titanium - David Guetta ft. Sia\n" +
                        "3. Los Redondos - Ji Ji Ji\n" +
                        "4. La Renga - El Río Está Hablando";
                System.out.println(list);
                break;
            case 4:
                list = "Lista de canciones para cuando estás Relajado:\n" +
                        "1. Weightless - Marconi Union\n" +
                        "2. Clair de Lune - Claude Debussy\n" +
                        "3. Soda Stereo - En la Ciudad de la Furia\n" +
                        "4. Los Piojos - El Farolito";
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    }