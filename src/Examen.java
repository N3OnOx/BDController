public class Examen {
    private int codigoexa;
    private String descipcionexa;

    Examen(){

    }

    public Examen(int codigoexa, String descipcionexa) {
        super();
        this.codigoexa = codigoexa;
        this.descipcionexa = descipcionexa;
    }

    public int getCodigoexa() {
        return codigoexa;
    }

    public void setCodigoexa(int codigoexa) {
        this.codigoexa = codigoexa;
    }

    public String getDescipcionexa() {
        return descipcionexa;
    }

    public void setDescipcionexa(String descipcionexa) {
        this.descipcionexa = descipcionexa;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "codigoexa=" + codigoexa +
                ", descipcionexa='" + descipcionexa + '\'' +
                '}';
    }
}
