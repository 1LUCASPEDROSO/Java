package class_oop_2022_06_30;
import java.util.*;
public class project_law implements Interface_project_law {

    @Override
    public void votation() {
   class_politic politic1 =  new class_politic ("joao","01/28/20","A","RS");
     class_politic politic2 =  new class_politic ("fernanda","11/13/18","B","RS");
     class_politic politic3 =  new class_politic ("carlos","12/01/20","C","RS");
     class_politic politic4 =  new class_politic ("ana","06/24/19","D","RS");
     class_politic politic5 =  new class_politic ("beatriz","03/18/19","F","RS");
     class_politic politic6 =  new class_politic ("lucas","03/07/22","G","RS");
      Scanner read = new  Scanner (System.in);  
     //variables
     int count_yes =0, count_no =0,count_nulo =0, count_abstenção =0,resposta;
     //variables
     do {
        System.out.println(" project: logitech for all");
        System.out.println("digit here your vote " + "" +politic1.name);
        System.out.println("[1] - for  yes ");
        System.out.println("[2] - for  no ");
        System.out.println("[3] - for  abstencao  ");
        System.out.println("[4] - for  nulo");
        System.out.print("digit here: ");
        resposta = read.nextInt(); 
       switch (resposta) {
           case 1:
               System.out.println("your vote is yes");
               count_yes++;
               break;
           case 2:
               System.out.println("your vote is no");
               count_no++;
               break;
           case 3:
               System.out.println("your vote is nulo");
               count_nulo++;
               break;
           case 4:
               System.out.println("your vote is abstencion");
               count_abstenção++;
               break;
           default:
               break;
       }
        }while (resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);
         System.out.println("\n==================================================\n");  
        do {
        System.out.println(" project: logitech for all");
        System.out.println("digit here your vote " + "" +politic2.name);
        System.out.println("[1] - for  yes ");
        System.out.println("[2] - for  no ");
        System.out.println("[3] - for  abstencao  ");
        System.out.println("[4] - for  nulo");
        System.out.print("digit here: ");
        resposta = read.nextInt();
        if (resposta == 1){System.out.println("your vote is yes");
         count_yes++;}
        else if (resposta == 2){System.out.println("your vote is no");
        count_no++;}
        else if (resposta == 3){System.out.println("your vote is nulo");
        count_nulo++;}
        else if (resposta == 4){System.out.println("your vote is abstencion");
        count_abstenção++;
        }
         System.out.println("\n==================================================\n");
     }while (resposta != 1 ||resposta != 2 ||resposta != 3 ||resposta != 4);
        do {
        System.out.println(" project: logitech for all");
        System.out.println("digit here your vote " + "" +politic3.name);
        System.out.println("[1] - for  yes ");
        System.out.println("[2] - for  no ");
        System.out.println("[3] - for  abstencao  ");
        System.out.println("[4] - for  nulo");
        System.out.print("digit here: ");
        resposta = read.nextInt();
        if (resposta == 1){System.out.println("your vote is yes");
         count_yes++;}
        else if (resposta == 2){System.out.println("your vote is no");
        count_no++;}
        else if (resposta == 3){System.out.println("your vote is nulo");
        count_nulo++;}
        else if (resposta == 4){System.out.println("your vote is abstencion");
        count_abstenção++;
        }
         System.out.println("\n==================================================\n");
     }while (resposta != 1 ||resposta != 2 ||resposta != 3 ||resposta != 4);
     System.out.println(" project: logitech for all");
        System.out.println("digit here your vote" + "" + politic4.name);
        System.out.println("[1] - for  yes ");
        System.out.println("[2] - for  no ");
        System.out.println("[3] - for  abstencao  ");
        System.out.println("[4] - for  nulo");
        System.out.print("digit here: ");
        resposta = read.nextInt();
        if (resposta == 1){System.out.println("your vote is yes");
         count_yes++;}
        else if (resposta == 2){System.out.println("your vote is no");
        count_no++;}
        else if (resposta == 3){System.out.println("your vote is nulo");
        count_nulo++;}
        else if (resposta == 4){System.out.println("your vote is abstencion");
        count_abstenção++;
        }
         System.out.println("\n==================================================\n");
        do {
        System.out.println(" project: logitech for all");
        System.out.println("digit here your vote " + "" +politic5.name);
        System.out.println("[1] - for  yes ");
        System.out.println("[2] - for  no ");
        System.out.println("[3] - for  abstencao  ");
        System.out.println("[4] - for  nulo");
        System.out.print("digit here: ");
        resposta = read.nextInt();
        if (resposta == 1){System.out.println("your vote is yes");
         count_yes++;}
        else if (resposta == 2){System.out.println("your vote is no");
        count_no++;}
        else if (resposta == 3){System.out.println("your vote is nulo");
        count_nulo++;}
        else if (resposta == 4){System.out.println("your vote is abstencion");
        count_abstenção++;
        }
         System.out.println("\n==================================================\n");
     }while (resposta != 1 ||resposta != 2 ||resposta != 3 ||resposta != 4);
           do {
        System.out.println(" project: logitech for all");
        System.out.println("digit here your vote " + "" +politic6.name);
        System.out.println("[1] - for  yes ");
        System.out.println("[2] - for  no ");
        System.out.println("[3] - for  abstencao  ");
        System.out.println("[4] - for  nulo");
        System.out.print("digit here: ");
        resposta = read.nextInt();
        if (resposta == 1){System.out.println("your vote is yes");
         count_yes++;}
        else if (resposta == 2){System.out.println("your vote is no");
        count_no++;}
        else if (resposta == 3){System.out.println("your vote is nulo");
        count_nulo++;}
        else if (resposta == 4){System.out.println("your vote is abstencion");
        count_abstenção++;
        }
         System.out.println("\n==================================================\n");
     }while (resposta != 1 ||resposta != 2 ||resposta != 3 ||resposta != 4);
        if (count_yes > count_no && (count_yes > count_nulo) && (count_yes > count_abstenção) ){System.out.println("the project is aprovedd for: " + count_yes);}
        else if ( count_no > count_yes && (count_no > count_nulo) && (count_no > count_abstenção) ){System.out.println("the project not aprovedd for: " + count_no);}
        else if ( count_nulo > count_yes && (count_nulo > count_no) && (count_nulo > count_abstenção) ){System.out.println("the project is vote to nulo for: " + count_nulo);}
        else if ( count_abstenção > count_yes && (count_abstenção > count_no) && (count_abstenção > count_nulo) ){System.out.println("the project is vote to abstencion for: " + count_abstenção);}
    } // END method votation interface for interface_project_law
}// class
