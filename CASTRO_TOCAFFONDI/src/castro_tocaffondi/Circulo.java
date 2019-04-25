package castro_tocaffondi;

// @author CASTRO TOCAFFONDI Alexander Piero

public class Circulo {
    float radio;
    float area;
    float perimetro;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        area=(float) (3.14*radio*radio);
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        perimetro=(float) (2*3.14*radio);
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
}
