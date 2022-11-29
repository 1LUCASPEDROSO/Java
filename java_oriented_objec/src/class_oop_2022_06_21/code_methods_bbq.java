package class_oop_2022_06_21;
import java.util.*;
public class code_methods_bbq {
    
    public static void main(String[] args) {
        
    // objects    
     code_gest_acessories_bbq List_acessories = new code_gest_acessories_bbq ();
     code_gest_meat List_meat = new code_gest_meat ();
     code_gest_drinks List_drinks = new code_gest_drinks ();
     Scanner read = new Scanner(System.in);
    //objects    
    /////////////////////////////////////////////////////////////////////////
    // variables
    int quantity_man,quantity_woman;
    double price_drinks=0,price_meat,price_acessories;
    String name_churras;
    // variables 
        System.out.print("Digit here the name of churras: "); 
        name_churras = read.next();
        System.out.print("digit here the quantity of man's in your "+name_churras+": ");
        quantity_man = read.nextInt();
        System.out.print("digit here the quantity of woman's in your "+name_churras+": ");
        quantity_woman = read.nextInt();
        if (quantity_man > quantity_woman){System.out.println("in next churras invite more girl's");}
        else if (quantity_woman > quantity_man){System.out.println("in next churas invite more boys'");}
        else {System.out.println("==== it's perfect combination ====");}
        for (int i=0; i<=List_drinks.list_man.size();i++){
             List_drinks.set_quantity_drinks_man();
             price_drinks =  i * quantity_man;   
          break;
        }// END FOR of gest drinks
        System.out.println("the price for DRINKS of ALL man is: R$ "+price_drinks);    
    }// main  
}// End class method
