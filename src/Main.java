import java.util.Scanner;

public class Main {

    public static void main(String[] argv) {

        OpositorController opoController = new OpositorController();
        ExamenController examenController = new ExamenController();
        TribunalController tribunalController = new TribunalController();
        Scanner sn = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1. Consultar todos los datos de los opositores");
            System.out.println("2. Consulta de los diferentes tipos de examen");
            System.out.println("3. Consulta de los tribunales");
            System.out.println("4. Eliminar opositor");
            System.out.println("5. Salir");
            opc = sn.nextInt();
            switch (opc){
                case 1:
                    opoController.datosOpositores();
                    break;
                case 2:
                    examenController.tiposExamen();
                    break;
                case 3:
                    tribunalController.datosTribunales();
                    break;
                case 4:
                    opoController.eliminarOpo();
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                    default:
                        break;
            }
        }while (opc != 5);
        sn.close();
        sc.close();
    }
}