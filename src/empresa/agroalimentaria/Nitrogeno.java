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
public class Nitrogeno extends Congelados{
    protected double tempmin; // temperatura mínima
    
    public Nitrogeno(String caducidad, int lote, double precio, double stock, double temperatura, double tempmin) {
        super(caducidad, lote, precio, stock, temperatura);
        this.tempmin=tempmin;
        
    }
    public double getTempmin(){
return this.tempmin;
}
    public void actualizarTempmin(double tempmin){
        this.tempmin= tempmin;     
    }
    
}
