package cr.ac.una.tarea.tarea_modelo;

/**
 * Clase objeto para los niños asociados 
 * Universidad Nacional - Programación II 2024
 * @author Stiward Araya
 * @author Justin Mendez
 */
public class NiñoAsociado {

    private String folio;
    private String nombre;

    public NiñoAsociado() {
        this.folio = "";
        this.nombre = "";
    }

    public NiñoAsociado(String folio, String nombre) {
        this.folio = folio;
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getFolio() {
        return this.folio;
    }
}
