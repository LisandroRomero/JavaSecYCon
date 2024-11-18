import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bol = true;
        int dia = 0;
        int mes = 0;
        while (bol) {
            System.out.println("Por favor ingrese los datos de su cumpleaños en formato DD/MM/AAAA: ");
            String fecha = sc.nextLine();

            if (fecha.matches("\\d{2}/\\d{2}/\\d{4}")){
                String[] partes = fecha.split("/");
                try {
                    dia = Integer.parseInt(partes[0]);
                    mes = Integer.parseInt(partes[1]);
                    if ((dia < 32) && (mes < 13) && (partes[2].length() == 4)) {
                        System.out.println("Fecha valida");
                        bol = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Fecha Invalida");
                }
            } else {
                System.out.println("Fecha Invalida");
            }
        }

        if ((dia >= 21 && dia <= 31 && mes == 3) || (dia >= 1 && dia <= 20 && mes == 4)){
            System.out.println("Aries: \nQuite los viejos pensamientos y costumbres vividas. Comprenda que en la vida no hay que quedarse solo con el pasado, al contrario, aprenda nuevas experiencias");
        } else if ((dia >= 21 && dia <= 30 && mes == 4) || (dia >= 1 && dia <= 21 && mes == 5)) {
            System.out.println("Tauro: \nEn caso de ver que las cosas se tornen un tanto complicadas, procure calmarse y no actuar de manera precipitada. Sea inteligente en el momento de accionar.");
        } else if ((dia >= 22 && dia <= 31 && mes == 5) || (dia >= 1 && dia <= 21 && mes == 6)) {
            System.out.println("Géminis: \nProcure abandonar sus pensamientos superficiales, de lo contrario, no podrá alcanzar los objetivos que se propuso. Intente ser más realista en la vida.");
        } else if ((dia >= 22 && dia <= 30 && mes == 6) || (dia >= 1 && dia <= 23 && mes == 7)) {
            System.out.println("Cáncer: \nEste atento, ya que su impaciencia con la que actúa podría traerle algunas consecuencias negativas.");
        } else if ((dia >= 24 && dia <= 31 && mes == 7) || (dia >= 1 && dia <= 23 && mes == 8)) {
            System.out.println("Leo: \nMomento óptimo para hacerle frente a lo que más miedo le tiene, aunque se sienta indefenso.");
        } else if ((dia >= 24 && dia <= 31 && mes == 8) || (dia >= 1 && dia <= 23 && mes == 9)) {
            System.out.println("Virgo: \nComprenda que muchas veces las decisiones precipitadas pueden llegar a ser causa de un arrepentimiento futuro.");
        } else if ((dia >= 24 && dia <= 30 && mes == 9) || (dia >= 1 && dia <= 23 && mes == 10)) {
            System.out.println("Libra: \nMomento para dejarse de inhibirse frente a los demás por miedo al desprecio.");
        } else if ((dia >= 24 && dia <= 31 && mes == 10) || (dia >= 1 && dia <= 22 && mes == 11)) {
            System.out.println("Escorpio: \nSepa que se acerca el momento para reconstruir su vida. Lo primero que tendrá que hacer es desprenderse de las malas situaciones vividas en el pasado.");
        } else if ((dia >= 23 && dia <= 31 && mes == 11) || (dia >= 1 && dia <= 22 && mes == 12)) {
            System.out.println("Sagitario: \nAproveche las buenas energías planetarias que tendrá en estos días.");
        } else if ((dia >= 23 && dia <= 31 && mes == 12) || (dia >= 1 && dia <= 20 && mes == 1)) {
            System.out.println("Capricornio: \nMomento para dejarse de inhibirse frente a los demás por miedo al desprecio. Haga lo posible para enseñarle al mundo lo que es capaz de hacer y siente.");
        } else if ((dia >= 21 && dia <= 31 && mes == 1) || (dia >= 1 && dia <= 19 && mes == 2)){
            System.out.println("Acuario: \nSi bien usted ya sabe que le cuesta, deberá aceptar con paciencia lo que esta viviendo y elaborar un nuevo plan para alcanzar sus objetivos.");
        } else if ((dia >= 20 && dia <= 31 && mes == 2) || (dia >= 1 && dia <= 20 && mes == 3)) {
            System.out.println("Piscis: \nAntes de tomar esa decisión trascendental para su vida, intente tomar las precauciones necesarias. Podría surgir algún riesgo si no actúa de forma responsable.");
        }
    }
    }