package class_oop_2022_06_22;
import java.util.*;

public class code_exec {
    public static void main(String[] args) {
      Scanner read = new Scanner (System.in);
      
        System.out.print("NOME: ");
        String nome = read.next();
        System.out.print("digite seu level na GC: ");
        String level_gc = read.next();
        System.out.print("digite aqui seu level no MM: ");
        String level_mm = read.next();
        code_aluno P = new code_aluno (nome,level_mm,level_gc);  
        System.out.println("====>" + P.name);
        System.out.println("===>" + P.level_gc);
          P.caculator_cs_mm();
      
      
      
      
      
      
      
      
    }// main
}// class
