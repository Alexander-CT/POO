package Pack;

import javax.swing.JOptionPane;

/**
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public class Regular extends Cliente {
    private int cupon;

    public Regular(int cupon, int dni, String nombre, int edad, int meses, float precio) {
        super(dni, nombre, edad, meses, precio);
        this.cupon = cupon;
    }

    public int getCupon() {
        return cupon;
    }

    public void setCupon(int cupon) {
        this.cupon = cupon;
    }
    
    
    
    
    @Override
    public String toString(){
        return super.toString()+"\nCupon "+cupon;
    }
    
    @Override
    public boolean descuentoFull(){//Usar todos los cupones
        for(int i = 1; i<=cupon ; i++){
            if(super.getPrecio()>=10 && cupon>0){
                float nuevoPrecio = super.getPrecio()-10;
                super.setPrecio(nuevoPrecio);
                cupon--;
            }
        }
        JOptionPane.showMessageDialog(null, "Se le añadió el descuento, al Cliente Regular"+super.getNombre());
        return false;
    }
    
    @Override
    public boolean descuentoMinimo(){//Usar todos los cupones
        if(super.getPrecio()>=10 && cupon>0){
            float nuevoPrecio = super.getPrecio()-10;
            super.setPrecio(nuevoPrecio);
            cupon--;
        }
        JOptionPane.showMessageDialog(null, "Se le añadió el descuento, al Cliente Regular"+super.getNombre());
        return false;
    }
    /*public void asdf(){
        for(int i = 1; i<=cupon ; i++){
            float nuevoPrecio = super.getPrecio()-10;
            super.setPrecio(nuevoPrecio);
        }
        JOptionPane.showMessageDialog(null, "Se le añadió el descuento, al repartidor"+super.getNombre());
        return false;
    }*/
}
