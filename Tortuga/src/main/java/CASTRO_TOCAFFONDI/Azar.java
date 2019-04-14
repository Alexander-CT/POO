/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CASTRO_TOCAFFONDI;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO UCV
 */
public class Azar {
    int n1;
    int n2;

    public Azar(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public int getRamdon(){
        int numero = (int) (Math.random()*6) + 1;
        return numero;
    }
    
    public void Resultado(){
        JOptionPane.showMessageDialog(null, "Resultado: "+n1+"--"+n2,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
    }
}
