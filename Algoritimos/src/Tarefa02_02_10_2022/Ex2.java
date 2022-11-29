/*Sistema onde usuario pede um numero aleatório de "ip" para a maquina onde pode acessar algo remotamente*/
package Tarefa02_02_10_2022;
import java.util.Scanner;
import java.util.Random;
// @lucas.pedroso
public class Ex2 {
    public static void main(String[] args) {
    Scanner read =new Scanner (System.in); 
    Random num = new Random ();
    //variables 
    String user, país;
    float vpn;
    int resposta;
//start algorithm, the first element used is (do/while) this code is all inside the structure repetion
        do {
//Start algorithm the system show new message  end read variable (user) typed from user             
            System.out.print("olá usuario, digite seu user:");
            user = read.next();
//the system show new message  to user, in the message shows the name chosen by the user
//in last block the system read answer typed to user             
            System.out.println("precisa de um código IP? SR(a)" + user + " digite 1- sim ou 2- não");
            resposta = read.nextInt();
//this block is uses an if estruture to condition  the system to read the answer variable (resposta) end
//accepts three possible answers the user typed 1 the system showa message 
//end read answer variable (país)  after reading  variable (país) the system 
//generates a random number  for the variable (vpn) end show new message 
//to user with  variables (páis) +(user) +vpn            
            if (resposta == 1) {
                System.out.print("digite qual pais precisa: ");
                país = read.next();
                vpn = num.nextInt(1781685) + 100002;
                System.out.println("seu ip para " + país + "SR(a): " + user + ": " + vpn);
            } else if (resposta == 2) {
                System.out.println("fim do programa");
            }
            else System.out.println("digite um valor válido!!!");
        } while (resposta != 1);
    }// main  
}//class
