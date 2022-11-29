package ExAvaliativo;
import java.util.Scanner;

public class Viagem {    
    private String Local;
    private int KmViagem;
    private double Verbaviagem,VerbaViagemMotorista,conta;
    Scanner read = new Scanner (System.in);
    Manutenção M = new Manutenção();
    PostoCombustivel PC = new PostoCombustivel();
    public void Viagem1() {
        int KmTotal = 0;
        System.out.print("digite aqui o nome do local de viagem: ");
        Local = read.next();
        System.out.print("dgite aqui a quantidade de Km para a viagem: ");
        KmViagem = read.nextInt();
        if (KmViagem >= 60) {
            System.out.println("======== VIAGEM INTERURBANA ========");
            System.out.print("digite aqui quanto voce precisa de verba para a viagem: ");
            Verbaviagem = read.nextDouble();
            PC.Abastecimento();
            KmTotal = KmViagem + EnumCars.EnumCars1.Carro1.getKM();
            if (KmTotal >= 5000) {
                M.ManutencaoCarro1();
                System.out.print("quanto foi gasto na viagem ?");
                VerbaViagemMotorista = read.nextDouble();
                if (VerbaViagemMotorista > Verbaviagem) {
                    conta = VerbaViagemMotorista - Verbaviagem;
                    System.out.println("Funcionario rescarsido em: R$: " +conta);
                }//END IF
                else {
                    conta = Verbaviagem - VerbaViagemMotorista;
                    System.out.println(" Deve ser devolvido : R$: " + conta + " para a empresa");
                } //END ELSE
            }// END IF 
            else {
                System.out.print("quanto foi gasto na viagem ? ");
                VerbaViagemMotorista = read.nextDouble();
                if (VerbaViagemMotorista > Verbaviagem) {
                    conta = VerbaViagemMotorista - Verbaviagem;
                    System.out.println("Funcionario rescarsido em: R$: " +conta);
                }//END IF
                else {
                    conta = Verbaviagem - VerbaViagemMotorista;
                    System.out.println(" Deve ser devolvido : R$: "+conta +" para a empresa");
                } //END ELSE
            }// END ELSE  
        }// END new IF
        else {System.out.println(" nao sera necessario fazer abastecimento ou verba para viagem");}// END new ELSE para não fazer abastecimento
    }// method viagem 1

    public void Viagem2() {
        int KmTotal = 0;
        System.out.print("digite aqui o nome do local de viagem: ");
        Local = read.next();
        System.out.print("dgite aqui a quantidade de Km para a viagem: ");
        KmViagem = read.nextInt();
       if (KmViagem >= 60) {
            System.out.println("======== VIAGEM INTERURBANA ========");
            System.out.print("digite aqui quanto voce precisa de verba para a viagem: ");
            Verbaviagem = read.nextDouble();
            PC.Abastecimento();
            KmTotal = KmViagem + EnumCars.EnumCars1.Carro2.getKM();
            if (KmTotal >= 5000) {
                M.ManutencaoCarro2();
                System.out.print("quanto foi gasto na viagem ?");
                VerbaViagemMotorista = read.nextDouble();
                if (VerbaViagemMotorista > Verbaviagem) {
                    conta = VerbaViagemMotorista - Verbaviagem;
                    System.out.println("Funcionario rescarsido em: R$: " +conta);
                }//END IF
                else {
                    conta = Verbaviagem - VerbaViagemMotorista;
                    System.out.println(" Deve ser devolvido : R$: " + conta + " para a empresa");
                } //END ELSE
            }// END IF 
            else {
                System.out.print("quanto foi gasto na viagem ? ");
                VerbaViagemMotorista = read.nextDouble();
                if (VerbaViagemMotorista > Verbaviagem) {
                    conta = VerbaViagemMotorista - Verbaviagem;
                    System.out.println("Funcionario rescarsido em: R$: " +conta);
                }//END IF
                else {
                    conta = Verbaviagem - VerbaViagemMotorista;
                    System.out.println(" Deve ser devolvido : R$: "+conta +" para a empresa");
                } //END ELSE
            }// END ELSE  
        }// END new IF
        else {System.out.println(" nao sera necessario fazer abastecimento ou verba para viagem");}// END new ELSE para não fazer abastecimento
    }// method viagem 2

    public void Viagem3() {
        int KmTotal = 0;
        System.out.print("digite aqui o nome do local de viagem: ");
        Local = read.next();
        System.out.print("dgite aqui a quantidade de Km para a viagem: ");
        KmViagem = read.nextInt();
       if (KmViagem >= 60) {
            System.out.println("======== VIAGEM INTERURBANA ========");
            System.out.print("digite aqui quanto voce precisa de verba para a viagem: ");
            Verbaviagem = read.nextDouble();
            PC.Abastecimento();
            KmTotal = KmViagem + EnumCars.EnumCars1.Carro3.getKM();
            if (KmTotal >= 5000) {
                M.ManutencaoCarro3();
                System.out.print("quanto foi gasto na viagem ?");
                VerbaViagemMotorista = read.nextDouble();
                if (VerbaViagemMotorista > Verbaviagem) {
                    conta = VerbaViagemMotorista - Verbaviagem;
                    System.out.println("Funcionario rescarsido em: R$: " +conta);
                }//END IF
                else {
                    conta = Verbaviagem - VerbaViagemMotorista;
                    System.out.println(" Deve ser devolvido : R$: " + conta + " para a empresa");
                } //END ELSE
            }// END IF 
            else {
                System.out.print("quanto foi gasto na viagem ? ");
                VerbaViagemMotorista = read.nextDouble();
                if (VerbaViagemMotorista > Verbaviagem) {
                    conta = VerbaViagemMotorista - Verbaviagem;
                    System.out.println("Funcionario rescarsido em: R$: " +conta);
                }//END IF
                else {
                    conta = Verbaviagem - VerbaViagemMotorista;
                    System.out.println(" Deve ser devolvido : R$: "+conta +" para a empresa");
                } //END ELSE
            }// END ELSE  
        }// END new IF
        else {System.out.println(" nao sera necessario fazer abastecimento ou verba para viagem");}// END new ELSE para não fazer abastecimento
    }// method viagem 3

    public void Viagem4() {
        int KmTotal = 0;
        System.out.print("digite aqui o nome do local de viagem: ");
        Local = read.next();
        System.out.print("dgite aqui a quantidade de Km para a viagem: ");
        KmViagem = read.nextInt();
       if (KmViagem >= 60) {
            System.out.println("======== VIAGEM INTERURBANA ========");
            System.out.print("digite aqui quanto voce precisa de verba para a viagem: ");
            Verbaviagem = read.nextDouble();
            PC.Abastecimento();
            KmTotal = KmViagem + EnumCars.EnumCars1.Carro4.getKM();
            if (KmTotal >= 5000) {
                M.ManutencaoCarro4();
                System.out.print("quanto foi gasto na viagem ?");
                VerbaViagemMotorista = read.nextDouble();
                if (VerbaViagemMotorista > Verbaviagem) {
                    conta = VerbaViagemMotorista - Verbaviagem;
                    System.out.println("Funcionario rescarsido em: R$: " +conta);
                }//END IF
                else {
                    conta = Verbaviagem - VerbaViagemMotorista;
                    System.out.println(" Deve ser devolvido : R$: " + conta + " para a empresa");
                } //END ELSE
            }// END IF 
            else {
                System.out.print("quanto foi gasto na viagem ? ");
                VerbaViagemMotorista = read.nextDouble();
                if (VerbaViagemMotorista > Verbaviagem) {
                    conta = VerbaViagemMotorista - Verbaviagem;
                    System.out.println("Funcionario rescarsido em: R$: " +conta);
                }//END IF
                else {
                    conta = Verbaviagem - VerbaViagemMotorista;
                    System.out.println(" Deve ser devolvido : R$: "+conta +" para a empresa");
                } //END ELSE
            }// END ELSE  
        }// END new IF
        else {System.out.println(" nao sera necessario fazer abastecimento ou verba para viagem");}// END new ELSE para não fazer abastecimento
    }// method viagem 4
}// class
