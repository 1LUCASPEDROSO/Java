/*O custo de um carro novo ao consumidor é a soma do custo de fábrica
com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para receber o custo de fábrica de um carro, calcular e mostrar
o custo final ao consumidor.*/
package class_oop_2022_06_07;
import java.util.*;

public class Code_execute_carAUTO {
    public static void main(String[] args) {
        double car_price;
        Code_logic_carAuto Logic = new Code_logic_carAuto(300950.00);
        System.out.println("total tax for distribuitor is: R$ "+Logic.total_distribuitor());
        System.out.println("**********************************************");
        System.out.println("total tax is: R$ "+Logic.total_tax());
        System.out.println("**********************************************");
        System.out.println("total price for BMW i3 is: R$ "+ Logic.getTotal_price_car());
        
    }// main
}// class
