package problemas.primero;

public class Cubo extends FiguraTridimensional{
    double lado;
    static final int caras=6;

    public Cubo( double lado) {
             this.lado = lado;
    }
    public Cubo( ) {
        lado = 1;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolumen() {
        return Math.sqrt(3)*lado;
    }


    @Override
    public double calcularSuperficie() {
        return 6*(arista)*(Math.sqrt(2));
    }
    @Override
    public String toString(){
        return "la figura es un Cubo";
    }



}
