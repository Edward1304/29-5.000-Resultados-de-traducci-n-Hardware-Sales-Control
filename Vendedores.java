/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templat
es/Classes/Class.java to edit this template
 */

package ferreteriapoo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Vendedores extends Persona{
    private long codigoVendedor;
    public int comisionVendedor;
    public  String sucursal;
    
    
    public Vendedores(){
        
    }
    
    
    
    public Vendedores(String nombre, int identificacion , String direccion, long codigoVendedor, int comisionVendedor){
        
        
        super (nombre, identificacion,direccion);
        this.codigoVendedor = codigoVendedor;
        this.comisionVendedor = comisionVendedor;
        this.sucursal = sucursal;
        
    }
    
    private long getCodigoVendedor(long codigoVendedor){
        return this.codigoVendedor;
        
                
    }
    
    public void setCodigoVendedor(long codigoVendedor){
        this.codigoVendedor = codigoVendedor;
        
    }

    long getCodigoVendedor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

    

}
