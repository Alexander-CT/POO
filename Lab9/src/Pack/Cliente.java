package Pack;

/**
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public abstract class Cliente {
    private int dni;
    private String nombre;
    private int edad;
    private int meses;
    private float precio;

    public Cliente(int dni, String nombre, int edad, int meses, float precio) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.meses = meses;
        this.precio = precio;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "DNI: "+dni+"\nNombre: "+nombre+"\nMeses: "+meses+"\nPrecio: "+precio;
    }
    
    public abstract boolean descuentoFull();
    public abstract boolean descuentoMinimo();
}
