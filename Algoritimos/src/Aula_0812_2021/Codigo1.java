////1) TORNEIO DE FUTEBOL:
////Faça um algoritmo que cadastre as equipes de futebol para um torneio. 
////Serão 4 times. 
////O torneio deve ter 4 jogos. 
////Os dois primeiros jogos (AxB e CxD).
////Os dois últimos jogos deve ser a disputa de 3º colocado (perdedor de AxB 
//contra perdedor de CxD) e campeão (confronto entre vencedor 
//AxB contra vencedor CxD).
////Ao final deve ser mostrada a classificação geral.
////Obs.: como é um campeonato no estilo "mata-mata" o jogo que der empate deve 
//ser definido nos pênaltis
////Pressione Shift + Tab para acessar o histórico do bate-papo.

package Aula_0812_2021;
import java.util.Scanner;
public class Codigo1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String time1;
        String time2;
        String time3;
        String time4;
        String vencedor1 = null;
        String vencedor2 = null;
        String perdedor1 = null;
        String perdedor2 = null;
        String terceiro_lugar = null;
        String quarto_lugar = null;
        String campeao = null;
        String vice_campeao = null;
        int gols1;
        int gols2;
        int gols3;
        int gols4;
        int gols5;
        int gols6;
        int gols7;
        int gols8;
        int penalti1;
        int penlati2;
        int penalti3;
        int penalti4;
        int penalti5;
        int penalti6;
        int penalti7;
        int penalti8;
// null nas String
        System.out.print("\ndigite o 1º time do 1º jogo: ");
        time1 = read.next();
        System.out.print("digite quantos gols fez: ");
        gols1 = read.nextInt();
        System.out.print("digite o 2º time do 1º jogo: ");
        time2 = read.next();
        System.out.print("digite quantos gols fez: ");
        gols2 = read.nextInt();
        if (gols1 > gols2) {
            System.out.print("vencedor é: "+time1);
            vencedor1=time1;
            perdedor1=time2;
        }//fimif
        else if(gols2 > gols1){
            System.out.print("vencedor é: " + time2);
            vencedor1 = time2;
            perdedor1 = time1;
        } else if (gols1 == gols2) {
            System.out.print("partida deu empate, vamos ao penaltis !!!!!!");
            System.out.print("digite o penaltis " + time1 + ":");
            penalti1 = read.nextInt();
            System.out.print("digite o penaltis " + time2 + ":");
            penlati2 = read.nextInt();
            if (penalti1 > penlati2) {
                System.out.print("vencedor nos penaltis: " + time1);
                vencedor1 = time1;
                perdedor1 = time2;
            }//if dentro
            else if (penlati2 > penalti1) {
                System.out.print("vencedor nos penaltis: " + time2);
                vencedor1 = time2;
                perdedor1 = time1;}}
        // jogo 2º 
        System.out.print("\ndigite o 1º time do 2º jogo: ");
        time3 = read.next();
        System.out.print("digite quantos gols fez ");
        gols3 = read.nextInt();
        System.out.print("digite o 2º time do 2º jogo: ");
        time4 = read.next();
        System.out.print("digite quantos gols fez ");
        gols4 = read.nextInt();
        if (gols3 > gols4) {
            System.out.print("vencedor é: " + time3);
            vencedor2 = time3;
            perdedor2 = time4;
        }//fimif
        else if (gols4 > gols3) {
            System.out.print("vencedor é: "+time4);
            vencedor2 = time4;
            perdedor2 = time3;
        } else if (gols3 == gols4) {
            System.out.print("partida deu empate, vamos ao penaltis !!!!!!");
            System.out.print("digite o penaltis " + time3 + ":");
            penalti3 = read.nextInt();
            System.out.print("digite o penaltis " + time4 + ":");
            penalti4 = read.nextInt();
            if (penalti3 > penalti4) {
                System.out.print("vencedor nos penaltis: " + time3);
                vencedor2 = time3;
                perdedor2 = time4;
                //if dentro
            } else if (penalti4 > penalti3) {
                System.out.print("vencedor nos penaltis: " + time4);
                vencedor2 = time4;
                perdedor2 = time3;}}
// jogo do vice 
        System.out.print("\ndigite quantos gols fez " + vencedor1);
        gols5 = read.nextInt();
        System.out.print("digite quantos gols fez " + vencedor2);
        gols6 = read.nextInt();
        if (gols5 > gols6) {
            System.out.print("vencedor é: "+vencedor1);
            campeao = vencedor1;
            vice_campeao = vencedor2;
        }//fimif
        else if (gols6 > gols5) {
            System.out.print("vencedor é: "+vencedor2);
            campeao = vencedor2;
            vice_campeao = vencedor1;
        } else if (gols5 == gols6) {
            System.out.print("partida deu empate, vamos ao penaltis !!!!!!");
            System.out.print("digite o penaltis " + vencedor1 + ":");
            penalti5 = read.nextInt();
            System.out.print("digite o penaltis " + vencedor2 + ":");
            penalti6 = read.nextInt();
            if (penalti5 > penalti6) {
                System.out.print("vencedor nos penaltis: " + vencedor1);
                campeao = vencedor1;
                vice_campeao = vencedor2;
                //if dentro
            } else if (penalti6 > penalti5) {
                System.out.print("vencedor nos penaltis: " + vencedor2);
                campeao = vencedor2;
                vice_campeao = vencedor1;}}
// jogo 3 pe1
        System.out.print("\ndigite quantos gols fez " + perdedor1);
        gols7 = read.nextInt();
        System.out.print("digite quantos gols fez " + perdedor2);
        gols8 = read.nextInt();

        if (gols7 > gols8) { System.out.print("vencedor é: " + perdedor1);
            terceiro_lugar = perdedor1;
            quarto_lugar = perdedor2;
            System.out.println("o " + perdedor1 + "é 3º lugar");}//fimif
        else if (gols8 > gols7) {System.out.print("vencedor é: " + perdedor2);
            terceiro_lugar = perdedor2;
            quarto_lugar = perdedor1;
            System.out.print("o " + perdedor2 + "é 3º lugar");
        } else if (gols7 == gols8) {
            System.out.print("partida deu empate, vamos ao penaltis !!!!!!");
            System.out.print("digite o penaltis " + perdedor1 + ":");
            penalti7 = read.nextInt();
            System.out.print("digite o penaltis " + perdedor2 + ":");
            penalti8 = read.nextInt();

            if (penalti7 > penalti8) {
                System.out.println("vencedor nos penaltis: " + perdedor1);
                terceiro_lugar = perdedor1;
                quarto_lugar = perdedor2;
                //if dentro
            } else if (penalti8 > penalti7) {
                System.out.print("vencedor nos penaltis: " + perdedor2);
                terceiro_lugar = perdedor2;
                quarto_lugar = perdedor1; }}
        // tabela
        System.out.print("\ncampeão: " + campeao);
        System.out.print("vice-campeão: " + vice_campeao);
        System.out.print("3º lugar: " + terceiro_lugar);
        System.out.print("4º lugar: " + quarto_lugar);
    } //main  
}//class  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  