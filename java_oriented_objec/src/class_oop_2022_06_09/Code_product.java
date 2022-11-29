
package class_oop_2022_06_09;
import java.util.*;

public class Code_product {
/* name,product_quantity, product_price*/
private String product_name;
private int product_quantity;
private float product_price;
/*getters and setters*/
public void set_name (String product_name){   
 this.product_name = product_name;
}// method which give a name

public String get_nome(){
return this.product_name;
}
public void  set_product_quantity (int product_quantity){   
 this.product_quantity = product_quantity;
}// method which give a name

public int get_product_quantity(){
return this.product_quantity;
}
public void set_product_price (float product_price){   
 this.product_price = product_price;
}// method which give a name

public float get_product_price(){
return this.product_price;
}

}// class
