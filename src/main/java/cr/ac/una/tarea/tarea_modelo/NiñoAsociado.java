/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.tarea.tarea_modelo;

/**
 *
 * @author justi
 */
public class NiñoAsociado {
 
     private String folio;
     private String nombre;
    
    public NiñoAsociado(){
    this.folio ="";
    this.nombre="";
 }
    
    public void setNombre(String nNombre){
        this.nombre = nNombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setFolio(String nFolio){
        this.folio = nFolio;
    }
    
    public String getFolio(){
        return this.folio;
    }
}