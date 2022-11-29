package class_oop_2022_06_07;
import java.util.*;
public class Code_logic {
  Scanner read = new Scanner (System.in); 

private double ballance_account; 
  

public Code_logic (double first_ballance){
// set first ballance 

ballance_account = first_ballance;
}//  END Contruction method

public void add (double quantity){
ballance_account = ballance_account + quantity;
}// End method hevent return with arguments

public double get_Ballance (){
    
return ballance_account;

}// End method Get_ballance

}// class logic
