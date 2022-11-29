
package class_oop_2022_06_21;

import java.util.ArrayList;


public class code_gest_drinks {
ArrayList <code_drinks> list_man = new ArrayList<>(); 
ArrayList <code_drinks> list_woman = new ArrayList<>(); 

public void set_quantity_drinks_man(){
code_drinks Setter = new code_drinks ();
Setter.setBier(1.10);
Setter.setSoda_2L(1.70);
Setter.setPinga(5.75);
list_man.add(Setter);
}// END method setter drinks for man 
public void set_quantity_drinks_woman(){
code_drinks Setter = new code_drinks ();
Setter.setBier(4.40);
Setter.setSoda_2L(1.70);
Setter.setPinga(5.75);
list_woman.add(Setter);
}// END method setter drinks for woman
    
}// class
