public class Tribunal {
    private int codigotri;
    private String presidente;
    private String secretario;
    private String vocal1;
    private String vocal2;
    private String vocal3;

    public Tribunal() {
    }

    public Tribunal(int codigotri, String presidente, String secretario, String vocal1, String vocal2, String vocal3) {
        super();
        this.codigotri = codigotri;
        this.presidente = presidente;
        this.secretario = secretario;
        this.vocal1 = vocal1;
        this.vocal2 = vocal2;
        this.vocal3 = vocal3;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getSecretario() {
        return secretario;
    }

    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }

    public String getVocal1() {
        return vocal1;
    }

    public void setVocal1(String vocal1) {
        this.vocal1 = vocal1;
    }

    public String getVocal2() {
        return vocal2;
    }

    public void setVocal2(String vocal2) {
        this.vocal2 = vocal2;
    }

    public String getVocal3() {
        return vocal3;
    }

    public void setVocal3(String vocal3) {
        this.vocal3 = vocal3;
    }

    public int getCodigotri() {
        return codigotri;
    }

    public void setCodigotri(int codigotri) {
        this.codigotri = codigotri;
    }

    @Override
    public String toString() {
        return "Tribunal{" +
                "codigotri=" + codigotri +
                ", presidente='" + presidente + '\'' +
                ", secretario='" + secretario + '\'' +
                ", vocal1='" + vocal1 + '\'' +
                ", vocal2='" + vocal2 + '\'' +
                ", vocal3='" + vocal3 + '\'' +
                '}';
    }
}
