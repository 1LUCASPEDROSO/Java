/*
 Criar um algoritmo que solicite o nome de um jogador e a
sua idade. O sistema deve mostrar o nome do jogador 
idade  digitados e  sua categoria de jogador escolhida.
	Categorias:
	idades de 5 até 10 anos infantil
	idades de 11 até 15 anos  juvenil
	idades de 16 até 20 anos  junior
	idades de 21 até 25 anos  profissional 
  
 */
package Aula_2611_2021;
 import java.util.Scanner;

public class Codigo3 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
        
    String nome; 
    int idade; 
 
    System.out.print("digite seu nome: ");   
    nome = leia.next();
    System.out.print("digite sua idade: ");
    idade = leia.nextInt();
        
        if ((idade >= 5) && (idade <=10)){
            System.out.print(nome + "categoria juvenil");
        }
        
            else if ((idade >=11) && (idade <= 15)){
            System.out.print(nome + "categoria juvenil");
            }
        
         else if ((idade >=16) && (idade <= 20)){
            System.out.print(nome + "categoria junior");
            }
    
             else if ((idade >=21) && (idade <= 25)){
            System.out.print(nome +"categoria profissional");
             }
        
             else if (idade > 26){
             System.out.print( nome + "velho demais");
        }  
        
        
        
        
        
    }//main
    
}//class
