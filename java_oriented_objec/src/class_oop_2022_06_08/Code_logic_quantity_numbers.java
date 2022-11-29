/*1)Criar um algoritmo que recebe uma quantidade não determinada de números.
-> Após inserir o nº, o sistema deve perguntar se deve para ou não.
-> Quando for escolhido "PARAR O SISTEMA", deve ser mostrado:
  + Quantidade de nº inseridos
  + Soma desses nº
  + O maior valor de nº inserido
  + O menor valor de nº inserido
  + A média dos valores*/

package class_oop_2022_06_08;
import java.util.*;

public class Code_logic_quantity_numbers {
Scanner read = new Scanner (System.in); 
private int number,quntity_numbers,soma_numbers,higher_nuber,lower_number,avarange_numbers;

    public int show_menu(String title) {
        System.out.print("digit one number:");
        number = read.nextInt();
        soma_numbers = number + number;
        if (number > number++) {
            number = higher_nuber;
        } else if (number < number++) {
            number = lower_number;
        }
        quntity_numbers = number++;
        avarange_numbers = soma_numbers / quntity_numbers;
        System.out.println("digit [1] for exit menu");
        System.out.println("digit [2] for show menu again");
        System.out.print("digit here: ");
        return Integer.parseInt(read.next());
}
 public void results (){
     System.out.println("total quantity numbers in system is: "+ quntity_numbers);
     System.out.println("total in adition int system is: "+ soma_numbers);
     System.out.println("the higher number is: "+higher_nuber );
     System.out.println("the lower number is: "+lower_number);
     System.out.println("the avarange in system is: "+avarange_numbers);
 }// End method results
}// class logic
