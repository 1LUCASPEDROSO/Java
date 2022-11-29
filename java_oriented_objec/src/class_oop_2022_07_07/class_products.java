package class_oop_2022_07_07;
import java.util.*;
public class class_products implements Interface_padaria {
    private  ArrayList price_product  = new ArrayList <>();
    private double count;
    private int choice,quantity;
    Scanner read = new Scanner (System.in);
    
    @Override
    public void set_product() { 
     price_product.add("chocolate bar" + 12.90);
     price_product.add("rufles green" + 7.90);
     price_product.add("doritos" + 10.00);
     price_product.add("bis extra" + 3.80);
     price_product.add("croissant with chease and ham" + 11.50);
    }
      @Override
    public void show_products() {
        System.out.println("==== \n PADARIA DO SEU JOAQUIM \n ====");
        System.out.println("We have this products today");
        System.out.println(""+price_product.get(0));
        System.out.println(""+price_product.get(1));
        System.out.println(""+price_product.get(2));
        System.out.println(""+price_product.get(3));
        System.out.println(""+price_product.get(4));
            }// END method     

    @Override
    public double calculate_count() {
        System.out.print("digit here your your choice");
        choice = read.nextInt();
        switch (choice){
            case 0:
                System.out.print("digit here quantity for launch: ");
                quantity = read.nextInt();
                count = quantity * 12.90;
                System.out.println("your total is: "+count);
        break;
        case 1:
                System.out.print("digit here quantity for launch: ");
                quantity = read.nextInt();
                count = quantity * 7.90;
                System.out.println("your total is: "+count);
        break;
        case 2:
                System.out.print("digit here quantity for launch: ");
                quantity = read.nextInt();
                count = quantity * 10.00;
                System.out.println("your total is: "+count);
        break;
        case 3:
                System.out.print("digit here quantity for launch: ");
                quantity = read.nextInt();
                count = quantity * 3.80;
                System.out.println("your total is: "+count);
        break;
        case 4:
                System.out.print("digit here quantity for launch: ");
                quantity = read.nextInt();
                count = quantity * 11.50;
                System.out.println("your total is: "+count);
        break;
        }// End switch case  
       return count; 
    }

    
}// class
