package formas;

public class Cuadrado {
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void calculaArea()
    {
        System.out.println("El area de este Cuadrado es de: " +this.lado*this.lado + "cm");

    }
}
