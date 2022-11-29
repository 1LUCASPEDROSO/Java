package Aula_112_2021;
import java.util.Scanner;
public class Codigo1 {
    public static void main(String[] args) {
    Scanner leia = new Scanner (System.in);
    int ex;
    String d;
        System.out.println("valor: ");
        ex = leia.nextInt();
    switch (ex){
        case 10:
            System.out.println("codigo1");
            break;
        case 20:
            System.out.println("codigo2");
            break;
        case 30:
            System.out.println("codigo3");
            System.out.println("nome: ");
            d = leia.next();
            switch (d){
                case "d":
                   System.out.println("vc é a história"); 
                   break;
                case "f":
                   System.out.println("vc está fora");
                   break;
            }//fim switch 2
            break;
        default:
            System.out.println("codigo 4, nenhum"); 
            break;
    }// fim switch      
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }//class
}//main
