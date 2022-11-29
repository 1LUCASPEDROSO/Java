package Aula_2311_2021;
import java.util.Scanner;
public class Codigo1 {
    public static void main(String[] args) {   
     // atributo de dado com tipo primitovo
     float porcentagem1,porcentagem2;
     float cf;
     float pf;
     float precoFinal;
    // atributo de dado por refêrencia SEMPRE ÉUM CLASSE
     Scanner leia= new Scanner(System.in);
    System.out.print("insira o custo de fábrica: "); 
    cf = leia.nextFloat();    
    System.out.print("insira a porcentagem do distribuidor:");
    porcentagem1 = leia.nextFloat();    
    System.out.print("insira a porcentagem do imposto:");
    porcentagem2 = leia.nextFloat();    
    precoFinal = (cf * (porcentagem1 + porcentagem2 + 100))/100;
    System.out.print("preço final R$: "+precoFinal);
    //System.out.println(String.format("preço final R$ %f"));
     }//maiN
}//class
