package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO UCV
 */
public class Analista {
    public void sueldo(int horas,double pagoH){
        JOptionPane.showMessageDialog(null, "El pago es: "+(horas*pagoH), "PAGO",JOptionPane.INFORMATION_MESSAGE);
    }
    public void datos(String nom,String ape,String dir){
        JOptionPane.showMessageDialog(null, "Nombre: "+nom+"\nApellidos: "+ape+"\nDirección: "+dir, "DATOS",JOptionPane.INFORMATION_MESSAGE);
    }
    public void labores(String lab, int horas){
        JOptionPane.showMessageDialog(null, "Soy Analista y me dedico a "+lab+" "+horas+" horas", "HISTORIA",JOptionPane.INFORMATION_MESSAGE);
    }
}
