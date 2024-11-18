import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        String[] peliculasAccion = {"John Wick", "Mad Max: Fury Road", "Die Hard"};
        String[] peliculasComedia = {"Superbad", "The Hangover", "Bridesmaids"};
        String[] peliculasDrama = {"The Shawshank Redemption", "Forrest Gump", "The Pursuit of Happyness"};
        String[] peliculasFiccion = {"Interstellar", "Blade Runner 2049", "The Matrix"};

        System.out.println("Cual es su genero de peliculas favorito?");
        System.out.println("[1] Acción\n[2] Comedia\n[3] Drama\n[4] Ciencia Ficción");

        switch (validar()) {
            case 1:
                System.out.println("Peliculas recomendadas:\n" + String.join(", ", peliculasAccion));
                break;
            case 2:
                System.out.println("Peliculas recomendadas:\n" + String.join(", ", peliculasComedia));
                break;
            case 3:
                System.out.println("Peliculas recomendadas:\n" + String.join(", ", peliculasDrama));
                break;
            case 4:
                System.out.println("Peliculas recomendadas:\n" + String.join(", ", peliculasFiccion));
                break;
        }


    }
    public static int validar () {
        Scanner sc = new Scanner(System.in);
        int seleccion = sc.nextInt();

        if (seleccion == 1 || seleccion == 2 || seleccion == 3 || seleccion == 4) {
            return seleccion;
        } else {
            System.out.println("Opcion incorrecta");;
            return 0;
        }
    }
}