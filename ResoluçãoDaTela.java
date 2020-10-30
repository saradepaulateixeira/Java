
package resoluçãodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãoDaTela {

    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("A resolução da sua tela é de: " + lar + " x " + alt);
    }
    
}
