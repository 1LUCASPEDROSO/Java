
package Aula_2611_2021;
import java.util.Scanner;
public class Codigo1 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);    
    double slm = 2384.8;
    int q;
    System.out.print("quantos carros foram vendidos ?");
    q = leia.nextInt();
    
    if (q > 0){
        System.out.println("salario"+(slm +q*500));
    
    }// fim IF
    
    else { 
        System.out.println("você não possui comissão, salario");
    
    } //fim else
    
    }//main
   
}//class
