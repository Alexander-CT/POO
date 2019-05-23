package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO UCV
 */
public class AdministradorBD {
    public void sueldo(double pago){
        JOptionPane.showMessageDialog(null, "El pago es: "+pago, "PAGO",JOptionPane.INFORMATION_MESSAGE);
    }
    public void datos(String nom){
        JOptionPane.showMessageDialog(null, "Nombre: "+nom,"DATOS",JOptionPane.INFORMATION_MESSAGE);
    }
    public void labores(String lab){
        JOptionPane.showMessageDialog(null, "Soy AdministradorDB y me dedico a "+lab, "HISTORIA",JOptionPane.INFORMATION_MESSAGE);
    }
}
