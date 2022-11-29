package Aula_0902_2022;
import java.util.Scanner;
public class Codigo02 {
    public static void main(String[] args) {
    Scanner ler =new Scanner (System.in);

        String nomes[] = new String[10];
        int operacao = 1, opcao;
        String nome_apagar, nome_atualizado;
        while (operacao == 1) {
           System.out.println("Qual operação?\n(1) - INSERIR OS NOMES\n(2) - LISTAR NOMES\n(3) - APAGAR NOMES\n(4) - APAGAR 01 NOME\n(5) - ATUALIZAR 01 NOME");
            System.out.print("Digite aqui: ");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    for (int indice = 0; indice < nomes.length; indice++) {
                        System.out.print("NOME: ");
                        nomes[indice] = ler.next();
                    }
                    break;
                case 2:
                    for (int indice = 0; indice < nomes.length; indice++) {
                        System.out.print("[" + nomes[indice] + "] ");
                    }
                    break;
                case 3:
                    for (int indice = 0; indice < nomes.length; indice++) {
                        nomes[indice] = "";
                    }
                    System.out.println("Vetor nomes agora está vazio.");
                    break;
                case 4:
                    System.out.print("Informe o nome para apagar:");
                    nome_apagar = ler.next();
                    for (int indice = 0; indice < nomes.length; indice++) {
                        if (nome_apagar.equals(nomes[indice])) {
                            nomes[indice] = "";
                            System.out.println("achei");
                        }
                    }
                    System.out.println(nome_apagar + " apagado com sucesso.");
                    break;
                case 5:
                    System.out.print("Informe o nome para atualizar:");
                    nome_apagar = ler.next();
                    System.out.print("Informe o novo nome:");
                    nome_atualizado = ler.next();
                    for (int indice = 0; indice < nomes.length; indice++) {
                        if (nome_apagar.equals(nomes[indice])) {
                            nomes[indice] = nome_atualizado;
                        }
                    }
                    System.out.println(nome_atualizado + " atualizado com sucesso.");
                    break;
            }//switch
            System.out.println("\nDeseja realizar outra operação?\n1 - SIM\n2 - NÃO");
            System.out.print("Digite aqui: ");
            operacao = ler.nextInt();
        }//while
    }//class
}//main
