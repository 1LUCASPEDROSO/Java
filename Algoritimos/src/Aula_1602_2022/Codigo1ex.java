package Aula_1602_2022;
import java.util.*;
public class Codigo1ex {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetorEstatico[] = new int[5];
        ArrayList<Integer> vetorDinamico = new ArrayList<>();
        //inserir dados
        vetorEstatico[0] = 10;
        vetorEstatico[1] = 20;
        vetorEstatico[2] = 30;
        vetorEstatico[3] = 40;
        vetorEstatico[4] = 50;
        vetorDinamico.add(11);
        vetorDinamico.add(12);
        vetorDinamico.add(13);
        vetorDinamico.add(14);
        vetorDinamico.add(15);
        //mostrar dados
        System.out.println(vetorEstatico[2]);
        System.out.println(vetorDinamico.get(2));
    }//main
}//class

