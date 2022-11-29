
package class_oop_2022_06_13;
import java.util.*;

public class Code_data_types_execute {

    public static void main(String[] args) {

        String name, email, url, login, password;
        int telefone01, telefone02, option = 0, repeat = 0, count = 0,option_contact =0;
        Scanner read = new Scanner(System.in);

        code_gest_data Logic = new code_gest_data();
        code_logic_login_password LP = new code_logic_login_password();

        do {
            if (count > 0) {
                do{
                System.out.print("digit here the name of contact: ");
                name = read.next();
                System.out.print("digit here  email of contact: ");
                email = read.next();
                System.out.print("digit here the first phone of contact: ");
                telefone01 = read.nextInt();
                System.out.print("digit here the second phone of contact: ");
                telefone02 = read.nextInt();
                System.out.print("digit here the URL social for contact: ");
                url = read.next();
                Logic.gerater_contacts(name, email, url, telefone01, telefone02);
                System.out.println("==== CONTACT REGISTRER");
                    System.out.println("another contact? [1] - yes [2] - exit and crete login ");
                    option_contact = read.nextInt();
                } while (option_contact ==1);
            }// END IF COUNT 
            option = 0;
            System.out.println("digit-\n [1] - gerator cadastrer end valid the user");
            System.out.print("Digit here: ");
            option = read.nextInt();
            if (option == 1) {
                System.out.print("login: ");
                login = read.next();
                System.out.print("password: ");
                password = read.next();
                LP.gerater(login, password);
                System.out.println("=== LOGIN AND PASSWORD REGISTRER ====");
                System.out.println("====================================");
                System.out.print("digit here your login: ");
                login = read.next();
                System.out.print("digit here your password: ");
                password = read.next();
                if (LP.valid(login, password) == false) {
                    System.out.println("login invalid");
                    do {
                        System.out.println("digit-\n [1] - gerator cadastrer and valid the user");
                        System.out.print("Digit here: ");
                        option = read.nextInt();
                        System.out.print("login: ");
                        login = read.next();
                        System.out.print("password: ");
                        password = read.next();
                        LP.gerater(login, password);
                        System.out.println("=== LOGIN AND PASSWORD REGISTRER ====");
                        System.out.println("====================================");
                        System.out.print("digit here your login: ");
                        login = read.next();
                        System.out.print("digit here your password: ");
                        password = read.next();
                        System.out.println("=== LOGIN ACEPTED/2 ====");
                        System.out.print("digit here the name of contact: ");
                        name = read.next();
                        System.out.print("digit here  email of contact: ");
                        email = read.next();
                        System.out.print("digit here the first phone of contact: ");
                        telefone01 = read.nextInt();
                        System.out.print("digit here the second phone of contact: ");
                        telefone02 = read.nextInt();
                        System.out.print("digit here the URL social for contact: ");
                        url = read.next();
                        Logic.gerater_contacts(name, email, url, telefone01, telefone02);
                        System.out.println("==== CONTACT REGISTRER");
                    } while (option != 1);
                } else {
                    System.out.println("login acepted");
                    System.out.print("digit here the name of contact: ");
                    name = read.next();
                    System.out.print("digit here  email of contact: ");
                    email = read.next();
                    System.out.print("digit here the first phone of contact: ");
                    telefone01 = read.nextInt();
                    System.out.print("digit here the second phone of contact: ");
                    telefone02 = read.nextInt();
                    System.out.print("digit here the URL social for contact: ");
                    url = read.next();
                    Logic.gerater_contacts(name, email, url, telefone01, telefone02);
                    System.out.println("==== CONTACT REGISTRER");
                }
            }// End IF
            System.out.println("digit:\n [1] - for again \n [2] - exit");
            System.out.print("Digit here: ");
            repeat = read.nextInt();
            count++;
        } while (repeat == 1); // end do/while   
        Logic.List_contacts();
    }// main
}// class
