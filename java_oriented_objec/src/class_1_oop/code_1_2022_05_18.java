/*1) Criar um sistema de tabuada:
   => o usuário insere um índice
   => o sistema mostra a multiplicação do índice de 0 a 10
   => esse sistema deve dar a condição ao usuário de realizar essa 
operação repetidamente, até o mesmo não desejar */

package class_1_oop;
import java.util.Scanner;

public class code_1_2022_05_18 {
        
    public static void main(String[] args) {
     Scanner read = new Scanner (System.in); 
   int  indice;
   int answer =0;
   int resoult=0;
   do{ 
        System.out.println("digite o numero para ser multiplicado: ");
        indice =read.nextInt();
         for(int i =0; i <= 10; i++){
        resoult = indice * i;
       System.out.println("resultado ="+resoult);}
       System.out.println("deseja refazer ? 1- sim \n 2- não");
       answer =read.nextInt();
   }while(answer == 1); // end while  
   
    }//main
}//class
