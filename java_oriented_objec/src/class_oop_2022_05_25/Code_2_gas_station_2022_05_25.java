/*1) Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool até 20 litros, desconto de 3% acima de 20 litros, desconto de 5% 
Gasolina até 20 litros, desconto de 4% acima de 20 litros, desconto de 6% 
Criar um algoritmo que leia a quantidade de litros vendidos e o tipo de combustível 
(codificado da seguinte forma: A-álcool, G-gasolina). O sistema deve calcular
e mostrar o valor a ser pago pelo cliente sabendo-se que o preço 
do litro da gasolina é R$ 5,50 e o preço do litro do álcool é R$ 4,50.*/

package class_oop_2022_05_25;
import java.util.*;

public class Code_2_gas_station_2022_05_25 {
    
    Scanner read = new Scanner (System.in);
    double total,descount,final_value;
     
    public int Vizualize_meu (String title){
        System.out.println(title);
        System.out.println("[1] - Alcool");
        System.out.println("[2] - Gasolina");
        System.out.println("[3] - Show menu again");
        return Integer.parseInt(read.next());
    }// End Method with retur and 
    
 public void C_alcool() {
      double alcool; // local atributte
      
          System.out.println("digit the quantity of alcool: "); alcool = read.nextDouble();
          if (alcool <= 20){
           total = alcool * 4.50;
           descount = total/(100*3);
           final_value = total - descount;
              System.out.println("Your total with descount is R$: "+final_value);
          }// End if  
          
          else if (alcool >=20){
            total = alcool * 4.50;
           descount = total/(100*5);
           final_value = total - descount;
              System.out.println("Your total with descount is R$: "+final_value);
          }// End elseif
      }// End method alcool

 public void C_gasolina() {
    double gasolina; // local atributte
    
          System.out.println("digit the quantity of gasolina: "); gasolina = read.nextDouble();
          if (gasolina <= 20){
           total = gasolina * 5.50;
           descount = total/(100*4);
           final_value = total - descount;
              System.out.println("Your total with descount is R$: "+final_value);
          }// End if  
          
          else if (gasolina >=20){
            total = gasolina * 5.50;
           descount = total/(100*6);
           final_value = total - descount;
              System.out.println("Your total with descount is R$: "+final_value);
          }// End elseif
          
      }// End method gasolina
}// Class
