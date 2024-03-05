package cr.ac.una.tarea.tarea_modelo;

/**
 * Universidad Nacional - Programación II 2024
 * @author Stiward Araya 
 * @author Justin Mendez
 */
public class Cuenta {
    private String nombreCuenta;
    
    public Cuenta(){
        this.nombreCuenta = "";
    }
    
    public Cuenta(String nCuenta){
        this.nombreCuenta = nCuenta;
    }
    
    public void setNombre(String nCuenta){
        this.nombreCuenta = nCuenta;
    }
    
    public String getNombre(){
        return this.nombreCuenta;
    }
    
}
