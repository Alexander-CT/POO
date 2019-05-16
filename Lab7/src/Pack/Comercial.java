package Pack;

import javax.swing.JOptionPane;

/**
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public class Comercial extends Empleado {
    //Atributos
    private double comision;
    //Construtor
    public Comercial(double comision, String nombre, int edad, double salario){
        super(nombre, edad, salario);
        this.comision = comision;
    }
    
    //Metodos
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    @Override
    public String toString(){
        return super.toString()+" comision "+comision;
    }
    
    @Override
    public boolean plus(){
        if(super.getEdad()>30 && this.comision>200){
            double nuevoSalario = super.getSalario()+super.PLUS;
            super.setSalario(nuevoSalario);
            JOptionPane.showMessageDialog(null, "Se le añadió el plus, al empleado "+super.getNombre());
        }
        return false;
    }
}
