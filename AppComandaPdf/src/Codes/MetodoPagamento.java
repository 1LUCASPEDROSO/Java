package Codes;
import javax.swing.JOptionPane;

public class MetodoPagamento {
 String formapagamento,f;   
  public void MetodoPagamento (){
        do {
        JOptionPane.showInputDialog(null, "Digite a forma de pagamento:"); 
        if (formapagamento.equals("débito")){
            JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");
        }
        else if (formapagamento.equals("crédito")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");}
        else if (formapagamento.equals("Pix")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");}
        else if (formapagamento.equals("Dinheiro")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");}
        else {JOptionPane.showMessageDialog(null, "Esse método de pagamento não é aceito no restaurante");}
        }while (formapagamento.equals("crédito") | formapagamento.equals("débito") | formapagamento.equals("pix") | formapagamento.equals("Dinheiro") ); // end do while
        } // END metodoPagamento   
}
