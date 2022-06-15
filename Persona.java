/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ferreteriapoo;

/**
 * 
 * @author Edward Fabian Goyeneche 
 */
public class Persona {
    public String nombre;
    public int identificacion;
    private String direccion;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, int identificacion , String direccion){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
}
