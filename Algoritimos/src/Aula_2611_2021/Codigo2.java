
package Aula_2611_2021;
import java.util.Scanner;
/*
Criar um algoritmo que realiza o cálculo do peso ideal
(IMC = peso/(altura x altura)):
   - O usuário deve inserir seu nome
   - O usuário deve inserir seu peso
   - O usuário deve inserir seu altura
   - O usuário deve inserir seu sexo
   - O sistema deve verificar caso o sexo seja masculino realizar o cálculo
e pelo resultado mostrar
	- se imc < 20.7 mostrar "abaixo do peso"
	- se imc >= 20.7  e imc <= 26.4 mostrar "peso ideal"
	- se imc > 26.4 mostrar "acima do peso"
   - O sistema deve verificar caso o sexo seja feminino realizar o cálculo e
pelo resultado mostrar
	- se imc < 19.1 mostrar "abaixo do peso"
	- se imc >= 19.1  e imc <= 25.8 mostrar "peso ideal"
	- se imc > 25.8 mostrar "acima do peso"
*/
public class Codigo2 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);    
   String nome; 
   double peso; 
   double altura; 
   String sexo;
   double imc;
System.out.print("digite seu nome: ");
nome = leia.next();
System.out.print("digite seu peso: ");
peso = leia.nextDouble();
System.out.print("digite sua altura: ");
altura = leia.nextDouble();
System.out.println("digite seu sexo:  \n -M para masculino \n -F femenino" );
 sexo = leia.next();

  imc = peso / (altura*altura);
 
 if (sexo.equalsIgnoreCase("f")){
    System.out.println("seu IMC: "+imc);}
    
 if (imc <=19.1) {
    System.out.print("você está abaixo do peso");}

    else if ((imc >= 19.1) && (imc >=25.8)) {
        System.out.println("voce está no peso ideal");} 
                
  
  else if (imc >= 25.8);{
        System.out.println("está acima do peso");
    }    
  
if (sexo.equalsIgnoreCase("m")){
    System.out.println("seu IMC: "+imc);}
    
 if (imc <=20.7) {
    System.out.print("você está abaixo do peso");}

    else if ((imc >= 20.7) && (imc <=26.4)) {
        System.out.println("voce está no peso ideal");} 
                
  
  else if (imc >26.4);{
        System.out.println("está acima do peso");
    }      
}//main
    
}//class
