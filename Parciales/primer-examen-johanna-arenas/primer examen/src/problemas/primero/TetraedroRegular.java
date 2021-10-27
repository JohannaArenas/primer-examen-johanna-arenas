package problemas.primero;

public class TetraedroRegular extends FiguraTridimensional{
     double arista;
    static final int caras=4;
    public TetraedroRegular(double arista) {
        this.arista = arista;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public TetraedroRegular() {
            arista = 1;
        }
            @Override
            public double calcularVolumen () {
                return Math.sqrt(arista);
            }


            @Override
            public double calcularSuperficie () {
                return Math.sqrt(arista);
            }
            @Override
            public String toString () {
                return "la figura es un TetraedroRegular";
            }

        }




