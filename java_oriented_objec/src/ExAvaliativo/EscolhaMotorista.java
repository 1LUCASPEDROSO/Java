package ExAvaliativo;
import java.util.Scanner;

public class EscolhaMotorista {
     enum enumPessoaHabilitada {
   PessoaHabilitada1 ("joao",38,771354073,1),
   PessoaHabilitada2 ("fernanda",23,399814056,2),
   PessoaHabilitada3 ("lucas",20,645978015,3),
   PessoaHabilitada4 ("Costela",19,645978015,4),
   PessoaHabilitada5 ("Renan",22,258903095,5);
   
   private String nome;
   private int idade,cpf,codigo;

        private enumPessoaHabilitada(String nome, int idade, int cpf, int codigo) {
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.codigo = codigo;
        }// end contructor method

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public int getCpf() {
            return cpf;
        }

        public int getCodigo() {
            return codigo;
        }
        
    }//EnumPessoa
     public void EscolhaMotorista (){
        Scanner read = new Scanner (System.in);
         int resposta,op;
         System.out.println("você precisa de um motorista ?\n [S] - SIM\n [N] - NãO");
                System.out.print("digite aqui: ");
                resposta = read.next().charAt(0);
                if (resposta == 's'){
    System.out.println("escolha seu motorista");
    System.out.println("[1]- "+enumPessoaHabilitada.PessoaHabilitada1.getNome()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada1.getIdade()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada1.getCpf()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada1.getCodigo());
    System.out.println("=======================================================\n");
    System.out.println("[2]- "+enumPessoaHabilitada.PessoaHabilitada2.getNome()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada2.getIdade()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada2.getCpf()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada2.getCodigo());
    System.out.println("=======================================================\n");
    System.out.println("[3]- "+enumPessoaHabilitada.PessoaHabilitada3.getNome()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada3.getIdade()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada3.getCpf()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada3.getCodigo());
    System.out.println("=======================================================\n");
    System.out.println("[4]- "+enumPessoaHabilitada.PessoaHabilitada4.getNome()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada4.getIdade()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada4.getCpf()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada4.getCodigo());
    System.out.println("=======================================================\n");
    System.out.println("[5]- "+enumPessoaHabilitada.PessoaHabilitada5.getNome()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada5.getIdade()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada5.getCpf()+
                    "||"+enumPessoaHabilitada.PessoaHabilitada5.getCodigo());
                    op = read.nextInt();
                }// END IF                
                else {System.out.println("ok - não será necessário motorista");}
    System.out.println("=======================================================\n");            
}// End method               
}// END class            
