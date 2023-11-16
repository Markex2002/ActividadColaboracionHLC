package formas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circulo {
    //MMB 16/11/23
    //ATRIBUTOS
    private double radio;

    //CONSTRUCTOR
    public Circulo(double radio){
        this.radio = radio;
    }




    //METODOS
    public void calcularArea(){
        BigDecimal area = new BigDecimal(radio).multiply(BigDecimal.valueOf(Math.PI));

        System.out.println("El area de este Circulo es de: " + area.setScale(2, RoundingMode.HALF_EVEN) + "cm");
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += "Circulo con radio de: " + radio + "cm.";

        return resultado;
    }
}