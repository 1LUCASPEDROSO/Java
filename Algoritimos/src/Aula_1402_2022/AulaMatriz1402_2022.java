package Aula_1402_2022;

import java.util.*;

public class AulaMatriz1402_2022 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        //declaração de uma matriz sem valores
        String produto[][] = new String[2][2];

        //declaração de uma matriz com valores
        int valor[][] = {{10, 11}, {20, 21}};

        //inserir dados
        produto[1][0] = "pera";

        System.out.println("Digite os produtos: ");

        for (int linha = 0; linha < 2; linha++) {

            for (int coluna = 0; coluna < 2; coluna++) {

                produto[linha][coluna] = leia.next();

            }

        }

        //mostra os dados
        System.out.println("==> " + produto[1][0]);

        for (int linha = 0; linha < 2; linha++) {

            System.out.println("");

            for (int coluna = 0; coluna < 2; coluna++) {

                System.out.print("[" + produto[linha][coluna] + "] ");

            }
        }
    }//class
}//main

