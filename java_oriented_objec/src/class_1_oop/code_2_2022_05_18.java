/*2) Implementar um jogo de dados de cassino. Regras para partida:
● Realizar o lançamento de dois dados:
  => Se o valor dos dados totalizar 7 ou 11 o jogador ganha
  => Se o valor dos dados totalizar 2, 3 ou 12 o jogador perde
  => Se o valor dos dados totalizar outro valor (4, 5, 6, 8, 9, 10)
este valor é guardado. Deve repetir o lançamento dos      dados até que:
 + Novamente o valor dos dados totalizar o valor que foi guardado, então o jogador ganha.
 + Se o valor dos dados totalizar 7, então o jogador perde.
● Mostrar quantas vezes o jogador ganhou e quantas perdeu.*/

package class_1_oop;
import java.util.Scanner;
import java.util.Random;
public class code_2_2022_05_18 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        Random num = new Random();
         int player_won=0;
         int player_lose =0;
        int lauch;
        int lauch_1;
         int resoult;
          int volta=0;
         do {
            lauch = num.nextInt(12) + 2;
            System.out.println("dice total is:" + lauch);
            if (lauch == 7 || lauch == 11) {
                System.out.println("player WON");
                player_won++;
            }// end if
            else if (lauch == 2 || lauch == 3 || lauch == 12) {
                System.out.println("player lose");
                player_lose++;
            }// end else_if
            else if (lauch == 4 || lauch == 5 || lauch == 6 || lauch == 8 || lauch == 9 || lauch == 10) {
                System.out.println(" this number not uselly, now relances the dice");
                lauch_1 = num.nextInt(10) + 1;
                resoult = lauch_1 + lauch;
                System.out.println("new resoloult is: " + resoult);
                if (resoult != lauch) {
                    System.out.println("player lose");
                    player_lose++;
                }// end if in else_if 
                else if (resoult == lauch) {
                    System.out.println("player won");
                    player_won++;
                } // end of elseif in the elseif
            }// end elseif
            System.out.println("do you wanna play again? ");
            System.out.println("1- for no \n 2- for yes");
            System.out.print("answer: ");
            volta = read.nextInt();
        } while (volta == 2);
        System.out.println("total wins:" + player_won++);
        System.out.println("total loses:" + player_lose);    
    }// main
}// class
