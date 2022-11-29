
package Aula_2611_2021;
import java.util.Scanner;

public class Codigo4 {
    
    public static void main(String[] args) {
    Scanner leia = new Scanner (System.in);
     int tipo, quantidade;
    
     System.out.print("qual tipo de picolé: ");
    tipo = leia.nextInt();
    System.out.println("quantos: ");
    quantidade = leia.nextInt();
    
    if (tipo == 1) 
    { System.out.print("total"+quantidade +"total: "+(quantidade*5));} 
    
    else if (tipo == 2)
    {System.out.print("total"+quantidade +"total: "+(quantidade*7));}
        
    
    else if (tipo == 3) 
    {System.out.print("total"+quantidade +"total: "+(quantidade*4.50));}
    
    else {
        System.out.println("nunero errado");
}
    

    
    
    }//main
    
}//class
