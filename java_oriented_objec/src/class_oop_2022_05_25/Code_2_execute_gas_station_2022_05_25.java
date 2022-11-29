/*1) Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool até 20 litros, desconto de 3% acima de 20 litros, desconto de 5% 
Gasolina até 20 litros, desconto de 4% acima de 20 litros, desconto de 6% 
Criar um algoritmo que leia a quantidade de litros vendidos e o tipo de combustível 
(codificado da seguinte forma: A-álcool, G-gasolina). O sistema deve calcular
e mostrar o valor a ser pago pelo cliente sabendo-se que o preço 
do litro da gasolina é R$ 5,50 e o preço do litro do álcool é R$ 4,50.*/
package class_oop_2022_05_25;
import java.util.*;

public class Code_2_execute_gas_station_2022_05_25 {
    public static void main(String[] args) { 
        Scanner read = new Scanner(System.in);
        Code_2_gas_station_2022_05_25 Objeto_1 = new Code_2_gas_station_2022_05_25 ();
         int option;
         do {
            option = Objeto_1.Vizualize_meu("==== MENU ====");
        }while(option == 3) ;// End while
         
         if (option == 1){Objeto_1.C_alcool();}
         else if (option == 2){Objeto_1.C_gasolina();}
         
    }// main
}// class
