package paquete;

import java.sql.*;

public class Conexion {
    
    private String url = "jdbc:mysql://localhost:3306/CRUD"; 
    
    private Connection conn=null;
    
    public Conexion() {
     try{   
        conn = DriverManager.getConnection(url,"root","root");     
      }
      catch(SQLException e)       
      {
         System.out.println(e);         
      } 
    }
    
    public boolean loginDB(String usuario,String contrasena){
        boolean validador = false;
        
        try{
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select nombre_usuario,clave_usuario from EMPLEADO");
        while(rs.next()){
        if(usuario.equalsIgnoreCase(rs.getString(1)) & contrasena.equalsIgnoreCase(rs.getString(2))){
            validador = true;
        }
        }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return validador;
    }
    
    public boolean loginAdminDB(String usuario,String contrasena,int claveSeguridad ){
        boolean validador = false;
        
        try{
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT EMPLEADO.NOMBRE_USUARIO,EMPLEADO.CLAVE_USUARIO, ADMINISTRADO.CLAVE_SEGURIDAD FROM EMPLEADO INNER JOIN ADMINISTRADO ON EMPLEADO.RUT=ADMINISTRADO.RUT");
        while(rs.next()){
        if(usuario.equalsIgnoreCase(rs.getString(1)) & contrasena.equalsIgnoreCase(rs.getString(2))& claveSeguridad == rs.getInt(3) ){
            validador = true;
        }
        }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return validador;
    }

    
    
}
