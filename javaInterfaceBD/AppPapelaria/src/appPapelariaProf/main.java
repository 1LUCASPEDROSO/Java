package appPapelariaProf;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char volta;
        int escolhaAcao;
        GestEstoque GE = new GestEstoque();

        do {
            System.out.println("================================================================================");
            System.out.println("Digite a operaçao que deseja realizar");
            System.out.println(" 1 - Cadastrar \n 2 - Listar \n 3 - Deletar \n 4 - Atualizar \n 5 - Comprar");
            System.out.print("Digite aqui: ");
            escolhaAcao = read.nextInt();
            switch (escolhaAcao)
            {
                case 1:
                    GE.inserirDados();
                    break;
                case 2:
                    GE.ListarTodosProdutos();
                    break;
                case 3:
                    GE.DeletarProdutos();
                    break;
                case 4:
                    GE.AtualizarProduto();
                    break;
                case 5:
                    GE.ComprarProduto();
                default:
                    System.err.println();
            }
            System.out.print("Deseja fazer uma nova operação \n  s - SIM n - NÃO: ");
            volta = read.next().charAt(0);
        }while( volta =='s');
    }
}
