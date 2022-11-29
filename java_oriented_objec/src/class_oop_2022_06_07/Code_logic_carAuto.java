/*O custo de um carro novo ao consumidor é a soma do custo de fábrica
com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para receber o custo de fábrica de um carro, calcular e mostrar
o custo final ao consumidor.*/
package class_oop_2022_06_07;
import java.util.Scanner;

public class Code_logic_carAuto {
    
  Scanner read = new Scanner (System.in);  
   private  double car_price,total_distribuitor,total_tax,total_price_car;
   
  public Code_logic_carAuto (double first_price_car){
     car_price = first_price_car;
     }//  END Contruction method

    public double getTotal_price_car() {
        total_price_car = (car_price + total_distribuitor) + total_tax;//(car_price * 73)/100 ;
        return total_price_car;
    }

    public double total_distribuitor (){
     total_distribuitor = total_distribuitor + (car_price * 28)/100;
     return total_distribuitor;
    }
    
    public double total_tax (){
     total_tax = (car_price * 45)/100;
     return total_tax;
    }











}// class
