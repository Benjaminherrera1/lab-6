package lab.lab4;

import java.util.*;

public class Hombre extends Personaje {

    Scanner leer = new Scanner(System.in);
    private String Casta;
    int superbono, var1 = 0;

    public Hombre(String Casta, String Nombre, String Raza, String Arma, int Vida, int Daño) {
        super(Nombre, Raza, Arma, Vida, Daño);
        this.Casta = Casta;
    }

    public String getCasta() {
        return Casta;
    }

    public void setCasta(String Casta) {
        this.Casta = Casta;
    }

    public void Historia() {
        System.out.println("");
        System.out.println("Sujeto perteneciente a la raza " + getRaza() + " perteneciente a la casta de la " + getCasta());
        System.out.println("su nombre es " + getNombre() + "y junto con el lo acompaña su " + getArma());
        System.out.println("Nacido en una gran ciudad de bronce, nacido en cuna de oro, desde pequeño le interesaba las armas y una");
        System.out.println("consiguio una edad para usarlas, se perfecciono en el arte de su uso, para asi unirse a  las filas del ");
        System.out.println("ejercito y acabar con todo enemigo que vea.");
    }

    public void SuperBono() {
        do {
            do {
                try {
                    var1 = 1;
                    System.out.println("");
                    System.out.println("Ingrese el bono de daño para la raza Humana");
                    System.out.println("Valor entre los 5 y los 15 puntos de daño");
                    superbono = leer.nextInt();
                    
                } catch (InputMismatchException exep1) {
                    leer.nextLine();
                    System.out.println("");
                    System.out.println("Error, por favor ingrese un numero, no una letra.");
                    var1 = 0;

                }
            } while (var1 == 0);
            
            if (superbono < 5 || superbono > 15) {
                System.out.println("ERROR, valor invalido");
                
            } else {
                this.Daño = this.Daño + superbono;
            }
            
        } while (superbono < 5 || superbono > 15);
    }

    public void Victoria() {
        System.out.println("");
        System.out.println("Felicidades Soladado, has logrado una victoria aplastante ante tu enemigo");
        System.out.println("deberias sentirte reconfortado");
    }

    public void Derrota() {
        String arma;
        System.out.println("");
        System.out.println("Una lastima Soladado, no todas las batallas las ganaras, debes aprender de tu derrota");
        System.out.println("y luchar el doble a la proxima. Actualiza tu arma ahora:");
        arma = leer.nextLine();
        this.setArma(arma);
        leer.next();
        System.out.println("Tu nueva arma sera la poderosa :" + getArma());

    }
}
