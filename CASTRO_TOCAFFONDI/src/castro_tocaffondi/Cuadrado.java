package castro_tocaffondi;

// @author CASTRO TOCAFFONDI Alexander Piero

public class Cuadrado {
    float lado;
    float area;
    float perimetro;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getArea() {
        area=(float) Math.pow(lado,2);
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        perimetro=4*lado;
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
}
