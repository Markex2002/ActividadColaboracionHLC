package formas;

import java.math.BigDecimal;

public class Circulo {
    //ATRIBUTOS
    private double radio;

    //CONSTRUCTOR
    public Circulo(double radio){
        this.radio = radio;
    }




    //METODOS
    public void calcularArea(){
        BigDecimal area = new BigDecimal(radio).multiply(BigDecimal.valueOf(Math.PI));
        System.out.println("El area de este Circulo es de: " + area.setScale(2) + "cm");
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += "Circulo con radio de: " + radio + "cm.";

        return resultado;
    }
}