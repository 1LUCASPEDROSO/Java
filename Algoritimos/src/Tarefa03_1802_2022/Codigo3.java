/*3)Criar um algoritmo que recebe um conjunto de dados contendo o número da matrícula, as três notas
e a frequência (número de aulas frequentadas) de dez alunos.Calcule e mostre:
-> Para cada aluno o número da matrícula, a nota final e a mensagem (aprovado ou reprovado);
-> A maior e a menor nota da turma;
-> O total de alunos reprovados;
-> A percentagem de alunos reprovados por frequência abaixo da mínima necessária. */
package Tarefa03_1802_2022;
import java.util.*;
public class Codigo3 {
    public static void main(String[] args) {
    Scanner read =new Scanner (System.in);    
           
int matricula [] =new int [10];   
int freq [] =new int [10];
int notas[] =new int [30];
int media =0,freqm=7,notaf=0,m=0,n=0,rf=0;
      
        for (int i = 0; i < matricula.length; i++) {
          System.out.println("digite a matricula do aluno: ");  
            matricula[i] = read.nextInt();
        }
        System.out.println("========================================");
        for (int i = 0; i < freq.length; i++) {
            System.out.println("digite a frequencia do aluno");
            freq[i] = read.nextInt();
        }
          System.out.println("========================================");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("digite as notas: ");
            notas[i] = read.nextInt();
            media = notas[i] / 10;
            if (notas[i] > m) {
                m = notas[i];
            } else 
                n = notas[i];
        }
  
        System.out.println("matricula: " + matricula[0]);
        System.out.println("frequência: " + freq[0]);
        if (freq[0] < freqm) {
            System.out.println("aluno reprovado por frequência");
            rf++;
        }
        notaf = notas[0] + notas[1] + notas[2];
        System.out.println("nota final: " + notaf);
        if (notaf >= media && freq[0]>= freqm) {
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        System.out.println("===================================================");
        System.out.println("matricula: " + matricula[1]);
        System.out.println("frequência: " + freq[1]);
        if (freq[1] < freqm) {
            System.out.println("aluno reprovado por frequência");
            rf++;
        }
        notaf = notas[3] + notas[4] + notas[5];
        System.out.println("nota final: " + notaf);
        if (notaf >= media && freq[1]>= freqm) {
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        System.out.println("===================================================");
        System.out.println("matricula: " + matricula[2]);
        System.out.println("frequência: " + freq[2]);
        if (freq[2] < freqm) {
            System.out.println("aluno reprovado por frequência");
            rf++;
        }
        notaf = notas[6] + notas[7] + notas[8];
        System.out.println("nota final: " + notaf);
        if (notaf >= media && freq[2]>= freqm) {
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        System.out.println("===================================================");
        System.out.println("matricula: " + matricula[3]);
        System.out.println("frequência: " + freq[3]);
        if (freq[3] < freqm) {
            System.out.println("aluno reprovado por frequência");
            rf++;
        }
        notaf = notas[9] + notas[10] + notas[11];
        System.out.println("nota final: " + notaf);
        if (notaf >= media && freq[3]>= freqm) {
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        System.out.println("===================================================");
        System.out.println("matricula: " + matricula[4]);
        System.out.println("frequência: " + freq[4]);
        if (freq[4] < freqm) {
            System.out.println("aluno reprovado por frequência");
            rf++;
        }
        notaf = notas[12] + notas[13] + notas[14];
        System.out.println("nota final: " + notaf);
        if (notaf >= media && freq[4]>= freqm) {
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        System.out.println("===================================================");
        System.out.println("matricula: " + matricula[5]);
        System.out.println("frequência: " + freq[5]);
        if (freq[5] < freqm) {
            System.out.println("aluno reprovado por frequência");
            rf++;
        }
        notaf = notas[15] + notas[16] + notas[17];
        System.out.println("nota final: " + notaf);
        if (notaf >= media && freq[5]>= freqm) {
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        System.out.println("===================================================");
        System.out.println("matricula: " + matricula[6]);
        System.out.println("frequência: " + freq[6]);
        if (freq[6] < freqm) {
            System.out.println("aluno reprovado por frequência");
            rf++;
        }
        notaf = notas[18] + notas[19] + notas[20];
        System.out.println("nota final: " + notaf);
        if (notaf >= media && freq[6]>= freqm) {
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        System.out.println("===================================================");
        System.out.println("matricula: " + matricula[7]);
        System.out.println("frequência: " + freq[7]);
        if (freq[7] < freqm) {
            System.out.println("aluno reprovado por frequência");
            rf++;
        }
        notaf = notas[21] + notas[22] + notas[23];
        System.out.println("nota final: " + notaf);
        if (notaf >= media && freq[7]>= freqm) {
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        System.out.println("===================================================");
        System.out.println("matricula: " + matricula[8]);
        System.out.println("frequência: " + freq[8]);
        if (freq[8] < freqm) {
            System.out.println("aluno reprovado por frequência");
            rf++;
        }
        notaf = notas[24] + notas[25] + notas[26];
        System.out.println("nota final: " + notaf);
        if (notaf >= media && freq[0]>= freqm) {
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        System.out.println("===================================================");
        System.out.println("matricula: " + matricula[9]);
        System.out.println("frequência: " + freq[9]);
        if (freq[9] < freqm) {
            System.out.println("aluno reprovado por frequência");
            rf++;
        }
        notaf = notas[27] + notas[28] + notas[29];
        System.out.println("nota final: " + notaf);
        if (notaf >= media && freq[9]>= freqm) {
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        System.out.println("===================================================");
        
 
        System.out.println("==================================================");
        System.out.println("a maior nota foi: " + m);
        System.out.println("a menor nota foi: " + n);
        System.out.println("procentagem de alunos reprovados por falta: " + (rf*100)/10+"%");
 
    }//main
}//class
