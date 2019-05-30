package Pack;

import javax.swing.JOptionPane;

/**
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public class Vip extends Cliente{
    int puntosVip;

    public Vip(int puntosVip, int dni, String nombre, int edad, int meses, float precio) {
        super(dni, nombre, edad, meses, precio);
        this.puntosVip = puntosVip;
    }

    public int getPuntosVip() {
        return puntosVip;
    }

    public void setPuntosVip(int puntos_vip) {
        this.puntosVip = puntos_vip;
    }
    
    
    
    @Override
    public String toString(){
        return super.toString()+"\nPuntos VIP "+puntosVip;
    }
    
   @Override
    public boolean descuentoMinimo(){//Usa solo un puntoVip
        if(super.getPrecio()>=100 && puntosVip>=10){
            float nuevoPrecio = super.getPrecio()-100;
            super.setPrecio(nuevoPrecio);
            puntosVip--;
            JOptionPane.showMessageDialog(null, "Se le añadió el descuento, al Cliente Vip"+super.getNombre());
        }
        return false;
    }
    
    @Override
    public boolean descuentoFull(){//Usa solo un puntoVip
        for(int cont=1;cont<=puntosVip;cont++){
            if(super.getPrecio()>=100 && puntosVip>=10){
                float nuevoPrecio = super.getPrecio()-100;
                super.setPrecio(nuevoPrecio);
                puntosVip--;
                JOptionPane.showMessageDialog(null, "Se le añadió el descuento, al Cliente Vip"+super.getNombre());
            }
        }
        return false;
    }
    
    /*@Override
    public boolean plus(){
        for(int i = 1; i<=cupon ; i++){
            float nuevoPrecio = super.getPrecio()-10;
            super.setPrecio(nuevoPrecio);
        }
        JOptionPane.showMessageDialog(null, "Se le añadió el descuento, al repartidor"+super.getNombre());
        return false;
    }*/
}
