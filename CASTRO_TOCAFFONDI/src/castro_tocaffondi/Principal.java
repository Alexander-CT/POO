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
        t.setDni(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el DNI del empleado: ","DNI",JOptionPane.INFORMATION_MESSAGE)));
        t.setNombre(JOptionPane.showInputDialog(null, "Ingresa el nombre del empleado: ","NOMBRE",JOptionPane.INFORMATION_MESSAGE));
        t.setSueldo(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el sueldo del empleado: ","SUELDO",JOptionPane.INFORMATION_MESSAGE)));
        JOptionPane.showMessageDialog(null, "El AFP del empleado "+t.getNombre()+" es "+t.getAFP(),"AFP",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El ESSALUD del empleado "+t.getNombre()+" es "+t.getESSALUD(),"ESSALUD",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El sueldo final del empleado "+t.getNombre()+" es "+t.getSueldofinal(),"SUELDO FINAL",JOptionPane.INFORMATION_MESSAGE);
    }
}
