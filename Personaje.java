package lab.lab4;

import java.util.*;

public class Personaje {

    protected String Nombre;
    protected String Raza;
    protected String Arma;
    protected int Vida;
    protected int Daño;

    public Personaje(String Nombre, String Raza, String Arma, int Vida, int Daño) {
        Random random = new Random();
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Arma = Arma;
        this.Vida = random.nextInt(51) + 150;
        this.Daño = Daño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String Arma) {
        this.Arma = Arma;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getDaño() {
        return Daño;
    }

    public void setDaño(int Daño) {
        this.Daño = Daño;
    }
    
}
