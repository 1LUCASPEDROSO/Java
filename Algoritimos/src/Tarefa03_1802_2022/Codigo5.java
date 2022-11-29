/*5)Criar um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os nomes
lidos em um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer
de pessoa e depois escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes 
lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário.*/
package Tarefa03_1802_2022;
import java.util.*;

public class Codigo5 {
    public static void main(String[] args) {
     Scanner read= new Scanner (System.in);   
    String nomes[] = new String [9];
    String nome1;
    
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("digite nomes:");
            nomes[i] = read.next();
        } // for 
        
        for (int i = 0; i < 1;i++){ 
            System.out.println("digite um nome para a procura: ");
            nome1 = read.next();
         if (nome1.equals(nomes[i])) 
                System.out.println("achei");
             else 
                System.out.println("não achei");        
        }
        
    }//main
}// class
