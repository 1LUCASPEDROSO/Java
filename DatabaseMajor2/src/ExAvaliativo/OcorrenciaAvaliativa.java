
package ExAvaliativo;
import java.util.Scanner;

public class OcorrenciaAvaliativa {
    Scanner read = new Scanner (System.in);

     private int EscolhaCarro,EscolhaMotorista;
      private  char resposta;
      private  int kmCarro1 = EnumCars.EnumCars1.Carro1.getKM();
      
       public int getEscolhaCarro() {
        return EscolhaCarro;
    }

    public int getKmCarro1() {
        return kmCarro1;
    }
   
    public int Menu (){
    do{    
        EscolhaMotorista EM = new EscolhaMotorista();
        Manutenção M = new Manutenção();
        Viagem v = new Viagem();
        System.out.println("==== CARROS ====");
        System.out.println("[1] - "+EnumCars.EnumCars1.Carro1.getModelo());
        System.out.println("[2] - "+EnumCars.EnumCars1.Carro2.getModelo());
        System.out.println("[3] - "+EnumCars.EnumCars1.Carro3.getModelo());
        System.out.println("[4] - "+EnumCars.EnumCars1.Carro4.getModelo());
        System.out.print("digite aqui o numero do carro de sua escolha: ");
        EscolhaCarro = read.nextInt();
        switch (EscolhaCarro){
            case 1:
                System.out.println("Modelo: "+EnumCars.EnumCars1.Carro1.getModelo());
                System.out.println("Cor: "+EnumCars.EnumCars1.Carro1.getCor());
                System.out.println("Marca: "+EnumCars.EnumCars1.Carro1.getMarca());
                System.out.println("Tipo: "+EnumCars.EnumCars1.Carro1.getTipo());
                System.out.println("Quantidade de passageiros: "+EnumCars.EnumCars1.Carro1.getQuatidadePassageiros());
                System.out.println("Combustivel: "+EnumCars.EnumCars1.Carro1.getCombustivel());
                System.out.println(""+EnumCars.EnumCars1.Carro1.getAnofabricação());
                System.out.println(""+EnumCars.EnumCars1.Carro1.getDataCompra());
                System.out.println("KMs: " +EnumCars.EnumCars1.Carro1.getKM());
                System.out.println("====================================");
                EM.EscolhaMotorista();
                v.Viagem1();               
                break;
            case 2:
                 System.out.println("Modelo: "+EnumCars.EnumCars1.Carro2.getModelo());
                 System.out.println("Cor: "+EnumCars.EnumCars1.Carro2.getCor());
                System.out.println("Marca: "+EnumCars.EnumCars1.Carro2.getMarca());
                System.out.println("Tipo: "+EnumCars.EnumCars1.Carro2.getTipo());
                System.out.println("Quantidade de passageiros: "+EnumCars.EnumCars1.Carro2.getQuatidadePassageiros());
                System.out.println("Combustivel: "+EnumCars.EnumCars1.Carro2.getCombustivel());
                System.out.println(""+EnumCars.EnumCars1.Carro2.getAnofabricação());
                System.out.println(""+EnumCars.EnumCars1.Carro2.getDataCompra());
                System.out.println("KMs: "+EnumCars.EnumCars1.Carro2.getKM());
                System.out.println("====================================");
                EM.EscolhaMotorista();
                v.Viagem2();
                break;
            case 3:
                 System.out.println("Modelo: "+EnumCars.EnumCars1.Carro3.getModelo());
                 System.out.println("Cor: "+EnumCars.EnumCars1.Carro3.getCor());
                System.out.println("Marca: "+EnumCars.EnumCars1.Carro3.getMarca());
                System.out.println("Tipo: "+EnumCars.EnumCars1.Carro3.getTipo());
                System.out.println("Quantidade de passageiros: "+EnumCars.EnumCars1.Carro3.getQuatidadePassageiros());
                System.out.println("Combustivel: "+EnumCars.EnumCars1.Carro3.getCombustivel());
                System.out.println(""+EnumCars.EnumCars1.Carro3.getAnofabricação());
                System.out.println(""+EnumCars.EnumCars1.Carro3.getDataCompra());
                System.out.println("KMs: "+EnumCars.EnumCars1.Carro3.getKM());
                System.out.println("====================================");
                EM.EscolhaMotorista();
                v.Viagem3();
                break;
            case 4:
                 System.out.println("Modelo: "+EnumCars.EnumCars1.Carro4.getModelo());
                 System.out.println("Cor: "+EnumCars.EnumCars1.Carro4.getCor());
                System.out.println("Marca: "+EnumCars.EnumCars1.Carro4.getMarca());
                System.out.println("Tipo: "+EnumCars.EnumCars1.Carro4.getTipo());
                System.out.println("Quantidade de passageiros: "+EnumCars.EnumCars1.Carro4.getQuatidadePassageiros());
                System.out.println("Combustivel: "+EnumCars.EnumCars1.Carro4.getCombustivel());
                System.out.println(""+EnumCars.EnumCars1.Carro4.getAnofabricação());
                System.out.println(""+EnumCars.EnumCars1.Carro4.getDataCompra());
                System.out.println("KMs: "+EnumCars.EnumCars1.Carro4.getKM());
                System.out.println("====================================");
                EM.EscolhaMotorista();
                v.Viagem4();
                break;
            default: 
                System.out.println("escolha uma opção válida");
                break;
        }// END swith case
    }while (EscolhaCarro !=1 & EscolhaCarro !=2 & EscolhaCarro !=3 & EscolhaCarro !=4); // END while
        return EscolhaCarro;
    }// END method menu 
    }// END class
