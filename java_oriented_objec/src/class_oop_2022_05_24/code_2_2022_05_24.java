
package class_oop_2022_05_24;
 import java.util.Scanner; 
public class code_2_2022_05_24 {     
    public static void main(String[] args) {
        int volta,escolha;
        code_1_oop_2022_05_24 objeto01 = new code_1_oop_2022_05_24(); 
        Scanner digita = new Scanner(System.in);
        do {            
            System.out.println("Operação:\n[1] - SOMA\n[2] - subtração\n[3] - multiplicação\n[4] - divisão");
            System.out.print("Digite aqui: ");
            escolha=digita.nextInt();
            switch(escolha){
                case 1:
                    objeto01.soma();
                break;
                case 2:
                    objeto01.subtração();
                    break;
                case 3:
                    objeto01.multiplicação();
                    break;
                case 4:
                    objeto01.divisão();
                    break;
                default:
                    System.out.println("DIGITAÇÃO ERRADA.");
            }            
            System.out.println("Deseja fazer nova operação?\n(1) - SIM\n(2) - NÃO");
            System.out.print("Digite aqui: ");
            volta=digita.nextInt();
        } while (volta == 1);
   
    }//main    
}//class

