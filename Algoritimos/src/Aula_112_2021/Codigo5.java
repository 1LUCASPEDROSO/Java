/*4. Faça um algoritmo que controle a emissão de fotocópias da escola.
O algoritmo receberá a quantidade de cópias tiradas, e o tipo de cliente
e com base na tabela abaixo, o programa deverá mostrar como resposta 
o valor a pagar.
Código	TipoCliente       PreçoUnitario
10	 Aluno             0,50
12	 Professor         0,25
1	 Direção           0,00
15	 Não Aluno         1,00 */
package Aula_112_2021;
import java.util.Scanner;
public class Codigo5 {
    public static void main(String[] args) {
    Scanner read=new Scanner (System.in);    
   int c;
   float q; 
 
     System.out.println("Código TipoCliente PreçoUnitario\n"
        + "10	 Aluno             0,50\n"
        + "12	 Professor         0,25\n"
        + "1	 Direção           0,00\n"
        + "15	 Não Aluno         1,00 ");
   
     System.out.print("digite seu codigo: ");
    c = read.nextInt();
    
    switch (c){
    case 10: 
      System.out.println("quantas cópias ?");
     q = read.nextInt();
         System.out.println("total:R$"+ 0.50*q);
         break;
    case 12: 
      System.out.println("quantas cópias ?");
     q = read.nextInt();
         System.out.println("total:R$"+ 0.25*q);
         break;
    case 1: 
      System.out.println("quantas cópias ?");
     q = read.nextInt();
         System.out.println("total:R$"+ q*0);
         break;
    case 15: 
      System.out.println("quantas cópias ?");
     q = read.nextInt();
         System.out.println("total:R$"+ 1*q);
         break;
    
    
    
    
    
    
    
    
    
    
    }// fim switch
    }//class  
}//main
