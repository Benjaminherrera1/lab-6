package lab.lab4;

public class Elfo extends Personaje {

    private String Reino;
    int quitavida;

    public Elfo(String Reino, String Nombre, String Raza, String Arma, int Vida, int Daño) {
        super(Nombre, Raza, Arma, Vida, Daño);
        this.Reino = Reino;
    }

    public String getReino() {
        return Reino;
    }

    public void setReino(String Reino) {
        this.Reino = Reino;
    }

    public void Historia() {
        System.out.println("");
        System.out.println("Sujeto perteneciente a la raza " + getRaza() + " perteneciente al reino  " + getReino());
        System.out.println("su nombre es " + getNombre() + "y junto con el lo acompaña su " + getArma());
        System.out.println("Proveniente de los bosques en su reino, el desde pequeño perfecciono el arte del arco, hasta que un dia");
        System.out.println("tuvo que usar el arco para defender a su familia y desde ahi no ah parado de perfeccionar su arte.");
        
    }

    public void QuitaVida() {
        quitavida = (int) (this.Vida - this.Vida * (0.1));
        this.Vida = (int) quitavida;

    }

    public void Victoria() {
        System.out.println("");
        System.out.println("Felicidades hermano, has vencido a tu enemigo con gran velentia y honor, brinda con tus hermanos");
        System.out.println("deberias sentirte reconfortado");
    }

    public void Derrota() {
        Historia();
    }

}
