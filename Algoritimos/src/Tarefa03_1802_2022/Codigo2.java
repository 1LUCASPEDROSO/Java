/*2)Criar um algoritmo que recebe uma quantidade não determinada de números.
-> Após inserir o nº, o sistema deve perguntar se deve para ou não.
-> Quando for escolhido "PARAR O SISTEMA", deve ser mostrado:
  + Quantidade de nº inseridos
  + Soma desses nº
  + O maior valor de nº inserido
  + O menor valor de nº inserido
  + A média dos valores*/
package Tarefa03_1802_2022;
import java.util.*;
public class Codigo2 {
    public static void main(String[] args) {
        Scanner read= new Scanner (System.in);
    int numeros =0,soma=0,media=0,quantidade =0,op=0,m=0,n=0; 
 do{
     System.out.println("digite um numero: ");
     numeros =read.nextInt();
     System.out.println("adcionar mais um numero?\n1- sim\n2- não ");
     op =read.nextInt();
     quantidade ++;soma+=numeros;media =soma/quantidade;
         if (numeros > m)m= numeros;
         else n= numeros;
 }while (op != 2);//fim while        
        System.out.println("A qunatidade de numeros digitados foi: "+quantidade);       
         System.out.println("A soma desses valores foram: "+soma);   
         System.out.println("A média desses valores foi: "+media);   
         System.out.println("o maior numero foi: "+m);
         System.out.println("o menor numero foi: "+n);
        
    }//main
}//class
