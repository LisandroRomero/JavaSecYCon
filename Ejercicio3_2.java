import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        String[] librosFantasia = {"El libro de los portales", "La saga de los confines", "El libro de arena"};
        String[] librosMisterio = {"El misterio de la cripta embrujada", "El laberinto de los espíritus", "El jardín de los hechizos"};
        String[] librosRomance = {"El amor en los tiempos del cólera", "Cumbres borrascosas", "Orgullo y prejuicio"};
        String[] librosCienciaFiccion = {"El eternauta", "Fiebre", "Los adioses"};

        System.out.println("Cual es su genero de libros favorito?");
        System.out.println("[1] Fantasía\n[2] Misterio\n[3] Romance\n[4] Ciencia Ficción");

        switch (validar()) {
            case 1:
                System.out.println("Libros recomendados:\n" + String.join(", ", librosFantasia));
                break;
            case 2:
                System.out.println("Libros recomendados:\n" + String.join(", ", librosMisterio));
                break;
            case 3:
                System.out.println("Libros recomendados:\n" + String.join(", ", librosRomance));
                break;
            case 4:
                System.out.println("Libros recomendados:\n" + String.join(", ", librosCienciaFiccion));
                break;
        }
    }

    public static int validar() {
        Scanner sc = new Scanner(System.in);
        int seleccion = sc.nextInt();

        if (seleccion == 1 || seleccion == 2 || seleccion == 3 || seleccion == 4) {
            sc.close();
            return seleccion;
        } else {
            System.out.println("Opcion no valida");
            sc.close();
            return -1;
        }
    }
}
