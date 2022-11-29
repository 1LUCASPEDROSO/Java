
package class_oop_2022_06_13;
import java.util.*;

public class code_gest_data {
    ArrayList <code_datatypes> list = new ArrayList<>(); 
    
    
      public void gerater_contacts(String nome, String email,String url,int telefone1,int telefone2) {
        code_datatypes Data = new code_datatypes();
        Data.setNome(nome);
        Data.setEmail(email);
        Data.setUrl(url);
        Data.setTelefone01(telefone1);
        Data.setTelefone02(telefone2);
        list.add(Data);
      } 
      public void  List_contacts(){
    for (int i = 0; i < list.size(); i++) {
     System.out.println((i+1)+ " name contact: "+list.get(i).getNome()+ " I "+(i+1)+" telefone_1 "+list.get(i).getTelefone01());
    }// End for
      }// method contacts
}// class
