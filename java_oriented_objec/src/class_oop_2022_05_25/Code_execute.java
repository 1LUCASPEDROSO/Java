package class_oop_2022_05_25;
import java.util.Scanner;

public class Code_execute {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
    Code_1_Methods Objeto_1 = new Code_1_Methods ();    
     int Option;   
        
    do { 
     Option = Objeto_1.Vizualize_menu("===== MENU =====");
    }while(Option == 1); // End while   
        
    System.out.print("Digit number: "); 
     Objeto_1.Verification(read.nextInt());
        
        System.out.print("Digit two numbers for descount calculator: ");     
        double return_1 = Objeto_1.Descount_calculator(read.nextDouble(), read.nextDouble());
        System.out.println("Descount value is: "+ return_1);
        
    }// main
}// class execute
