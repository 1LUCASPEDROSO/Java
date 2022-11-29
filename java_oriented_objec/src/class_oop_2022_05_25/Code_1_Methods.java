package class_oop_2022_05_25;
import java.util.*;
public class Code_1_Methods {
 Scanner read = new Scanner(System.in);
 
 
 // Method with return and parameters arguments
 public int Vizualize_menu(String title){
   
     
     System.out.println(title);
     System.out.println("1 - Show menu");
     System.out.println("2 - Exit menu");
     return Integer.parseInt(read.next());
     
 }// End method vizualize_menu
 
// Method havent return and have aprameters arguments
 public void Verification (int number){

     if (number == 0) System.out.println("N is zero");
     else if (number < 0) System.out.println("N is negative");
     else System.out.println("This number is positive");
     
 }// End Method havent return and have aprameters arguments
 
 // Method have return and most parameters arguments
 public double Descount_calculator (double valor1 ,double valor2){
 
 double Desc_value = valor1 * (valor2 / 100); //local atribute
 return valor1 - Desc_value;
 
 } // End Method have return and most parameters arguments
 
 
 
 
}// Class
