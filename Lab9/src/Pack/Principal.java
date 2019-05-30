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
        // TODO code application logic here
        Regular r1=new Regular(2,1234567,"Alex",25,5,200);
        Vip v1=new Vip(10,1234567,"Alex",25,5,200);
        
        //El antes
        //JOptionPane.showMessageDialog(null,r1,"Cliente Regular 1",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,v1,"Cliente VIP 1",JOptionPane.INFORMATION_MESSAGE);
        
        //r1.descuentoFull(); //Solo usa un cupon
        //r1.descuentoMinimo(); // Usa todos los cupones
        
        //v1.descuentoFull(); //Solo usa un puntosVip
        //v1.descuentoMinimo(); // Usa todos los puntosVip
        
        
        //El despues
        JOptionPane.showMessageDialog(null,r1,"Cliente Regular 1",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,v1,"Cliente VIP 1",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
