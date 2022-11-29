package Aula_0902_2022;
import java.util.Scanner;
public class Codigo1 {
    public static void main(String[] args) {
    Scanner read =new Scanner (System.in);
    
   //criação de ARRAY sem elementos(valores) iniciais   
  //criação do atributo vetorial 
  int numeros[];
  //instanciação(criação de um objeto)estabelecendo a quantidade de valores
  // que podem ser guardados   
  numeros = new int[5];   
  int numeros02[] = new int[5];     
  //criação de ARRAY com elementos(valores) iniciais 
  int numeros03[] = {2,5,3,8,6,9,1,2,9}; //capacidade fixa de 09 nº    
  //inserir valores para um ARRAY
  //1º) faço uma referência ao vetor e o índice
  //2º) inserir o valor de mesmo tipo de dado
  numeros[3] = 23;
  numeros02[1] = 45;
  numeros03[3]= 100;    
  //mostrar valores de um ARRAY  
  System.out.println("==> "+numeros[4]);
  System.out.println("==> "+numeros02[1]);
  System.out.println("==> "+numeros03[3]);     
    }//main
}//class
