/*Criar um algoritmo que permita inserir em um vetor notas de uma 
turma de 20 alunos. Calcular a média da turma e contar quantos alunos 
obtiveram nota acima desta média calculada. Mostrar no final a média da turma 
e o resultado da contagem.*/
package Aula_0902_2022;
import java.util.Scanner;
public class Codigo03 {
    public static void main(String[] args) {
    Scanner read= new Scanner (System.in);
int notas [] = new int [3];               
int op, opercao = 1;
int soma =0;
int media = 0;

        while (opercao == 1) {
            System.out.println("qual operação: \n 1- digitar \n 2- mostrar notas\n 3- calcular media\n 4- mostrar aprovados");
            System.out.print("digite aqui: ");
            op = read.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < notas.length; i++) {
                        System.out.print(" notas: ");
                        notas[i] = read.nextInt();
                    }
                    break;
                case 2:
                    for (int i = 0; i < notas.length; i++) {
                        System.out.print("[" + notas[i] + "]\n");
                    }
                    break;
                case 3:
                    for (int i = 0; i < notas.length; i++) {
                        soma = soma + notas[i];
                    }
                    media = soma / 3;
                    System.out.println("a média da turma foi: " + media);
                    break;
                case 4:
                    for (int i = 0; i < notas.length; i++) {
                         int alunos = 0;
                     alunos++;
                        if (notas[i] >= media) { System.out.println("alunos aprovados:" + alunos);
                        }
                    }
                    break;
            }// fim switch              
        }//fim while
    }//main
}//class
