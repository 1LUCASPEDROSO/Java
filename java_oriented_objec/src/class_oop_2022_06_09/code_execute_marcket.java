/*Sistema de compra de um mercadinho
O sistema deve cadastrar inicialmente o nome de 10 produtos
O sistema deve cadastrar inicialmente a quantidade total de cada uma dessas mercadorias em estoque
O sistema deve cadastrar inicialmente o valor unitário desses produtos 
Quando o usuário realiza sua compra, deve indicar o nome e inserir a quantidade de cada produto que escolheu
se a quantidade em estoque do produto for menor que a quantidade da compra, o sistema não realiza essa compra
senão o sistema realiza a compra e pergunta ‘MAIS MERCADORIAS (S/N)?’
 se for 'SIM' o usuário deve inserir um novo produto e sua quantidade
 senão o sistema deve finalizar a compra e mostrar o valor a pagar*/

package class_oop_2022_06_09;
import java.util.Scanner;

public class code_execute_marcket {
    public static void main(String[] args) {
     Scanner read = new Scanner (System.in);    
     code_logic_marcket Logic = new code_logic_marcket();
     int option = 0;
     do{

    Logic.purchase_product();
    

    
        System.out.println("would you like to a meke a new purchase?\n [1]-yes\n[2]- no");
        System.out.println("digit here: ");
     option = read.nextInt();
     }while (option == 1);
     
  
     
     
     
     
     
     
     
     
    }// main
}// class execute
