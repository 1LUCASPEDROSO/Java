package appPapelariaProf;
import java.util.*;
public class GestEstoque {

    ArrayList<DadosEstoque>  lista = new ArrayList<>();
    Scanner read = new Scanner(System.in);
    int opcaoApagar;
    int opcapAtualizar;
    int opcaoMenuAtualizar;
    int opcaoCompra;
    int quantidadeCompra;

    public void inserirDados()
    {
        DadosEstoque De = new DadosEstoque(); // criar objeto dentro do método para gerar novo objeto a cada chamada
        System.out.print("digite o nome do produto: ");
        De.setNomeproduto(read.next());
        System.out.print("Digite a descrição do produto: ");
        De.setDescricao(read.next());
        System.out.print("Digite a quantidade do produto: ");
        De.setQuantidade(read.nextInt());
        System.out.print("Digite o preço do produto: ");
        De.setPrecoUnitário(read.nextFloat());
        lista.add(De);
    }
    public void ListarTodosProdutos()
    {
        for (int i=0; i< lista.size();i++)
        {
            System.out.println("ID: "+(i+1));
            System.out.println("nome produto "+lista.get(i).getNomeproduto());
            System.out.println("descrição produto "+lista.get(i).getDescricao());
            System.out.println("Quantidade do produto "+lista.get(i).getQuantidade());
            System.out.println("preço unitário do produto "+lista.get(i).getPrecoUnitário());
            System.out.println("=============================================================\n");
        }
    }

    public ArrayList<DadosEstoque> DeletarProdutos() {
        System.out.print("Digite o ID do produto que deseja apagar: ");
        opcaoApagar = read.nextInt()-1;
        lista.remove(opcaoApagar);
        return lista;
    }
    public ArrayList<DadosEstoque> AtualizarProduto()
    {
        DadosEstoque De = new DadosEstoque(); // criar objeto dentro do método para gerar novo objeto a cada chamada
        System.out.println("Digite o código do produto que deseja atualizar: ");
        opcapAtualizar = read.nextInt()-1;
        System.out.println("Digite a opção desejada \n 1 - nome \n 2 - descrição \n 3 - quantidade \n 4 - preço \n 5 - todos os items");
        opcaoMenuAtualizar = read.nextInt();
        switch (opcaoMenuAtualizar)
        {
            case 1:
                System.out.print("Digite o nome do produto: ");
                lista.get(opcapAtualizar).setNomeproduto(read.next());
                break;
            case 2:
                System.out.print("Digite a descrição do produto: ");
                lista.get(opcapAtualizar).setDescricao(read.next());
                break;
            case 3:
                System.out.print("Digite a quantidade do produto: ");
                lista.get(opcapAtualizar).setQuantidade(read.nextInt());
                break;
            case 4:
                System.out.println("Digite o preço do produto: ");
                lista.get(opcapAtualizar).setPrecoUnitário(read.nextFloat());
            default:
                System.out.print("Digite o nome do produto: ");
                lista.get(opcapAtualizar).setNomeproduto(read.next());
                System.out.print("Digite a descrição do produto: ");
                lista.get(opcapAtualizar).setDescricao(read.next());
                System.out.print("Digite a quantidade do produto: ");
                lista.get(opcapAtualizar).setQuantidade(read.nextInt());
                System.out.println("Digite o preço do produto: ");
                lista.get(opcapAtualizar).setPrecoUnitário(read.nextFloat());
        }
        return lista;
    }
    public ArrayList<DadosEstoque> ComprarProduto()
    {
         System.out.println("Digite o ID do produto que deseja comprar :");
         opcaoCompra = read.nextInt()-1;
        System.out.println("Digite a quantidade do item: ");
        quantidadeCompra = read.nextInt();
         if (quantidadeCompra > lista.get(opcaoCompra).getQuantidade())
         {
             do {
                 System.out.println("você escolheu mais items do que existem no inventário digite novamente a quantidade: ");
                 quantidadeCompra = read.nextInt();

             } while (quantidadeCompra > lista.get(opcaoCompra).getQuantidade());
         }
         else
         {
             int totalquantiade = lista.get(opcaoCompra).getQuantidade()- quantidadeCompra;
             lista.get(opcaoCompra).setQuantidade(totalquantiade);
             System.out.println("Obrigado pela sua compra");
         }
        return lista;
    }
}// fim class
