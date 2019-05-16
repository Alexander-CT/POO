package Pack;

import javax.swing.JOptionPane;

/**
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comercial c1=new Comercial (300,"DDR",37,1000);
        Repartidor r1=new Repartidor ("zona 3","Fer",26,900);
        
        c1.plus();
        r1.plus();
        
        JOptionPane.showMessageDialog(null,c1,"Comercial 1",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,r1,"Repartidor 1",JOptionPane.INFORMATION_MESSAGE);
                
    }
    
}
