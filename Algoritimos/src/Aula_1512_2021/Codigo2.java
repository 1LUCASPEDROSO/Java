/*1)Sistema de jogo de dados 
=> O usuário deve registrar o valor inicial do seu crédito (esse processo deve ser realizado somente uma única vez). 
=> O computador tem o seu valor inical de crédito igual ao usuário
=> O usuário tem dois dados (duas variáveis randômicas)
	+ cada jogada é a soma de valores das variáveis que vai de 2 até 12
=> O computador tem dois dados (duas variáveis randômicas)
	+ cada jogada é a soma de valores das variáveis que vai de 2 até 12
=> O usuário deve digitar o valor de sua aposta, que deve ser menor ou igual ao seu crédito
=> O computador deve apostar o mesmo valor que o usuário, que deve ser menor ou igual ao seu crédito
=> O sistema deve realizar a comparação dos valores dos dados de ambos jogadores e determina quem ganhou ou se deu empate
=> Para o ganhador vai ser adicionado em seu crédito o valor da aposta
=> Para o perdedor vai ser subtraido em seu crédito o valor da aposta
=> O sistema deve mostrar os créditos dos jogadores
=> O sistema pode permitir parar o jogo a qualquer momento
=> Se algum dos jogadores não tiver crédito não pode mais jogar
======================================================================
2) Criar um algoritmo para receber os nomes dos 5 candidatos a presidente de clube social, em seguida receber os votos dos socios
existentes no clube, e ao final mostrar o total de votos de cada candidato e ainda o candidato vencedor da eleição.*/
package Aula_1512_2021;
import java.util.Scanner;
import java.util.Random;
public class Codigo2 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        Random num = new Random ();
         int credit,creditm,playj,playm;
         
        
         System.out.print("digite seu crédito: ");
         credit =read.nextInt();
         creditm =credit;
         System.out.println("the machine has: "+creditm+ " credits");
         do {System.out.print("bet player: ");
         playj =read.nextInt();
         if (playj>credit){System.out.println("no have credits !!!!");}
         } while (playj>credit);
         playj =num.nextInt(12)+1;
        System.out.println("final result is (result dice): "+playj);
        playm =num.nextInt(12)+1;
        System.out.println("final result machine is(result dice): "+playm);
        
        if (playj >playm){System.out.println("player on this game");}
        else if (playm > playj){System.out.println("machine won this game");}
        else if (playj == playm){System.out.println("it's draw");}
    }//main   
}//class
