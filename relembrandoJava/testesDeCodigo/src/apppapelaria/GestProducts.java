package apppapelaria;
import java.util.*;
public class GestProducts {
    ClassProduct Cp = new ClassProduct();
    ArrayList <ClassProduct> gest  = new ArrayList <>();
    Scanner read = new Scanner(System.in);
     int opcao;
     String opcaoRefazer;
     boolean returnLoop = true;
    public void createProdutc() {
        while(returnLoop == true){
            System.out.print("Digit here the name product: ");
            Cp.setNameProduct(read.next());
            System.out.print("Digit here the quantity product: ");
            Cp.setQuantity(read.nextInt());
            System.out.print("Digit here the price product: ");
            Cp.setPrice(read.nextDouble());
            gest.add(Cp);
            System.out.println("make one more item ?\n write yes or y to do");
            opcaoRefazer = read.next();
           if (opcaoRefazer.equalsIgnoreCase("yes") || opcaoRefazer.equalsIgnoreCase( "y"))
            {
                returnLoop = true;
            }
           else
           {
               returnLoop = false;
           }
        }
    }
    
    public void ListProduct()
    {
        for (int i=0;i<gest.size();i++) {
            System.out.println("position = "+ i);
            System.out.println(gest.get(i).getNameProduct());
            System.out.println(gest.get(i).getQuantity());
            System.out.println(gest.get(i).getPrice());
        }
    }
    public ArrayList<ClassProduct> deleteProduct()
    {
        for (int i=0;i<gest.size();i++) {
            System.out.println("position = "+ i);
            System.out.println(gest.get(i).getNameProduct());
            System.out.println(gest.get(i).getQuantity());
            System.out.println(gest.get(i).getPrice());
        }
        System.out.println("Digit here the position of item to delete: ");
        opcao = read.nextInt();
        gest.remove(opcao);
        System.out.println("Removed item sucess");
        for (int i=0;i<gest.size();i++) {
            System.out.println("position = "+ i);
            System.out.println(gest.get(i).getNameProduct());
            System.out.println(gest.get(i).getQuantity());
            System.out.println(gest.get(i).getPrice());
        }
        if (gest.size() ==0)
        {
            System.out.println("Don't have item in your program");
        }
        return gest;
    }
    public ArrayList<ClassProduct> updateItem()
    {
        System.out.println("Digit here the position of item to update: ");
        opcao = read.nextInt();
        for (int i=0;i<gest.size();i++) {
            System.out.println("position ="+ i);
            System.out.println(gest.get(i).getNameProduct());
            System.out.println(gest.get(i).getQuantity());
            System.out.println(gest.get(i).getPrice());
        }
        return gest;
    }
}// end class
