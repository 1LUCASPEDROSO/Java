package Aula_2611_2021;
/*Construir um algoritmo que leia dois números e efetue a adição. Caso o valor 
somado seja maior que 40, este deverá ser apresentado somando-se a ele mais 8;
caso o valor somado seja menor ou igual a 40
este deverá ser apresentado subtraindo-se 10.*/
import java.util.Scanner;
public class Codigo5 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);   
      float n1,n2,adicao,r1=8,r2=10;
        System.out.print("digite o 1º:");
        n1 = leia.nextFloat();
        System.out.print("digite o 2º:");
        n2 = leia.nextFloat();
        adicao = n1 + n2;
        if (adicao > 40)
        {System.out.println(""+(adicao+r1));}
        else {System.out.println(""+(adicao-r2));} 
    }//main    
}//class