
package Aula_2411_2021;
import java.util.Scanner;

public class Codigo3 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    String nome;
    int escolha;
    
        System.out.print("digite seu nome: ");
        nome = leia.nextLine();
        
        System.out.println("digite o codigo do seu time:\n2 - inter\n 1- grêmio");
        System.out.print("digite aqui: ");
        escolha = leia.nextInt();
        
        if (escolha == 1){
            System.out.println(nome+ " seu time é azul");
        }
        else if (escolha == 2){
            System.out.println(nome+" seu time é vermelho");
        }
        else{
            System.out.println("codigo incorreto");
        } 
    }//main
}
