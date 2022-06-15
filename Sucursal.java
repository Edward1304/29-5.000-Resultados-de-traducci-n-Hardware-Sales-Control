/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ferreteriapoo;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Sucursal {
    
    public String  nombreSucursal;
    private long nitt;
    public long direccion;
 ;
    
    
    public Sucursal(){
        super ();
    }

    Sucursal(String nombreSucursal, long nitt, long direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
    
    public long getNitt(){
        return this.nitt;
    }
    
    public void SetNitt(){
        this.nitt = nitt;
       
    }
    
    
    
    @Override
    public String toString(){
        return "Nombre :"+this.nombreSucursal+"Nit"+this.nitt+"direccion"+this.direccion;
    }
    
    
    
  
  

    
    
    

}
