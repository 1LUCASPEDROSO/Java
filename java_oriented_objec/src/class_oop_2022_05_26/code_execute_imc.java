package class_oop_2022_05_26;
import java.util.*;

public class code_execute_imc {
    public static void main(String[] args) {
     Scanner read = new Scanner (System.in);  
     int option = 0;
     Code_logic_imc Logic = new Code_logic_imc ();
      do{ 
        option = Logic.menu();   
      } while (option == 2); // End do/while
      Logic.data();
        System.out.println("Back again :) ");
     }// main
}// class execute
