
package class_oop_2022_05_24;
import java.util.*;

public class code_1_oop_2022_05_24 {
    Scanner digita = new Scanner (System.in);    
        //atributos
    private int n1;
    private int n2;
    private int resultado;
    //métodos(ações)
    public void soma()
    {
       System.out.print("N1: ");n1=digita.nextInt();
       System.out.print("N2: ");n2=digita.nextInt();
       resultado = n1+n2;
       System.out.println("SOMA: " + resultado);
    } // end soma  
    public void subtração()
    {
       System.out.print("N1: ");n1=digita.nextInt();
       System.out.print("N2: ");n2=digita.nextInt();
       resultado = n1-n2;
       System.out.println("Subtração: " + resultado);
    } // end subtração
    public void multiplicação()
    {
       System.out.print("N1: ");n1=digita.nextInt();
       System.out.print("N2: ");n2=digita.nextInt();
       resultado = n1*n2;
       System.out.println("multiplicação: " + resultado);
    } // end multiplicação
    public void divisão()
    {
       System.out.print("N1: ");n1=digita.nextInt();
       System.out.print("N2: ");n2=digita.nextInt();
       while(n2 == 0){n2=digita.nextInt();}
       resultado = n1/n2;
       System.out.println("divisão: " + resultado);
    } // end divisão
        
        
        
        
   
}//class
