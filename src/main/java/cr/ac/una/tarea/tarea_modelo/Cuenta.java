package cr.ac.una.tarea.tarea_modelo;

/**
 * Clase objeto para cuenta
 * Universidad Nacional - Programación II 2024
 * @author Stiward Araya 
 * @author Justin Mendez
 */
public abstract class Cuenta {
    private int idCuenta;
    private String nombreCuenta;
    
    public Cuenta(){
        this.nombreCuenta = "";
    }
    
    public Cuenta(String nCuenta){
        this.nombreCuenta = nCuenta;
    }
    
}
