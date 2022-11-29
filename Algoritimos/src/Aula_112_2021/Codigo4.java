/*3. Uma fábrica oferece às suas operárias um auxílio mensal além do salário. 
Para as casadas sem filhos, o auxilio mensal é de 15% do seu salário-base.
Para as que têm filhos, casadas ou não, o auxílio é de 35% do salário-base.
Para as solteiras sem filhos, não há auxílio extra. Faça um algoritmo
que receba a opção (1, 2 ou 3) que determine em que categoria a funcionária
se encontra, o valor do salário-base (igual para todas) e mostre o valor do
salário com o auxílio.*/
package Aula_112_2021;
import java.util.Scanner;
public class Codigo4 {
    public static void main(String[] args) {
    Scanner read = new Scanner (System.in);     
        float sb=10;
        float s=10;
        int sf;
        float sff;
        System.out.println(" 1- casada sem filhos\n 2- com filhos\n  3- solteira sem filhos");
        System.out.println("digite sua situação: ");
        sf = read.nextInt();
        switch (sf){
            case 1:
                sff = sb + (s*15/100);
                System.out.println("total:"+sff);
                break;
            case 2:
                sff = sb + (s*35/100);
                System.out.println("total:"+ sff);
                break;
        case 3:
                System.out.println("vc não tem auxilio");
                break;
        }//fim switch
    }//main   
}//class
