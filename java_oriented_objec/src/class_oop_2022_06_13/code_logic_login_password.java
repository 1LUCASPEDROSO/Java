
package class_oop_2022_06_13;
import java.util.ArrayList;

public class code_logic_login_password {
   private String login,password;
   ArrayList<code_logic_login_password> list = new ArrayList<>(); 
   
   
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    public void gerater(String login, String password) {
        code_logic_login_password log = new code_logic_login_password();
        log.setLogin(login);
        log.setPassword(password);
        list.add(log);
    }// method insert login and password  

    public boolean valid(String login, String password) {
        boolean return_1 = false;
        for (int i = 0; i < list.size(); i++) {
            if (login.equals(list.get(i).login) && password.equals(list.get(i).password)) {
                return_1 = true;
            } // end if
        }// end for
       return return_1;
    }// end mthod gerater

public void  List_login(){
    for (int i = 0; i < list.size(); i++) {
     System.out.println((i+1)+ " login: "+list.get(i).login+ " I "+(i+1)+" password "+list.get(i).password);
    }// End for write logins and passswords
}// End method list-login
}// class
