/*1. Escreva um algoritmo que leia um peso na Terra e o número 
de um planeta(conforme tabela) e imprima o valo rdo seu peso neste planeta.
A relação de planetas é dada a seguir juntamente com o valor das gravidades
relativas à Terra.
Nro.     Gravidade relativa      Planeta
1          0,37                 Mercúrio
2          0,88                 Vênus
3          0,38                 Marte
4          2,64                 Júpiter
5          1,15                 Saturno
6          1,17                 Urano
Para calcular o peso no planeta usar a fórmula:
peso_planeta = (peso_terra/10) x gravidade
 */
package Aula_112_2021;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Codigo2 {
    public static void main(String[] args) {
    Scanner read = new Scanner (System.in);    
    int pt;
    double c;
    int p ;
        System.out.print("digite o peso na terra: ");
        pt = read.nextInt();
        System.out.print("qual planeta: \n 1- mercurio\n 2- vênus\n 3- marte"
                + "\n 4- jupiter \n 5- saturno\n 6- urano\n");
         p = read.nextInt();
         switch (p){
            case 1:
                c = (pt/10)* 0.37;
                System.out.println("a conversão para mercurio: "+c);
                break;
                case 2:
                c = (pt/10)* 0.88;
                System.out.println("a conversão para vênus: "+c);
                break;
                case 3:
                c = (pt/10)* 0.38;
                System.out.println("a conversão para marte: "+c);
                break;
                case 4:
                c = (pt/10)* 2.64;
                System.out.println("a conversão para jupiter: "+c);
                break;
                case 5:
                c = (pt/10)* 1.15;
                System.out.println("a conversão para saturno: "+c);
                break;
                case 6:
                c = (pt/10)* 1.17;
                System.out.println("a conversão para urano: "+c);
                break; }//fim switch
}//class
}//main
