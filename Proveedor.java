 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ferreteriapoo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Proveedor {
    
    public  String proveedor;
    private int comision;
    private int   codigoProveedor;
    
    
    
    
    public Proveedor() {
    }
    
    
    
    public Proveedor (String proveedor ,int comision, int codigoProveedro){
        this.proveedor = proveedor;
        this. comision = comision;
        this. codigoProveedor = codigoProveedor;
    }
    
    @Override
    public String toString(){
        return "["+this.comision+", "+this.codigoProveedor+"]";
    }

    long getCodigoProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    

}
