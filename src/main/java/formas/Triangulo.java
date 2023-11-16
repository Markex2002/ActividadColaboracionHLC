package formas;

public class Triangulo {
    int base;
    int altura;

    public Triangulo(int base, int altura)
    {
        this.base=base;
        this.altura=altura;
    }

    /*Metodos del triangulo*/

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calcularArea()
    {
        System.out.println("El area de este Triangulo es de: " + (double) (this.altura*this.base)/2 + "cm");

    }
}
