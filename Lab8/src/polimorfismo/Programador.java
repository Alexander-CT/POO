package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author CASTRO TOCAFFONDI
 */
public class Programador {
    public void sueldo(int horas,double pagoH){
        JOptionPane.showMessageDialog(null, "El pago es: "+(horas*pagoH), "PAGO",JOptionPane.INFORMATION_MESSAGE);
    }
    public void datos(String nom,String ape){
        JOptionPane.showMessageDialog(null, "Nombre: "+nom+"\nApellidos: "+ape, "DATOS",JOptionPane.INFORMATION_MESSAGE);
    }
    public void labores(String lab){
        JOptionPane.showMessageDialog(null, "Soy programador y me dedico a "+lab, "HISTORIA",JOptionPane.INFORMATION_MESSAGE);
    }
}
