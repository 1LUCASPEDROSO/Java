
package ExAvaliativo;

public class Manutenção {

    int contaManutencao = 0;
    String NovaDataManutencao;

    public void ManutencaoCarro1() {
        System.out.println(EnumCars.EnumCars1.Carro1.getModelo() + "precisa ser feita manutencao preventiva");
        System.out.println("ultima manutencao: " + EnumCars.EnumCars1.Carro1.getDataManutencao());
        System.out.println("foi trocado vidro vidro e Pneu");
        EnumCars.EnumCars1.Carro1.setDataManutencao("20/07/2022");
        System.out.println("nova data de manutencao: " + EnumCars.EnumCars1.Carro1.getDataManutencao());
        contaManutencao = 1200;
        System.out.println("o total foi: R$: " + contaManutencao);
    }// END method ManutencaoCarro1

    public void ManutencaoCarro2() {
        System.out.println(EnumCars.EnumCars1.Carro2.getModelo() + "precisa ser feita manutencao gratuita");
        System.out.println("ultima manutenção: " + EnumCars.EnumCars1.Carro2.getDataManutencao());
        System.out.println("foi feita apenas avaliaão");
         EnumCars.EnumCars1.Carro2.setDataManutencao("20/07/2022");
        System.out.println("nova data de manutenção: " + EnumCars.EnumCars1.Carro2.getDataManutencao());
        contaManutencao = 0;
        System.out.println("o total foi: R$: " + contaManutencao);
    }// END metohod ManutencaoCarro2

    public void ManutencaoCarro3() {
        System.out.println(EnumCars.EnumCars1.Carro3.getModelo() + "precisa ser feita manutencao corretiva");
        System.out.println("ultima manutencao: " + EnumCars.EnumCars1.Carro3.getDataManutencao());
        System.out.println("foi feita troca de ar condicionado");
        EnumCars.EnumCars1.Carro3.setDataManutencao("20/07/2022");
        System.out.println("nova data de manutencao: " + EnumCars.EnumCars1.Carro3.getDataManutencao());
        contaManutencao = 400;
        System.out.println("o total foi: R$: " + contaManutencao);
    }// END metohod ManutencaoCarro3 

    public void ManutencaoCarro4() {
        System.out.println(EnumCars.EnumCars1.Carro4.getModelo() + "precisa ser feita manutencao preventiva e troca de pintura");
        System.out.println("ultima manutencao: " + EnumCars.EnumCars1.Carro4.getDataManutencao());
        System.out.println("foi feita troca de pintura ");
        EnumCars.EnumCars1.Carro4.setDataManutencao("20/07/2022");
        System.out.println("nova data de manutencao: " + EnumCars.EnumCars1.Carro4.getDataManutencao());
        contaManutencao = 700;
        EnumCars.EnumCars1.Carro4.setCor("vermelho");
        System.out.println("o total foi: R$: " + contaManutencao);
    }// END metohod ManutencaoCarro4 
    
}// class
