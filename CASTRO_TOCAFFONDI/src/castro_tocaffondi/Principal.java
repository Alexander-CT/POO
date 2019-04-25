package castro_tocaffondi;

// @author CASTRO TOCAFFONDI Alexander Piero

import javax.swing.JOptionPane;

 
public class Principal {

    public static void main(String[] args) {
        Circulo cir=new Circulo();
        cir.setRadio(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el radio del circulo: ","RADIO",JOptionPane.INFORMATION_MESSAGE)));
        JOptionPane.showMessageDialog(null, "El area del circulo es: "+cir.getArea(),"AREA",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: "+cir.getPerimetro(),"PERIMETRO",JOptionPane.INFORMATION_MESSAGE);
        
        Cuadrado cuad=new Cuadrado();
        cuad.setLado(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el lado del cuadrado: ","LADO",JOptionPane.INFORMATION_MESSAGE)));
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+cir.getArea(),"AREA",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: "+cir.getPerimetro(),"PERIMETRO",JOptionPane.INFORMATION_MESSAGE);
        
        
        Trabajador t=new Trabajador();
        JOptionPane.showInputDialog(null, "Ingresa el radio del circulo: ","RADIO",JOptionPane.INFORMATION_MESSAGE);
    }
}
