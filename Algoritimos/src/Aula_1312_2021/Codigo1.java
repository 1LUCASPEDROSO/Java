package Aula_1312_2021;
import java.util.Scanner;
public class Codigo1 {
    public static void main(String[] args) {
    Scanner read=new Scanner (System.in);
    int do_while=0, volta=0;
    do { System.out.println("estou no do_while");
        System.out.println("deseja reiniciar ?\n 1 - sim \n 2 - não");
        volta =read.nextInt();
    }while (volta== 1);
    }//main 
}//class
