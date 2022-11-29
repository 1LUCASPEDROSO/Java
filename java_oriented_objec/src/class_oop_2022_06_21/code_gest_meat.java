
package class_oop_2022_06_21;

import java.util.ArrayList;


public class code_gest_meat {
ArrayList <code_meat> list_man = new ArrayList<>(); 
ArrayList <code_meat> list_woman = new ArrayList<>();    
public void set_quantity_meat_man(){
 code_meat Setter = new code_meat();
 Setter.setSausage(0.87);
 Setter.setChicken(1.05);
 Setter.setHeart(2.28);
 Setter.setPicanha(4.28);
 Setter.setLombo(3.20);
 list_man.add(Setter);
}// END method setter quantity_meat_man 

public void set_quantity_meat_woman(){
 code_meat Setter = new code_meat();
 Setter.setSausage(0.70);
 Setter.setChicken(1.00);
 Setter.setHeart(2.00);
 Setter.setPicanha(4.28);
 Setter.setLombo(2.99);
 list_woman.add(Setter);
}// END method setter quantity_meat_woman 
}// End class quantity meat
