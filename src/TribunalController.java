public class TribunalController {
    private BDController tribunalcontroller;


    public TribunalController() {
        tribunalcontroller = new BDController();
    }

    public BDController getTribunalcontroller() {
        return tribunalcontroller;
    }

    public void setTribunalcontroller(BDController tribunalcontroller) {
        this.tribunalcontroller = tribunalcontroller;
    }

    public void datosTribunales(){
        for (Tribunal tri: this.tribunalcontroller.datosTribunales()){
            System.out.println("Codigo: "+tri.getCodigotri()+" Presidente: "+tri.getPresidente()+" Secretario: "+tri.getSecretario()+" Vocal1: "+tri.getVocal1()+" Vocal2: "+tri.getVocal2()+" Vocal3: "+tri.getVocal3());
        }
    }
}
