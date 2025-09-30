
package programas;

import java.util.Scanner;
public class Operaciones {
  public static void main(String[] args){
    int n1,n2,suma,rest;
    Scanner lectura=new Scanner(System.in);
    
    System.out.println("Ingresar Numero 1:");
    n1=lectura.nextInt();
    System.out.println("Ingresar Numero 2:");
    n2=lectura.nextInt();
    
    suma=n1+n2;
    rest=n1-n2;
    
    System.out.println("La suma de los numeros es:" +suma);
    System.out.println("La resta de los numeros es:" +rest);
  }  
}
