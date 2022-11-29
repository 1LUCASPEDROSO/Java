package class_oop_2022_07_08;

import java.util.Scanner;

public class InnerClass_1 {    
    
public enum drinks {

CocaCola ("coca-cola",7.90),
juice ("juice",5.10),
water ("water", 1.00);
private String name;
private double price;

        private drinks(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
}// final class ENUM drinks    
    
public enum food {
    sawdich ("sawdich",5),
    hot_dog ("hot-dog",7),
    xburger ("x-burger",10);
    private String name;
    private double price;

        private food(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
}// final class enum  Food  
    
 public static void menu(){
 
     System.out.println("====\n DRINKS \n====");
     System.out.println("[1] - "+drinks.CocaCola.getName()+"R$: "+drinks.CocaCola.getPrice());
     System.out.println("[2] - "+drinks.juice.getName()+"R$: "+drinks.juice.getPrice());
     System.out.println("[3] - "+drinks.water.getName()+"R$: "+drinks.water.getPrice());
     
     System.out.println("====\n LUNCH \n====");
     System.out.println("[4] - "+food.sawdich.getName()+"R$: "+food.sawdich.getPrice());
     System.out.println("[5] - "+food.hot_dog.getName()+"R$: "+food.hot_dog.getPrice());
     System.out.println("[6] - "+food.xburger.getName()+"R$: "+food.xburger.getPrice());
     System.out.println("[0] - to exit menu");
     System.out.print("digit here your option: ");

 }// End Method menu   
    
public static double calculateForTotalLunch (int option){
    


switch (option){
    case 1:
        return drinks.CocaCola.getPrice();
    case 2:
        return drinks.juice.getPrice();
    case 3:
        return drinks.water.getPrice();
    case 4:
        return food.sawdich.getPrice();
    case 5:
        return food.hot_dog.getPrice();
    case 6:
        return food.xburger.getPrice();
    default : return 0.0;

}// ENd swith case for option lunch
}// END method fot calculate for total lunch

 public static void main(String[] args) {
    Scanner read = new Scanner(System.in);    
    double totalforLunch =0.0;
    int option=0;
        
    do{
    menu();
    option = read.nextInt();
    totalforLunch += calculateForTotalLunch (option);
        System.out.println("lunch selected he was "+option);
        System.out.println("Total is: R$: "+totalforLunch);
    
    
    
    
    
    
    }while (option != 0);    





 }// main
}// class
