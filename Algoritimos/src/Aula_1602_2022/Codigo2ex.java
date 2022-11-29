package Aula_1602_2022;
import java.util.*;
public class Codigo2ex {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetorEstatico[] = new int[5];
        ArrayList<Integer> vetorDinamico = new ArrayList<>();
        //inserir dados
        System.out.println("Colocar dados para vetor estático:");
        for (int i = 0; i < vetorEstatico.length; i++) {
            System.out.print("NÚMERO: ");
            vetorEstatico[i] = ler.nextInt();
        }
        System.out.println("\n\nColocar dados para vetor dinámico:");
        char opcao = 's';
        do {
            System.out.print("NÚMERO: ");
            vetorDinamico.add(ler.nextInt());
            System.out.println("Deseja colocar novo valor?");
            opcao = ler.next().charAt(0);
        } while (opcao == 's');
        //mostrar dados
        System.out.println("Mostrar dados do vetor estático:");
        for (int i = 0; i < vetorEstatico.length; i++) {
            System.out.print("[" + vetorEstatico[i] + "] ");
        }
        System.out.println("\n\nMostrar dados do vetor dinámico:");
        for (int i = 0; i < vetorDinamico.size(); i++) {
            System.out.print("[" + vetorDinamico.get(i) + "] ");
        }
    }//main   
}//class
