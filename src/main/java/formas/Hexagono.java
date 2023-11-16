package formas;

public class Hexagono {
    //MMB 16/11/23
    //ATRIBUTOS
    private double perimetro;
    private double apotema;


    //CONSTRUCTOR
    public Hexagono(double perimetro, double apotema){
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    //Constructor en caso de no tener el perimetro
    public Hexagono(double apotema, double lado1, double lado2, double lado3, double lado4, double lado5, double lado6){
        perimetro = lado1 + lado2 + lado3 + lado4 + lado5 + lado6;
        this.apotema = apotema;
    }


    //METODOS
    public void calcularArea(){
        double area = (perimetro * apotema) / 2;

        System.out.println("El area de este Hexagono es de: " + area + "cm");
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += "Hexagono con perimetro de: " + perimetro + "cm, y apotema de: " + apotema + "cm";

        return resultado;
    }
}