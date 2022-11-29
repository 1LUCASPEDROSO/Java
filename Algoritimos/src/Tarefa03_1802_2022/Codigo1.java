/*1)Você foi solicitado a criar um algoritmo para realizar uma pesquisa de mercado
para saber se as pessoas gostam ou não de um novo produto lançado no mercado.
Os dados de inserção são: sexo do entrevistado e sua resposta "sim ou não".
O algoritmo deve mostrar no final da pesquisa os seguintes índices:
-> total de sim
-> total de não
-> quantidade de sexo feminino respondeu sim
-> quantidade de sexo feminino respondeu não
-> quantidade de sexo masculino respondeu sim
-> quantidade de sexo masculino respondeu não*/
package Tarefa03_1802_2022;
import java.util.*;
public class Codigo1 {
    public static void main(String[] args) {
    Scanner read= new Scanner (System.in);    
int sim=0,nao=0;        
int resposta;        
int sexo = 0 ;
int sf =0,sm=0,nf=0,nm=0;
int op =0;
        do {
            System.out.println("inicio da avaliação");
            System.out.println("digite seu sexo\n1- masculino\n2- feminino");
            System.out.print("digite aqui: ");
            sexo = read.nextInt();
            if (sexo == 1) {
                System.out.println("voce gostou do produto?\n 1- sim\n2- não");
                System.out.print("digite aqui:");
                resposta = read.nextInt();
                if (resposta == 1) {
                    System.out.println("obrigado pela avaliação");
                    sm++;
                    sim++;
                } else if (resposta == 2) {
                    System.out.println("obrigado pela avaliação");
                    nm++;
                    nao++;
                }
            }//fim if masculino
            else if (sexo == 2) {
                System.out.println("voce gostou do produto?\n 1- sim\n2- não");
                System.out.print("digite aqui:");
                resposta = read.nextInt();
                if (resposta == 1) {
                    System.out.println("obrigado pela avaliação");
                    sf++;
                    sim++;
                } else if (resposta == 2) {
                    System.out.println("obrigado pela avaliação");
                    nf++;
                    nao++;
                }
            }// fim else if feminino
            System.out.println("Avaliar novamente:\n1 -sim\n2- não");
            op = read.nextInt();
        } while (op != 2); //fim while
        System.out.println("total de sim:" + sim++);
        System.out.println("total de não:" + nao++);
        System.out.println("total de sim masculino:" + sm);
        System.out.println("total de NÃO masculino:" + nm);
        System.out.println("total de sim feminino:" + sf);
        System.out.println("total de NÃO feminino:" + nf);   
    }//main
}// class
