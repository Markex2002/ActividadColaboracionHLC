package formas;

public class Circulo {
    //ATRIBUTOS
    private double radio;

    //CONSTRUCTOR
    public Circulo(double radio){
        this.radio = radio;
    }




    //METODOS
    public void calcularArea(){
        double area = radio * 3.14;

        System.out.println("El area de este Circulo es de: " + area + "cm");
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += "Circulo con radio de: " + radio + "cm.";

        return resultado;
    }
}