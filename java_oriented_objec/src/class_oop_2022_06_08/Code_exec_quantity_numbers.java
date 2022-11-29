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

public class Code_exec_quantity_numbers {
    public static void main(String[] args) {
     Scanner read = new Scanner (System.in);  
 Code_logic_quantity_numbers Logic = new Code_logic_quantity_numbers();
 
   int option =0;
   do {
   option = Logic.show_menu("=== MENU ===");
   }while (option == 2);
   Logic.results();
  }// main
}// class execute
