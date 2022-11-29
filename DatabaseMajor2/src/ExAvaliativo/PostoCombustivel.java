package ExAvaliativo;
import java.util.Scanner;
public class PostoCombustivel {
    Scanner read = new Scanner (System.in);
    double LitroGasolina = 5.65;
    double Diesel = 4.75;
    double alcool = 6.25;
    double total;
    int EscolhaCombustivel,quantidade;
     int count;
    public void Abastecimento() {
        do {
            System.out.println(" ==== MENU ====");
            System.out.println(" - combustiveis -");
            System.out.println("[1]- Gasolina - " + LitroGasolina);
            System.out.println("[2]-Diesel - " + Diesel);
            System.out.println("[3]-Alcool - " + alcool);
            System.out.print("Digite aqui sua escolha: ");
            EscolhaCombustivel = read.nextInt();
            switch (EscolhaCombustivel) {
                case 1:
                    System.out.print("digite a quantidade em litros: ");
                    quantidade = read.nextInt();
                    total = (int) (quantidade * LitroGasolina);
                    System.out.println(" ==== NOTA FISCAL ==== ");
                    System.out.println("Data: 20/07/2022");
                    System.out.println("Quantidade pedida pelo cliente: " + quantidade);
                    System.out.println("Preco da gasolina: " + LitroGasolina);
                    System.out.println("TOTAL da NOTA:" + total);
                    System.out.println("========================================");
                    break;
                case 2:
                    System.out.print("digite a quantidade em litros: ");
                    quantidade = read.nextInt();
                    total = (int) (quantidade * Diesel);
                    System.out.println(" ==== NOTA FISCAL ==== ");
                    System.out.println("Data: 20/07/2022");
                    System.out.println("Quantidade pedida pelo cliente: " + quantidade);
                    System.out.println("Preco do Diesel: " + LitroGasolina);
                    System.out.println("TOTAL da NOTA:" + total);
                    System.out.println("========================================");
                    break;
                case 3:
                    System.out.print("digite a quantidade em litros: ");
                    quantidade = read.nextInt();
                    total = (int) (quantidade * alcool);
                    System.out.println(" ==== NOTA FISCAL ==== ");
                    System.out.println("Data: 20/07/2022");
                    System.out.println("Quantidade pedida pelo cliente: " + quantidade);
                    System.out.println("Preco do alcool: " + LitroGasolina);
                    System.out.println("TOTAL da NOTA:" + total);
                    System.out.println("========================================");
                    break;
                default:
                    System.out.println("Esse tipo de combustivel nao existe");
                    break;
            }// END SWITCH
        } while (EscolhaCombustivel != 1 && EscolhaCombustivel != 2 && EscolhaCombustivel !=3);
    }// END METHOD
}// class
