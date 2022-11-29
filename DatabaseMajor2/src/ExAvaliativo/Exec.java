package ExAvaliativo;
import java.util.Scanner;

public class Exec {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        OcorrenciaAvaliativa Nc = new OcorrenciaAvaliativa();
        int resposta =0;
        String nome;
        do{
        System.out.print("digite seu nome: "); nome = read.next();
        System.out.println(nome+ ", voce precisa fazer uma viagem em nome da empresa MODELO S/A, "
        +"dito isso, durante a viagem voce sera o RESPONSAVEL PELO VEICULO, caso nao seja habilitado,"
        + "a responsabilidade SERA DO SEU MOTORISTA");
            System.out.println("Dito isso dentro do menu de carros abaixo escolha o modelo de preferencia: ");
        Nc.Menu();
            System.out.println(" sera feito uma nova viagem ?\n [1] - SIM ==== [2] - nao");
            resposta = read.nextInt();
        }while (resposta == 1);
    }// main
}// class
