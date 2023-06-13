
package apppapelaria;
import java.util.*;
/**
 *
 * @author 182120037
 */
public class AppPapelaria {
    /**
     * @param args the command line arguments
     */
     String resposta;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        GestProducts Gp = new GestProducts();
        Gp.createProdutc();
        Gp.ListProduct();
        Gp.deleteProduct();
    }
}
