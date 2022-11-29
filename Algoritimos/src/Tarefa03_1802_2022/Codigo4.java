/*4)Crie um algoritmo que solicite a entrada de 10 números pelo usuário,
armazenando-os em um vetor, e então monte outro vetor para o algoritmo inserir
os valores do primeiro multiplicados por 8. Exiba os valores dos dois vetores 
na tela, simultaneamente.*/
package Tarefa03_1802_2022;
import java.util.*;

public class Codigo4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n[] = new int[9];
        int n1[] = new int[9];

        for (int i = 0; i < n.length; i++) {
            System.out.println("digite os numeros: ");
            n[i] = read.nextInt();

        }
        for (int i = 0; i < n1.length; i++) {
            n1[i] = n[i] * 8;

            System.out.println("[" + n[i] + "]" + "x8 =" + "[" + n1[i] + "]");
        }
    }//main
}//class
