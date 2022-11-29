/* App usado para gerir lista de supermercado predeterminada pelo usuario
onde é possivel fazer login, criar listas personalizadas*/ 
package Tarefa02_02_10_2022;
import java.util.Scanner;
// @lucas.pedroso
public class Ex1 {
    public static void main(String[] args) {
    Scanner read = new Scanner (System.in);
 // variables   
 String login1;
 String login2 = "lucas1";
 String item1,item2,item3,item4,item5,item6,item7,item8,item9,item10;
 int senha1,senha2 =1234;
 int lista1 = 0; 
// Start algorithm, the system shows three infomations to user and read one variable (login1) typed by user  
        System.out.println("Olá novamente!");
        System.out.println("Para acessar suas listas faça login");
        System.out.println("digite seu login:");
        login1 = read.next();
//In this block is uses repeat struture, the  struture used is (while) where
//the variable (login1) is compared with the variable (login2) if the variable 
//(login1) is different to (login 2) the structure is showns again
// and the user type agains  one new valor to variable (login1)
//until  variable (login1) is compared end is equal to (login2).     
        while (!login1.equals(login2)) {
            System.out.println("digite login novamente:");
            login1 = read.next();
        }
//this block uses more repetion estruture, the system show the message from the user and
//user type one valor to variable (senha1)  this variable is compared with
// variable (senha2) if (senha1) is diferrent to (senha2) the algoritihm 
//shows again one message to user and user write new valor to (senha1)
//this estruture is shows again until (senha1) equals (senha2)
//if (senha1) is equal to (senha2) the user go to the next step.        
        System.out.print("digite sua senha de 4 digitos:");
        senha1 = read.nextInt();
        while (senha1 != senha2) {
            System.out.print("digite sua senha novamente: ");
            senha1 = read.nextInt();
        }
//In this block the system shows  messages to user for each item put on 
//the list, the system read ten itens one for line 
        System.out.print("digite o 1º item da lista:");
        item1 = read.next();
        System.out.print("digite o 2º item da lista:");
        item2 = read.next();
        System.out.print("digite o 3º item da lista:");
        item3 = read.next();
        System.out.print("digite o 4º item da lista:");
        item4 = read.next();
        System.out.print("digite o 5º item da lista:");
        item5 = read.next();
        System.out.print("digite o 6º item da lista:");
        item6 = read.next();
        System.out.print("digite o 7º item da lista:");
        item7 = read.next();
        System.out.print("digite o 8º item da lista:");
        item8 = read.next();
        System.out.print("digite o 9º item da lista:");
        item9 = read.next();
        System.out.print("digite o 10º item da lista:");
        item10 = read.next();
//this block, the system shows the user the list with ten items addeds in the previous block  for user         
        System.out.println("Itens contidos na lista: \n" + item1);
        System.out.println("" + item2);
        System.out.println("" + item3);
        System.out.println("" + item4);
        System.out.println("" + item5);
        System.out.println("" + item6);
        System.out.println("" + item7);
        System.out.println("" + item8);
        System.out.println("" + item9);
        System.out.println("" + item10);
// this block uses  switch estruture, uses one variable (lista1) end the system read
//two possible variables  typed by  user,  number 1 or  number 2 
//with  (case 1) or (case 2) both show new message to user end finalizes the system         
        System.out.println("deseja salvar está lista para futuras compras? \n 1- sim \n 2- não");
        lista1 = read.nextInt();
        switch (lista1) {
            case 1:
                System.out.println("lista salva!");
                break;
            case 2:
                System.out.println("lista não salva!!");
                break;
        }
    }//main
}//class
