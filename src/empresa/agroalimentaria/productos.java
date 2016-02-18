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
public class productos {
    //atributos
    protected String caducidad; //fecha de caducidad de los productos
    protected int lote; //número de lote
    protected double precio; //precio por kilo
    protected double stock; // cantidad de producto que hay en kilos
    protected String stockk;
    /**
     * Constructor
     * @param caducidad Caducidad del producto 
     * @param lote lote del producto
     * @param precio precio del producto
     * @param stock stock en kilos del producto
     */
    public productos ( String caducidad, int lote, double precio, double stock){
        this.caducidad=caducidad;
        this.lote=lote;
        this.precio=precio;
        this.stock=stock;
    
    }
    /**
     * Método que devuelve la una cadena de texto con la fecha de caducidad
     * @return 
     */
    public String getCaducidad(){
            return this.caducidad;
    }
    /**
     * Método que devuelve un valor entero del número de lote de los productos
     * @return 
     */
    public int getLote(){
            return this.lote;
    }
    /**
     * Método que devuelve el precio del producto
     * @return 
     */
    public double getPrecio(){
            return this.precio;
    }
    /**
     * Método que devuelve el stock en kilos de los productos
     * @return 
     */
    public double getStock(){
            return this.stock;
    }
    public void actualizarCaducidad(String caducidad){
        this.caducidad=caducidad;
        
    }
    public void actualizarLote(int lote){
        this.lote=lote;
        
    }
    public void actualizarPrecio(double precio){
        this.precio=precio;
        
    }
    public void actualizarStock(double stock){
        this.stock=stock;
        
    }
    public String verificarStock(){
      
        if (stock==0){
        
          stockk= "Ya no hay existancia";
    } 
        else{
             stockk= Double.toString(stock);
        }
 return stockk;
    } 
}
