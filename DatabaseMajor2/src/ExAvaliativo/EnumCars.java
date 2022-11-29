//Uma empresa de grande porte no RS, a EMPRESA MODELO S/A, quer fazer o controle de
//sua frota de veículos. A frota é constituída de vários tipos de caminhões,caminhonetes
//e carros pequenos. De cada veículo, a empresa precisa saber qual o ano de fabricação
//e modelo, qual o fabricante (se Chevrolet, Volkswagen, Fiat, etc.)
//o tipo, data da compra, tipo de combustível, quilometragem atual, 
//cor e quantidade de passageiros que o veículo pode transportar.
//Um veículo pode ser usado por qualquer empregado da empresa inclusive dirigindo o veículo.
//Entretanto, a empresa tem em seu quadro de funcionários,
//motoristas que são chamados quando um empregado precisa usar o veículo,
//mas não sabe dirigir. Em qualquer caso, o responsável pelo veículo durante seu uso é o motorista do veículo.
//O controle do uso de um veículo é feito através do preenchimento do formulário 
//chamado OCORRÊNCIA DE USO DE VEÍCULO, no qual devem ser 
//registrados os seguintes dados: quilometragem no momento do  recebimento do carro para uso,
//quilometragem no final do uso, o consumo de combustível e o resultado do acerto da viagem.
//Cada abastecimento deve ser acompanhado de nota fiscal, emitida pelo posto de combustível,
//demostrando a quantidade e o valor do abastecimento. Se o uso do veículo for para uma viagem interurbana,
//o motorista recebe um adiantamento para fazer face aos abastecimentos necessários.
//Esse adiantamento é feito em função do consumo por quilômetro rodado do veículo.
//Ao final da viagem, o motorista devolve a diferença dos gastos ou recebe a diferença se, 
//por acaso, as despesas forem maiores que o adiantamento recebido.
//Outra questão importante para a empresa, é o controle de manutenção de cada veículo.
//Essas manutenções são feitas em auto-mecânicas previamente habilitadas.
//Um veículo é enviado para manutenção a cada 5.000 Km rodados ou de seis em seis meses,
//o que ocorrer primeiro. Então da manutenção precisa-se saber: o tipo de manutenção
//(Preventiva, Gratuita, Corretiva), a data da última manutenção e a quilometragem na época da manutenção.
//Para cada manutenção efetuada, a empresa registra a quantidade de horas e o valor da mão de obra 
//cobrado por tipo, horas de eletricista, de pintura, de mecânico, etc. Além disso são registrados a 
//quantidade e o tipo de peças usadas para a manutenção (embreagem, pastilhas de freio, farol, etc.).
//Só interessa os dados da última manutenção efetuada.
package ExAvaliativo;

import java.util.Scanner;


public class EnumCars {
    enum EnumCars1 {
   
   Carro1 ("ano de fabricacao = 2021","cruze-LTZ","chevrolet","sedan","Data compra = 07/05/21","nunca feita","gasolina","vermelho",4000,4),
   Carro2 ("ano de fabricacao = 2009","GT-40","Ford","sedan-esportivo","Data compra = 01/01/2010","15/12/2014","gasolina","azul",10000,2),
   Carro3 ("ano de fabricacao = 2003","Mustang-gt","Ford","sedan-esportivo","Data compra = 20/05/2003","15/07/2022","gasolina","preto",21000,4),
   Carro4 ("ano de fabricacao = 2012","Fiesta","Ford","reth","Data compra = 21/06/12","15/04/2014","gasolina","branco",80000,4);
    private String Anofabricação,Modelo,Marca,Tipo,DataCompra,DataManutencao,combustivel,cor;
    private int KM,quatidadePassageiros;

        private EnumCars1(String Anofabricação, String Modelo, String Marca, String Tipo, String DataCompra, String DataFabricação, String combustivel, String cor, int KM, int quatidadePassageiros) {
            this.Anofabricação = Anofabricação;
            this.Modelo = Modelo;
            this.Marca = Marca;
            this.Tipo = Tipo;
            this.DataCompra = DataCompra;
            this.DataManutencao = DataManutencao;
            this.combustivel = combustivel;
            this.cor = cor;
            this.KM = KM;
            this.quatidadePassageiros = quatidadePassageiros;
        }// END contructor
        
        public String getAnofabricação() {
            return Anofabricação;
        }

        public String getModelo() {
            return Modelo;
        }

        public String getMarca() {
            return Marca;
        }

        public String getTipo() {
            return Tipo;
        }

        public String getDataCompra() {
            return DataCompra;
        }

        public String getCombustivel() {
            return combustivel;
        }

        public int getKM() {
            return KM;
        }

        public String getCor() {
            return cor;
        }

        public int getQuatidadePassageiros() {
            return quatidadePassageiros;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getDataManutencao() {
            return DataManutencao;
        }

        public void setDataManutencao(String DataManutencao) {
            this.DataManutencao = DataManutencao;
        } 
    }// END enumCars
}//class    

    
  
