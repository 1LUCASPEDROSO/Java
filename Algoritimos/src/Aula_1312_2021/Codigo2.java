/* Jogo pedra papel tesoura
=> O sistema deve mostrar um placar zerado
=> O usuário deve escolher sua jogada entre 1- pedra, 2- papel ou 3 - tesoura
=> O sistema deve escolher sua jogada (aleatória) entre pedra, papel ou tesoura
=> O sistema deve comparar as jogadas e determinar quem: ganhou, perdeu ou se foi empate
=> O sistema deve atualizar o placar
=> O sistema deve perguntar ao usuário se deseja continuar a jogar, desde que não esteja com o placar zerado.
REGRAS:
	- pedra ganha de tesoura  
	- papel ganha de pedra    
	- tesoura ganha de papel*/
package Aula_1312_2021;
import java.util.Scanner;
import java.util.Random;
public class Codigo2 {
    public static void main(String[] args) {
    Scanner read=new Scanner (System.in);    
    Random num =new Random ();
     int jogada,jogada_maquina,volta=0,placarj=0,placarm=0;
        System.out.println("placar:\n jogador 0 \n maquina 0");          
        do {System.out.println("jogadas disponiveis: \n 1- pedra\n 2- papel\n 3- tesoura ");
        System.out.print("digite sua jogada: ");
        jogada = read.nextInt();
        jogada_maquina = num.nextInt(3)+1;
            System.out.println("maquina: "+jogada_maquina);   
        if (jogada > jogada_maquina) {System.out.println("vitória do jogador!!!! "+placarj++);}    
        else if (jogada == jogada_maquina){System.out.println("empate");}
        else if (jogada_maquina > jogada){System.out.println("vitória da maquina!!!! "+placarm++);}
            System.out.println("placar final: \n"+"jogador: "+placarj+"\n maquina: "+placarm);   
            System.out.println("quer jogar novamente ?\n 1- sim\n 2-não");
            System.out.print("digite: ");
            volta =read.nextInt();
        }while (volta==1); 
 }//main
}//class
