import formas.Circulo;
import formas.Cuadrado;
import formas.Hexagono;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //INICIO CODIFICACIÓN MMB 23/11/2023
        int opcion = -1;

        while (opcion!=0){
            System.out.println(menu());
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Circulo");
                    Circulo circulo = new Circulo(2);
                    circulo.calcularArea();
                    break;
                case 2:
                    System.out.println("Cuadrado");
                    Cuadrado cuadrado = new Cuadrado(4);
                    cuadrado.calculaArea();
                    break;
                case 3:
                    System.out.println("Hexagono");
                    Hexagono hexagono = new Hexagono(6,2);
                    hexagono.calcularArea();
                    break;
            //FIN CODIFICACION MMB 23/11/2023
                case 4:
                    System.out.println("Pentagono");
                    break;
                case 5:
                    System.out.println("Rectangulo");
                    break;
                case 6:
                    System.out.println("Triangulo");
                    break;
                case 0:
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
        sc.close();
    }

    //INICIO CODIFICACION MMB 23/11/2023
    public static String menu(){
        String resultado = "";

        resultado += "Circulo.1-";
        resultado += "\nCuadrado.2-";
        resultado += "\nHexagono.3-";
        resultado += "\nPentagono.4-";
        resultado += "\nRectangulo.5-";
        resultado += "\nTriangulo.6-";
        resultado += "\nSalir.0-";
        resultado += "\n--------------------";

        return resultado;
    }
}