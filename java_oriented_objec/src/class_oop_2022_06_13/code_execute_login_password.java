
package class_oop_2022_06_13;
import java.util.*;

public class code_execute_login_password {
    public static void main(String[] args) {
     Scanner read = new Scanner (System.in);
     code_logic_login_password logic = new code_logic_login_password ();
     int repeat, option; 
     String login, password;
   
        do {
            System.out.println("digit-\n [1] - gerator cadastrer  \n [2] - list_logins\n [3] - valit the login");
            System.out.print("Digit here: ");
            option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.print("login: ");
                    login = read.next();
                    System.out.print("password: ");
                    password = read.next();
                    logic.gerater(login, password);
                    break;
                case 2:
                    logic.List_login();
                    break;
                case 3:
                    System.out.print("digit here your login: ");
                    login = read.next();
                    System.out.print("digit here your password: ");
                    password = read.next();
                    if (logic.valid(login, password) == false) {
                        System.out.println("login invalid");
                    } else {
                        System.out.println("login acepted");
                    }
                    break;
            }// End switch case
            System.out.println("digit:\n [1] - for again \n [2] - exit");
            System.out.print("Digit here: ");
            repeat = read.nextInt();
        } while (repeat == 1); // end do/while             
    }// main    
}// class
