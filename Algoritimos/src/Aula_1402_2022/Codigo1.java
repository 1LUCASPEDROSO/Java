/*Criar um sistema que realize a verificação de um login(usuário e senha). 
-> O sistema deve possibilitar o usuário realizar o cadastro de seu login.
-> Os dados de usuário e senha devem ser guardados em vetores respectivamente.
-> O sistema deve ter um controle de tentativas. Se o usuário errar mais que 03 vezes, fecha-se o sistema.
-> Ao passar pelo login o sistema abre um site*/
package Aula_1402_2022;
import java.util.Scanner;
public class Codigo1 {
public static void main(String[] args) {
Scanner read =new Scanner (System.in);

String login[] = new String[1];
int senha[] = new int [1];
int op;
String login1;
int senha1,opercao = 1;
while (opercao ==1){
    System.out.println("digite 1- criar login 2- mostrar login");
    System.out.print("digite aqui: ");
    op = read.nextInt();
    switch (op) {
        case 1:
            for (int i = 0; i < login.length; i++) {
                System.out.println("crie seu login: ");
                login[i] = read.next();
            }
            for (int i = 0; i < senha.length; i++) {
                System.out.println("crie sua senha: ");
                senha[i] = read.nextInt();
            }
            
            System.out.println("login e senha criados !!!!!");
            System.out.print("digite seu login: ");
           login1 = read.next();
            System.out.print("digite sua senha: ");
            senha1 =read.nextInt();
            
            if(!login1.equals(login[0])&& senha1 != senha[0]){System.out.println("login ou senha incorretos");}
            
            
            
            
            
            
            
            
            
            
            
            
            break;
        case 2:
           for (int i = 0; i < login.length; i++) {
                System.out.println("["+login[0]+"]");
               
            }
            for (int i = 0; i < senha.length; i++) {
            System.out.println("["+senha[0]+"]");
               
            }
    } // fim switch
}







    }//main
}//class
