/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castro_tocaffondi;

/**
 *
 * @author CASTRO TOCAFFONDI
 */
public class Trabajador {
    int dni;
    String nombre;
    float sueldo;
    float AFP;
    float ESSALUD;
    float sueldofinal;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getAFP() {
        AFP=(float) (sueldo*0.1);
        return AFP;
    }

    public void setAFP(float AFP) {
        this.AFP = AFP;
    }

    public float getESSALUD() {
        return ESSALUD;
    }

    public void setESSALUD(float ESSALUD) {
        this.ESSALUD = ESSALUD;
    }

    public float getSueldofinal() {
        sueldofinal=AFP+ESSALUD;
        return sueldofinal;
    }

    public void setSueldofinal(float sueldofinal) {
        this.sueldofinal = sueldofinal;
    }
    
    
    
    
}
