import java.sql.*;
import java.util.ArrayList;

public class BDController {
    private Connection conexion;
    BDController(){
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://192.168.10.252:3306/oposiciones","1GS","Nelson2000");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Opositor> datosOpositores(){
        ArrayList<Opositor> opositores = new ArrayList<>();
        try {
            Statement miStatement = this.conexion.createStatement();
            ResultSet rs=miStatement.executeQuery("SELECT * FROM opositores");
            while (rs.next()){
                opositores.add(new Opositor(rs.getString("DNIOPO"),rs.getString("NOMOPO"),rs.getString("CIUOPO"),rs.getString("TFALU")));
            }
            miStatement.close();
            rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return opositores;
    }

    public void eliminarOpo(){
        try {
            Statement myStatement = this.conexion.createStatement();
            String sql = "DELETE FROM opositores WHERE DNIOPO='1173391'";
            myStatement.executeUpdate(sql);
            myStatement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Examen> tiposExamen(){
        ArrayList<Examen> examenes = new ArrayList<>();
        try {
            Statement miStatement = this.conexion.createStatement();
            ResultSet rs=miStatement.executeQuery("SELECT * FROM examenes");
            while (rs.next()){
                examenes.add(new Examen(rs.getInt("CODIGOEXA"),rs.getString("DESCRIPCIONEXA")));
            }
            miStatement.close();
            rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return examenes;
    }

    public ArrayList<Tribunal> datosTribunales(){
        ArrayList<Tribunal> tribunales = new ArrayList<>();
        try {
            Statement miStatement = this.conexion.createStatement();
            ResultSet rs=miStatement.executeQuery("SELECT * FROM tribunales");
            while (rs.next()){
                tribunales.add(new Tribunal(rs.getInt("CODIGOTRI"),rs.getString("PRESIDENTE"),rs.getString("SECRETARIO"),rs.getString("VOCAL1"),rs.getString("VOCAL2"),rs.getString("VOCAL3")));
            }
            miStatement.close();
            rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return tribunales;
    }
}


