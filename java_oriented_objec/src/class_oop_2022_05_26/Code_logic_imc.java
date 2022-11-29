/*2) Criar um algoritmo que realiza o cálculo do peso ideal(IMC = peso/(altura x altura)):
   - O usuário deve inserir seu nome
   - O usuário deve inserir seu peso
   - O usuário deve inserir seu altura
   - O usuário deve inserir seu sexo
   - O sistema deve verificar caso o sexo seja masculino realizar o cálculo e pelo resultado mostrar
- se imc < 20.7 mostrar "abaixo do peso"
- se imc >= 20.7  e imc <= 26.4 mostrar "peso ideal"
- se imc > 26.4 mostrar "acima do peso"
   - O sistema deve verificar caso o sexo seja feminino realizar o cálculo e pelo resultado mostrar
- se imc < 19.1 mostrar "abaixo do peso"
- se imc >= 19.1  e imc <= 25.8 mostrar "peso ideal"
- se imc > 25.8 mostrar "acima do peso"*/
package class_oop_2022_05_26;
import java.util.*;

public class Code_logic_imc {
 Scanner read = new Scanner (System.in);
 // variables
 String nome;
 char sexo;
double peso,altura,imc;
//variables  

public int menu (){

    System.out.println("=== MENU ===");
    System.out.println("[1] - For calculate your IMC");
    System.out.println("[2] - Show  menu again");
    System.out.print("digit here: "); return Integer.parseInt(read.next());
    
}// End method Menu
public void data (){

    System.out.print("digit your name: "); nome = read.next();
    System.out.print("digit your weight: "); peso = read.nextDouble();
    System.out.print("digit your height: "); altura = read.nextDouble();
    System.out.print("digite your sex [M] - men [w] - woman "); sexo = read.next().charAt(0);
    if (sexo == 'm')Imc_calculator_men () ;
    else if (sexo == 'f')Imc_calculator_woman ();   
}// End method haven't return and parameters  

public void Imc_calculator_men (){
imc = peso /(altura * altura);

if (imc < 20.7) System.out.println("User, you are underweight, imc: "+imc);
else if (imc >= 20.7 && imc <= 26.4) System.out.println("User, you are in your execly weight, imc: "+imc);
else if (imc > 26.4) System.out.println("User, have you been eating a lot of mc donalds ?, your imc is: "+imc);

}// End method IMC for men

public void Imc_calculator_woman (){
imc = peso /(altura * altura);

if (imc < 19.1) System.out.println("User, you are underweight, imc: "+imc);
else if (imc >= 19.1 && imc <= 25.8) System.out.println("User, you are in your execly weight, imc: "+imc);
else if (imc > 25.8) System.out.println("User, have you been eating a lot of mc donalds ?, your imc is: "+imc);

}// End method IMC for woman
} // class logic
