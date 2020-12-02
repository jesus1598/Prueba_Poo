package paquete;


public class Empleado {
   
    private String rutEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpeado;
    private String emailEmpleado;
    private String passwordUsuario;
    private String cargoEmpleado;
    private String nombreUsuario;
    

    public Empleado(String rutEmpleado, String nombreEmpleado, String apellidoEmpeado, String emailEmpleado, String passwordUsuario, String cargoEmpleado, String nombreUsuario) {
        this.rutEmpleado = rutEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpeado = apellidoEmpeado;
        this.emailEmpleado = emailEmpleado;
        this.passwordUsuario = passwordUsuario;
        this.cargoEmpleado = cargoEmpleado;
        this.nombreUsuario = nombreUsuario;
    }    
    
    public Empleado() {
    }

    public String loginEmpleado(String nombreUsuario, String passwordUsuario ){
       boolean login_Empleado;
       Conexion con = new Conexion();
       login_Empleado= con.loginDB(nombreUsuario, passwordUsuario);
       if(login_Empleado== true)
           return "true";
       else
           return "false";
    }
    
    
    public String loginAdministrador(String nombreUsuario, String passwordUsuario, int claveSeguridad){
        boolean login_Administrador;
        Conexion con = new Conexion();
        login_Administrador = con.loginAdminDB(nombreUsuario, passwordUsuario, claveSeguridad);
        if(login_Administrador == true)
           return "true";
       else
           return "false";
    }
    
      
    public void ingresarEmpleado(String rutEmpleado, String nombreEmpleado, String apellidoEmpeado, String emailEmpleado, String passwordUsuario, String cargoEmpleado, String nombreUsuario){
        
        
    }
    
}
