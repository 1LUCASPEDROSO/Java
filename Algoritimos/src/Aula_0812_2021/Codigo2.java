////2) CINEMA:
////No cinema Tarantino, há cinco filmes em exibição
////Kill Bill
////Pulp Fiction
////Cães de Aluguel
////Os 8 Odiados 
////Django - Livre
////Crie um algoritmo que registre a escolha do filme, se prefere o áudio em 
//português (dublado - R$20,00) ou o áudio original (com legendadas - R$23,00).
////Após a escolha do filme o usuário deverá escolher o lanche para o
//acompanhamento.
////No final o programa terá que disponibilizar ao cliente o troco devido,
//o filme e o lanche escolhidos. 
////Opções de alimentos:
//Lanches 
//Pipoca doce | R$10,00
//Pipoca salgada | R$8,00
//Bebidas
//Guaraná 500ml| R$4,50
//Coca-Cola 500ml| R$5,00
//Fanta 500ml | R$3,50
package Aula_0812_2021;

import java.util.Scanner;

public class Codigo2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int filme;
        int l;
        int valorF;
        int vl;
        int bebida;
        float total;

        System.out.println("filme em cartas");
        System.out.println(" 1 -Kill Bill\n"
                + " 2- Pulp Fiction\n"
                + " 3- Cães de Aluguel\n"
                + "4- Os 8 Odiados \n"
                + "5 -Django - Livre");

        System.out.println("digite o filme:");
        filme = read.nextInt();
        System.out.println("1- legendado (R$20) ou 2- dublado (R$23)");
        l = read.nextInt();

        switch (l) {
            case 1:
                valorF = 20;
            case 2:
                valorF = 23;
                  }//fimswitch

                System.out.println("digite o lanche 1 - pipoca doce (R$10) 2- pipoca salgada (R$8)");
                vl = read.nextInt();
                
                switch (vl){
                    case 1: 
                        vl = 10; 
                    case 2:
                        vl= 8;
                }//fimswitch

        System.out.println("digite a bebida: 1- guarana 50ml 5,00 \n 2- coca-cola 500ml 6,00 \n 3- fanta 500ml 4,00");
        bebida = read.nextInt();
        
 switch (bebida){
     
     case 1 :
         bebida = 5;
     case 2: 
         bebida = 6;
         
     case 3: 
         bebida = 4;
 
 } // fimswitch
      
 total = (bebida + vl) + l;     
      
        System.out.println("total R$: "+total);     

    }//main 
}//class
