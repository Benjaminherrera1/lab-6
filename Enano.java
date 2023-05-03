package lab.lab4;

import java.util.*;

public class Enano extends Personaje {

    private String Clan;
    Scanner leer = new Scanner(System.in);
    int aumentovida, var1 = 0;

    public Enano(String Clan, String Nombre, String Raza, String Arma, int Vida, int Daño) {
        super(Nombre, Raza, Arma, Vida, Daño);
        this.Clan = Clan;
    }

    public String getClan() {
        return Clan;
    }

    public void setClan(String Clan) {
        this.Clan = Clan;
    }

    public void Historia() {
        System.out.println("");
        System.out.println("Sujeto perteneciente a la raza " + getRaza() + " perteneciente al clan " + getClan());
        System.out.println("su nombre es " + getNombre() + "y junto con el lo acompaña su " + getArma());
        System.out.println("Nacido en su natal tierra de las montañas, el se forgo en el arduo trabajo de la mineria");
        System.out.println("para luego convertirse en un gran guerrero para poder vengar a sus hermanos caidos en los asedios.");
    }

    public void AumentoVida() {
        do {
            do {
                try {
                    System.out.println("");
                    System.out.println("Ingresa un valor de aumento de vida");
                    System.out.println("debe ser un valor entre 50 y 100");
                    aumentovida = leer.nextInt();

                } catch (InputMismatchException exep1) {
                    leer.nextLine();
                    System.out.println("");
                    System.out.println("ERROR, por favor ingrese un numero.");
                    var1 = 0;
                }
            } while (var1 == 0);

            if (aumentovida < 50 || aumentovida > 100) {
                System.out.println("ERROR, valor invalido");
            } else {
                this.Vida = this.Vida + aumentovida;
            }

        } while (aumentovida < 50 || aumentovida > 100);

    }

    public void Victoria() {
        System.out.println("");
        System.out.println("Felicidades, le has ganado a un enemigo poderoso, mas poderoso que has visto y esto siempre sera recordado");
    }

    public void Derrota() {
        System.out.println("");
        System.out.println("Siempre nos miran en menos por nuestra estatura, aunque perdimos hemos dado a demostrar tu valentia");
        System.out.println("y eso siempre lo recordaran");
    }

}
