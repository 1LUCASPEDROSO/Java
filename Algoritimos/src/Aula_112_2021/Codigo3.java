/*2. Você acabou de almoçar em um restaurante e quer uma sobremesa.
O restaurante dispõe de um sistema informatizado em que
sem precisar chamar o garçom, você pode pedir a sobremesa através
de um dispositivo portátil, que é entregue a cada cliente assim que ele entra
no restaurante. Lá, existem as seguintes opções de sobremesa:
1- Mousse; 2- Sorvete; 3- MilkShake e 4- Sunday. Para pedir a sobremesa
você só precisa digitar o número desejado e aguardar. Escreva um algoritmo 
que mostre esse menu de sobremesas. Se a opção digitada não estiver entre os 
valores 1 e 4, exiba um alerta de erro e peça ao cliente que digite um valor
válido.*/
package Aula_112_2021;
import java.util.Scanner;
public class Codigo3 {
    public static void main(String[] args) {
    Scanner read =new Scanner (System.in);
    int s;
    int volta = 0;   
    
    while (volta == 1) {
    System.out.println("1-musse\n 2- sorvete\n 3- milkshake\n 4- sunday");
        System.out.println("digite o cod da sobremesa: ");
    s = read.nextInt();
    switch (s){ case 1:
            System.out.println("vc escolheu musse");
            break;
        case 2:
            System.out.println("vc escolheu sorvete");
            break;
        case 3:
            System.out.println("vc escolheu milkshake");
            break;
        case 4:
            System.out.println("vc escolheu sunday");
            break;
        default:
            System.out.println(" digite um cod que exista!!");
                break; 
    }// fim switch
        System.out.print("gostaria de ver o cardápio novamente ? \n - 1 ou - 2\n");
        volta = read.nextInt();
        
    }//fim while
    
    
    }//class    
}//main1

