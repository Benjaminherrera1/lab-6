package lab.lab4;

import java.util.*;

public class Lab4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Enano enano = new Enano("Tolkien", "Gimli", "Enano", "Hacha de Guerra", 0, 20);
        Elfo elfo = new Elfo("Valinor", "Aragorn", "Elfo", "Espada de Mithril", 0, 30);
        Hombre hombre = new Hombre("Nobleza", "Danath", "Humano", "Espada Narsil ", 0, 25);

        int round = 0, var1, var2 = 0;
        int personaje1 = 0, personaje2 = 0;

        do {
            try {
                var1 = 1;
                System.out.println("");
                System.out.println("Bienvenido.");
                System.out.println("Seleccione un Personaje: ");
                System.out.println("1.Humano");
                System.out.println("2.Enano");
                System.out.println("3.Elfo");
                personaje1 = leer.nextInt();

            } catch (InputMismatchException exep1) {
                leer.nextLine();
                System.out.println("");
                System.out.println("ERROR, Ingrese un valor correcto personaje.");
                var1 = 0;
            }

        } while (var1 == 0);

        if (personaje1 == 1) {
            System.out.println("");
            System.out.println("Has Seleccionado a los Humanos ");
            hombre.Historia();
            hombre.SuperBono();
        }
        if (personaje1 == 2) {
            System.out.println("");
            System.out.println("Has Seleccionado a los Enanos ");
            enano.Historia();
            enano.AumentoVida();

        }
        if (personaje1 == 3) {
            System.out.println("");
            System.out.println("Has Seleccionado a los Elfos ");
            elfo.Historia();
            elfo.QuitaVida();
        }
        do {
            do {
                try {
                    var2 = 1;
                    System.out.println("");
                    System.out.println("seleccione personaje: ");
                    System.out.println("1.Humano");
                    System.out.println("2.Enano");
                    System.out.println("3.Elfo");
                    personaje2 = leer.nextInt();

                } catch (InputMismatchException exep2) {
                    leer.nextLine();
                    System.out.println("");
                    System.out.println("ERROR, Ingrese un valor correcto personaje.");
                    var2 = 0;

                }
            } while (var2 == 0);
            if (personaje2 == 1) {
                System.out.println("");
                System.out.println("Has Seleccionado a los Humanos ");

            }
            if (personaje2 == 2) {
                System.out.println("");
                System.out.println("Has seleccionado a los Enanos ");

            }
            if (personaje2 == 3) {
                System.out.println("");
                System.out.println("Has seleccionado a los Elfos ");

            }
            if (personaje2 == personaje1) {
                System.out.println("");
                System.out.println("ERROR, por favor seleccione otro personaje o corrija su respuesta.");
                personaje2 = personaje1;
            }
        } while (personaje2 == personaje1);
////////////////////////////////////////humano vs enano
        if (personaje1 == 1 && personaje2 == 2) {
            while (round < 11) {
                System.out.println("");
                System.out.println(("Pelea " + (round + 1)) + ":");
                System.out.println("La vida del hombre es: " + hombre.getVida() + " y su daño es: " + hombre.getDaño());
                System.out.println("La vida del enano es: " + enano.getVida() + " y su daño es: " + enano.getDaño());
                hombre.setVida(hombre.getVida() - enano.getDaño());
                enano.setVida(enano.getVida() - hombre.getDaño());
                hombre.setDaño(hombre.getDaño() - 1);
                System.out.println("");
                System.out.println("Hombre le quita " + hombre.getDaño() + " puntos de daño a Enano. Vida actual Enano " + enano.getVida());
                System.out.println("Enano le quita " + enano.getDaño() + " puntos de daño a Hombre. Vida actual Hombre " + hombre.getVida());
                if (hombre.getVida() <= 0 || enano.getVida() <= 0) {
                    break;
                }
                round++;
            }
            if (hombre.getVida() > enano.getVida()) {
                System.out.println("");
                System.out.println("Hombre ah Ganado");
                hombre.Historia();

            } else if (enano.getVida() > hombre.getVida()) {
                System.out.println("");
                System.out.println("Enano ah Ganado");
                hombre.Derrota();
            }

        }
        ////////////////////////////////////////humano vs elfo
        if (personaje1 == 1 && personaje2 == 3) {
            while (round < 11) {

                System.out.println("");
                System.out.println(("Pelea " + (round + 1)) + ":");
                System.out.println("La vida del hombre es: " + hombre.getVida() + " y su daño es: " + hombre.getDaño());
                System.out.println("La vida del elfo es: " + elfo.getVida() + " y su daño es: " + elfo.getDaño());
                hombre.setVida(hombre.getVida() - elfo.getDaño());
                elfo.setVida(elfo.getVida() - hombre.getDaño());
                hombre.setDaño(hombre.getDaño() - 1);
                System.out.println("");
                System.out.println("Hombre le quita " + hombre.getDaño() + " puntos de daño a Elfo. Vida actual Elfo " + elfo.getVida());
                System.out.println("Elfo le quita " + elfo.getDaño() + " puntos de daño a Hombre. Vida actual Hombre " + hombre.getVida());
                if (hombre.getVida() <= 0 || elfo.getVida() <= 0) {
                    break;
                }
                round++;
            }
            if (hombre.getVida() > elfo.getVida()) {
                System.out.println("");
                System.out.println("Hombre ah Ganado");
                hombre.Historia();

            } else if (elfo.getVida() > hombre.getVida()) {
                System.out.println("");
                System.out.println("Elfo ah Ganado");
                hombre.Derrota();
            }
////////////////////////////////////////enano vs humano
        }
        if (personaje1 == 2 && personaje2 == 1) {
            while (round < 11) {

                System.out.println("");
                System.out.println(("Pelea " + (round + 1)) + ":");
                System.out.println("La vida del enano es: " + enano.getVida() + " y su daño es: " + enano.getDaño());
                System.out.println("La vida del hombre es: " + hombre.getVida() + " y su daño es: " + hombre.getDaño());
                enano.setVida(enano.getVida() - hombre.getDaño());
                hombre.setVida(hombre.getVida() - enano.getDaño());
                System.out.println("");
                System.out.println("Enano le quita " + enano.getDaño() + " puntos de daño a Hombre. Vida actual Hombre " + hombre.getVida());
                System.out.println("Hombre le quita " + hombre.getDaño() + " puntos de daño a Enano. Vida actual Enano " + enano.getVida());
                if (enano.getVida() <= 0 || hombre.getVida() <= 0) {
                    break;
                }
                round++;
            }
            if (enano.getVida() > hombre.getVida()) {
                System.out.println("");
                System.out.println("Enano ah Ganado");
                enano.Historia();

            } else if (hombre.getVida() > enano.getVida()) {
                System.out.println("");
                System.out.println("Hombre ah Ganado");
                enano.Derrota();
            }

        }
        //////////////////////////////////////// enano vs elfo
        if (personaje1 == 2 && personaje2 == 3) {
            while (round < 11) {

                System.out.println("");
                System.out.println(("Pelea " + (round + 1)) + ":");
                System.out.println("La vida del enano es: " + enano.getVida() + " y su daño es: " + enano.getDaño());
                System.out.println("La vida del elfo es: " + elfo.getVida() + " y su daño es: " + elfo.getDaño());
                enano.setVida(enano.getVida() - elfo.getDaño());
                elfo.setVida(elfo.getVida() - enano.getDaño());
                System.out.println("");
                System.out.println("Enano le quita " + enano.getDaño() + " puntos de daño a Elfo. Vida actual Elfo " + elfo.getVida());
                System.out.println("Elfo le quita " + elfo.getDaño() + " puntos de daño a Enano. Vida actual Enano " + enano.getVida());
                if (enano.getVida() <= 0 || elfo.getVida() <= 0) {
                    break;
                }
                round++;
            }
            if (enano.getVida() > elfo.getVida()) {
                System.out.println("");
                System.out.println("Enano ah Ganado");
                enano.Historia();

            } else if (elfo.getVida() > enano.getVida()) {
                System.out.println("");
                System.out.println("Elfo ah ganado");
                enano.Derrota();
            }

        }
        //////////////////////////////////////// elfo vs humano
        if (personaje1 == 3 && personaje2 == 1) {
            while (round < 11) {
                System.out.println("");
                System.out.println(("Pelea " + (round + 1)) + ":");
                System.out.println("La vida del elfo es: " + elfo.getVida() + " y su daño es: " + elfo.getDaño());
                System.out.println("La vida del hombre es: " + hombre.getVida() + " y su daño es: " + hombre.getDaño());
                elfo.setVida(elfo.getVida() - hombre.getDaño());
                hombre.setVida(hombre.getVida() - elfo.getDaño());
                System.out.println("");
                System.out.println("Elfo le quita " + elfo.getDaño() + " puntos de daño a Enano. Vida actual Hombre " + hombre.getVida());
                System.out.println("Hombre le quita " + hombre.getDaño() + " puntos de daño a Elfo. Vida actual Elfo " + elfo.getVida());
                if (elfo.getVida() <= 0 || hombre.getVida() <= 0) {
                    break;
                }
                round++;
            }
            if (elfo.getVida() > hombre.getVida()) {
                System.out.println("");
                System.out.println("Elfo ah Ganado");
                elfo.Historia();

            } else if (hombre.getVida() > elfo.getVida()) {
                System.out.println("");
                System.out.println("Hombre ah Ganado");
                elfo.Derrota();
            }

        }
        //////////////////////////////////////// elfo vs enano
        if (personaje1 == 3 && personaje2 == 2) {
            while (round < 10) {

                System.out.println("");
                System.out.println(("Pelea " + (round + 1)) + ":");
                System.out.println("La vida del elfo es: " + elfo.getVida() + " y su daño es: " + elfo.getDaño());
                System.out.println("La vida del enano es: " + enano.getVida() + " y su daño es: " + enano.getDaño());
                elfo.setVida(elfo.getVida() - enano.getDaño());
                enano.setVida(enano.getVida() - elfo.getDaño());
                System.out.println("");
                System.out.println("Elfo le quita " + elfo.getDaño() + " puntos de daño a Enano. Vida actual Enano " + enano.getVida());
                System.out.println("Enano le quita " + enano.getDaño() + " puntos de daño a Elfo. Vida actual Elfo " + elfo.getVida());
                if (elfo.getVida() <= 0 || enano.getVida() <= 0) {
                    break;
                }
                round++;
            }
            if (elfo.getVida() > enano.getVida()) {
                System.out.println("");
                System.out.println("Elfo ah Ganado");
                elfo.Historia();

            } else if (enano.getVida() > elfo.getVida()) {
                System.out.println("");
                System.out.println("Enano ah Ganado");
                elfo.Derrota();
            }

        }

    }

}
