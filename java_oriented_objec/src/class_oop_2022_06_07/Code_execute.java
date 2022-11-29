package class_oop_2022_06_07;
import java.util.*;
public class Code_execute {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        Code_logic  Logic = new Code_logic (10.00);
        Code_logic  Logic2 = new Code_logic (10000.00);
        double deposity;
    
        System.out.println("your current_ballance in count_1: R$" + Logic.get_Ballance());// show the first ballance_account
        System.out.print("add deposity in count_1: R$"); deposity = read.nextDouble(); // digit number for variable deposity
        Logic.add(deposity);
        System.out.println("total in current_1 is:R$ "+Logic.get_Ballance());
        System.out.println("***********************************************");
         System.out.println("your currewnt_ballance in count_2: R$" + Logic2.get_Ballance());// show the first ballance_account
        System.out.print("add deposity in count_2: R$"); deposity = read.nextDouble(); // digit number for variable deposity
        Logic2.add(deposity);
        System.out.println("total in count_2 is:R$ "+Logic2.get_Ballance());  
    }//main
}// class
