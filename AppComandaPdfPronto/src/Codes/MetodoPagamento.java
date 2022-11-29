package Codes;
import javax.swing.JOptionPane;

public class MetodoPagamento {
 String formapagamento,f;
 int s =1;
  public void MetodoPagamento (){
//      System.out.println("->"+formapagamento);
        f =  JOptionPane.showInputDialog(null, "Digite a forma de pagamento:");   
        if (f.equals("débito")){
            JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");
        }
        else if (f.equals("crédito")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito"); s =2;}
        else if (f.equals("pix")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");s =2;}
        else if (f.equals("dinheiro")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");s =2;}
        
        else{
        do { JOptionPane.showMessageDialog(null, "Esse método de pagamento não é aceito no restaurante");
             f =  JOptionPane.showInputDialog(null, "Digite a forma de pagamento:");
            } while (!(f.equals("credito") | f.equals("debito") | f.equals("pix") | f.equals("Dinheiro")));
        System.out.println(""+s);
        }// END else
        } // END metodoPagamento 
        }// class   