
package class_oop_2022_06_29;


public interface InterfacegeometricForms {
    
    public String getnomeFigura ();
    public int getArea ();
    public int getperimetro();
    
    // ALL methods ussing return in contruction
    
}// interface 
/* The interface not is a class, is a Entity
--> All methods in interface are abstrats
--> Hevent implementations, only assinatura, only definitions, the methods havent body programming
--> isn't possible crete extends in interface and not is possibly using contruction method
--> when we say one class impements another interface,-->
it's obrigatory the class have implement all mthods in interface */ 

/*1)
Criar um sistema para registrar informações sobre votos realizados no Congresso nacional
durante as sessões. O sistema precisa registrar cada nome de estado do Brasil e incluir a região do estado
(cujo domínio é Norte, Nordeste, Centro-Oeste, Sudeste e Sul). Cada congressista é descrito por seu nome,
mais o estado representado, a data de início em que foi eleito e o partido político ao qual ele ou ela pertence.
O sistema registra cada Projeto de Lei, incluindo o nome do Projeto, a data de votação
e se a lei passou ou falhou (cujo domínio é sim e não) e o propoente (congressista que propôs a lei).
O sistema também registra como cada congressista votou em cada lei (cujo domínio é sim, não, abstenção e nulo).*/

//interface metodo boolean para votação 
//vetor para estados fixo 
//super classe pessoa com nome,estado, data inicio ano eleito, partido
//arrylist clase politico que tem extends super classe pessoa
//classe projeto lei extends politco 
// se a lei passou ou falhou - classe exec menssagem classe exec 
//4 contadores classe projeto lei 
