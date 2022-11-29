/*Criar um algoritmo para inserir 20 números em um vetor. Após isto, deverá inserido mais um número 
qualquer e verificar se esse número existe no vetor ou não. Se existir, o algoritmo deve gerar um novo 
vetor sem esse número.*/
package Aula_1202_2022;
import java.util.Scanner;
public class codigo1 {
    public static void main(String[] args) {
    Scanner read =new Scanner (System.in);
 int n [] = new int [20];
int numeros;
int op;
        System.out.print("insira os numeros: ");
        numeros =read.nextInt();
        System.out.println("deseja subistituir um numero: ");
        op = read.nextInt();
        switch (op) {
            case 1:
                for (int i = 0; i > n.length; i++) {

                    if (n[i] == numeros) {
                       n[i] = 0;
                    }
                }
                break;
        }// fim switch
    }//main
}//class
