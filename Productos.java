/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ferreteriapoo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Productos {
    public  String nombreProducto;
    public  String marca;
    public  long serial;
    public float costo;
    public int cantidad;
    
    
    
    public Productos() {
        
    }
    
    public Productos(String nombreProducto, String  marca, long serial, float costo, int cantidad){
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.serial = serial;
        this.costo = costo;
        this.cantidad = cantidad;
        
    }

    
    
    public long getSerial(){
        return this.serial;
    }
    
    public void setSerial(long serial){
        this.serial = serial;
    }

 
    
    @Override
    
    public String toString(){
        return "["+this.nombreProducto+","+this.marca+","+this.serial+","+this.costo+","+this.cantidad+"]";
        
    }
    

}
