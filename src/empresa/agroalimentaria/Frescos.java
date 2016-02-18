/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.agroalimentaria;

/**
 *
 * @author ASUS
 */
public class Frescos extends productos{
    //atributo
    protected String empaquetado; //que puede ser en madera o bolsas de fibra para su mejor conservación
    protected int dias; // días que puede estar al aire libre sin echarse a perder
    /**
     * 
     * @param caducidad
     * @param lote
     * @param precio
     * @param stock
     * @param empaquetado 
     * @param dias 
     */
    public Frescos(String caducidad, int lote, double precio, double stock, String empaquetado, int dias) {
        super(caducidad, lote, precio, stock);
        this.empaquetado=empaquetado;
        this.dias= dias;
    }
    /**
     * devuelve el empaquetado del producto
     * @return 
     */
    public String getEmpaquetado(){
        return this.empaquetado;
    }
    public int getDias(){
        return this.dias;
    }
    public void actualizarEmpaquetado(String empaquetado){
        this.empaquetado= empaquetado;     
    }
    
    public void actualizarDias(int dias){
        this.dias= dias;     
    }
    
}
