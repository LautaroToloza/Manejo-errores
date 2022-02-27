package error;

import java.util.*;

public class Error {

    public static void main(String[] args) {

        // Error de divisor 0
        try {
            int a = 120;
            int b = 0;
            int resultado;
            resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException nombreExcepcion1) {
            System.out.println("La división de 0 no se puede resolver: " + nombreExcepcion1);

        }

        // Error de Scanner al ingresar un String
        try {
            Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            int numero = leer.nextInt();

            System.out.println("El numero ingresado fue: " + numero);

        } catch (InputMismatchException nombreExcepcion2) {
//          System.out.println("Error, ingreso un texto: "+nombreExcepcion2);
            nombreExcepcion2.printStackTrace(System.out);
        }

        //Error cuando se ingresa un número negativo
        try {
            Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese un numero positivo: ");
            int numero = leer.nextInt();

            if (numero < 0) {
                throw new Exception("Se indico que tenia que ser número positivo!!");
            }
        } catch (Exception nombreExcepcion3) {
            // Imprime el throw
            System.out.println(nombreExcepcion3.getMessage());
        } 
        
        //Uso de finally
        finally {
            System.out.println("Hola final!");
        }
    }

}
