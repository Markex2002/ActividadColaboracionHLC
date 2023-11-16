package formas;

public class Rectangulo {

    int base;
    int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

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

    public void calculaArea(){
        System.out.println("El area de este Rectangulo es de: " + (double) this.base*this.altura + "cm");

    }
}
