package problemas.primero;
public class Ortoedro extends FiguraTridimensional{
    double ancho;
    double base;
    double altura;

    static final int caras=6;

    public Ortoedro( double ancho,double base, double altura) {

        this.altura = altura;
        this.ancho = ancho;
        this.base = base;
    }
      public Ortoedro( ){
          altura = 1;
           ancho = 1;
            base = 1;
        }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
        public double calcularVolumen() {
            return ancho*base*altura;
    }


        @Override
        public double calcularSuperficie() {
            return 2*(ancho*base)+2*(ancho*altura)+2*(base*altura);
        }
        @Override
    public String toString(){
        return "la figura es un Ortoedro";
        }
        System.out.println("la figura tiene las sigueintes medidas"+altura+""+ancho+""+base)


    }




