package paquete;

public class Administrador extends Empleado {
    
    private int claveSeguridad;

    public Administrador(int claveSeguridad, String rutEmpleado, String nombreEmpleado, String apellidoEmpeado, String emailEmpleado, String passwordUsuario, String cargoEmpleado, String nombreUsuario) {
        super(rutEmpleado, nombreEmpleado, apellidoEmpeado, emailEmpleado, passwordUsuario, cargoEmpleado, nombreUsuario);
        this.claveSeguridad = claveSeguridad;
    }

    
    public Administrador() {
    }
    
    
    
    
}
