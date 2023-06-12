package apppapelaria;
import java.util.*;
public class ClassProduct {
    private  ArrayList Products  = new ArrayList <>();
    private   String nameProduct;
    private   Integer quantity;
    private   double  price;
     String opcao;
    Scanner read = new Scanner (System.in);
    public ArrayList getProducts() {
        return Products;
    }

    public void setProducts(ArrayList products) {
        Products = products;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    ClassProduct Cp = new ClassProduct();
    public void createProdutc() {
        System.out.print("Digit here the name product");
        Cp.setNameProduct(read.next());
        System.out.print("Digit here the quantity product");
        Cp.setQuantity(read.nextInt());
        System.out.print("Digit here the price product");
        Cp.setPrice(read.nextDouble());
        Products.add(Cp);
    }
    public void listProducts()
    {
        for (int i=0; i<=Products.size(); i++)
        {
            System.out.println("name product"+ Products.get(i));
        }
    }
}// end class
