public class ExamenController {
    private BDController examenController;

    public ExamenController() {
        examenController = new BDController();
    }

    public BDController getExamenController() {
        return examenController;
    }

    public void setExamenController(BDController examenController) {
        this.examenController = examenController;
    }
    public void tiposExamen(){
        for (Examen exa: this.examenController.tiposExamen()){
            System.out.println("Codigo: "+exa.getCodigoexa()+"Descripcion: "+exa.getDescipcionexa());
        }
    }
}
