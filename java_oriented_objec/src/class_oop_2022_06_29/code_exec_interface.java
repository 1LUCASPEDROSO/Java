
package class_oop_2022_06_29;
import java.util.*;

public class code_exec_interface {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        code_quadrado Lq = new code_quadrado ();
        code_trinangulo Lt = new code_trinangulo();
        
        System.out.println("the name of figure is: " + Lq.getnomeFigura());
        System.out.println("you should calculate the area ?");
        System.out.print("digit the side: "); Lq.setSide(read.nextInt());
        System.out.println("the area is: " + Lq.getArea());
        System.out.println("the perimetrin of " + Lq.getnomeFigura() + " is :" + Lq.getperimetro());
        System.out.println("\n =============================================== \n");
        System.out.println("the name of figure is: " + Lt.getnomeFigura());
        System.out.println("you should calculate the area ?");
        System.out.print("digit the high: "); Lt.setHigh(read.nextInt());
        System.out.print("digit value for base: "); Lt.setBase(read.nextInt());
        System.out.println("the area is: " + Lt.getArea());
        System.out.println("\n === NOW CALCULATE THE PERIMETRIN ===   \n");
        System.out.print("digit the side A : "); Lt.setSideA(read.nextInt());
        System.out.print("digit the side B : "); Lt.setSideB(read.nextInt());
        System.out.print("digit the side c : "); Lt.setSideC(read.nextInt());
        System.out.println("the perimetrin of " + Lt.getnomeFigura() + " is :" + Lt.getperimetro());
        System.out.println("\n =============================================== \n");
    
    }// main
}// clas
