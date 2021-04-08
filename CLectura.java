/*
 * Fecha:19/oct/2017
 * Autor:Evangelista Perez Gabriela
 * Curso:APALO
 * Tarea:1
 * Programa que lee tres dados para una ecuacion cuadraticay calcula las dos soluciones o bien
 * indica que el sistema de ecuacion no tiene solucion.
 * Datos de entrada:a,b,c numeros dados por el usuario.
 * Datos de salida:resultado de x1 y x2 si es que existen una solucion , en el caso contrario 
   muestra un mensaje de que no existe una solucion a la ecuacion.
 */
package cuadratica;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CLectura {

    public double leedatoA() throws InputMismatchException{
        double a;
        Scanner in;
        in  =   new Scanner(System.in);
        System.out.println("Ingresa el valor de a:");
        a   =   in.nextDouble();
        return a;
        
    }

    public double leedatoB() throws InputMismatchException{
        double b;
        Scanner in;
        in  = new Scanner(System.in);
        System.out.println("Ingresa el valor de b:");
        b   =   in.nextDouble();
        return b;
    }

    public double leedatoC() throws InputMismatchException {
        double c;
        Scanner in;
        in  =   new Scanner(System.in);
        System.out.println("Ingresa el valor de c:");
        c   =   in.nextDouble();
        return c;
    }
    
}