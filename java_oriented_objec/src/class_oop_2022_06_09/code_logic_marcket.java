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


public class code_logic_marcket {

    Scanner read = new Scanner(System.in);
    String name_product;
    int quantity_product;
    float count;

    public void purchase_product() {
        
    String[] product = new String[10];
    product [0] = "batata";  
    product [1] = "feijão";
    product [2] = "doritos";
    product [3] = "rufles";
    product [4] = "chocolate";
    product [5] = "pringles";
    product [6] = "tomate";
    product [7] = "arroz";
    product [8] = "sushi";
    product [9] = "beterraba";
    
      int[] quantity = new int[10];
     quantity [0] = 5;
     quantity [1] = 15;
     quantity [2] = 23;
     quantity [3] = 77;
     quantity [4] = 1;
     quantity [5] = 45;
     quantity [6] = 0;
     quantity [7] = 22;
     quantity [8] = 12;
      quantity [9] = 88;
  
      float[] price_product = new float[10];
      price_product [0]= 55.1f;
      price_product [1]= 45.1f;
      price_product [2]= 35.1f;
      price_product [3]= 15.1f;
      price_product [4]= 95.1f;
      price_product [5]= 22.1f;
      price_product [6]= 88.1f;
      price_product [7]= 23.1f;
      price_product [8]= 3.1f;
      price_product [9]= 1.0f;
                              
        System.out.print("digit here name of product: ");
        name_product = read.next();
        for (int a = 0; a < product.length; a++) {
            if (name_product.equalsIgnoreCase(product[a])) {
                System.out.print("digit here the quantity:");
                quantity_product = read.nextInt();
                if (quantity[a] >= quantity_product) {
                    count = price_product[a] * quantity_product;
                    System.out.println("total is: R$ "+count);
                }
                else if (quantity_product >quantity[a]){
                    do {
                 System.out.print("havent this product in system, please repeat the quantity: ");
                quantity_product = read.nextInt();
                    }while (quantity_product >quantity[a]);}
            }// end if
            else {
                do {
                System.out.println("digit another product again:");
                  name_product = read.next();
                }while(!name_product.equalsIgnoreCase(product[a]));}
        }// end for
    }// method purchace_product 
}// class
 