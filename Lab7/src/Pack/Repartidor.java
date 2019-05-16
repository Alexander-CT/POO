package Pack;

import javax.swing.JOptionPane;

/**
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public class Repartidor extends Empleado {
    //Atributos
    private String zona;
    //Construtor
    public Repartidor(String zona, String nombre, int edad, double salario){
        super(nombre, edad, salario);
        this.zona = zona;
    }
    
    //Metodos
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    public String toString(){
        return super.toString()+" zona "+zona;
    }
    
    @Override
    public boolean plus(){
        if(super.getEdad()>25 && this.zona.equalsIgnoreCase("zona 3")){
            double nuevoSalario = super.getSalario()+super.PLUS;
            super.setSalario(nuevoSalario);
            JOptionPane.showMessageDialog(null, "Se le añadió el plus, al repartidor"+super.getNombre());
        }
        return false;
    }
}
