/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ferreteriapoo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ventas {
    
    private  int  valorVenta;
    private int serialVenta;
    private int fechaVenta;
    
    
    public  Ventas(){
        
    }
    
    
    public Ventas (int valorVenta, int serialVenta, int fechaVentas){
        this.serialVenta = serialVenta;
        this.valorVenta = valorVenta;
        this.fechaVenta = fechaVentas;
    }
    
    
    @Override
    public String toString(){
        return "["+this.serialVenta+", "+this.valorVenta+","+this.fechaVenta+"]";
        
    }
    
    
  

}
