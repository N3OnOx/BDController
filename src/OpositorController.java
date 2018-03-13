public class OpositorController {
    private BDController controladorBD;

    OpositorController(){
        controladorBD = new BDController();
    }

    public BDController getControladorBD() {
        return controladorBD;
    }

    public void setControladorBD(BDController controladorBD) {
        this.controladorBD = controladorBD;
    }

    public void datosOpositores(){
        for (Opositor opo: this.controladorBD.datosOpositores()){
            System.out.println("Nombre: "+opo.getNombre()+" DNI: "+opo.getDni()+" Ciudad: "+opo.getCiudad()+" Telefono: "+opo.getTelefono());
        }
    }

    public void eliminarOpo(){
        this.controladorBD.eliminarOpo();
    }

    @Override
    public String toString() {
        return "OpositorController{" +
                "controladorBD=" + controladorBD +
                '}';
    }
}
