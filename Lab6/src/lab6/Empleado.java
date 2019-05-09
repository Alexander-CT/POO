package lab6;

// @author CASTRO TOCAFFONDI Alexander Piero
 
public class Empleado {
    String codigo;
    String nombre;
    String area;
    double sueldoBase;
    double horasExtras;
    String tipo_seg;
    
    public Empleado(String codigo, String nombre, String area, double sueldoBase, double horasExtras, String tipo_seg) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipo_seg = tipo_seg;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getTipo_seg() {
        return tipo_seg;
    }

    public void setTipo_seg(String tipo_seg) {
        this.tipo_seg = tipo_seg;
    }

    public double montoHExtras() {
        return sueldoBase*horasExtras/240;
    }

    public double montoSeguro() {
        if(tipo_seg.equalsIgnoreCase("AFP"))
            return sueldoBase*0.17;
        if(tipo_seg.equalsIgnoreCase("SNP"))
            return sueldoBase*0.05;
        return 0;
    }
    
    public double montoEssalud() {
        return sueldoBase*0.03;
    }
    
    public double montoDescuentos() {
        return montoSeguro()+montoEssalud();
    }
    
    public double sueldoBruto() {
        return sueldoBase+montoHExtras();
    }
    
    public double sueldoNeto() {
        return sueldoBruto()-montoDescuentos();
    }
        
}
