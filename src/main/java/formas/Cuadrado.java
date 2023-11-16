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

    public int calculaArea()
    {
        return this.lado*this.lado;
    }
}
