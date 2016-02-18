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
public class Agua extends Congelados{
    private final double litros;
    public Agua(String caducidad, int lote, double precio, double stock, double temperatura, double litros) {
        super(caducidad, lote, precio, stock, temperatura);
        this.litros=litros;
    }
    
    public double getLitros(){
        return this.litros;
    }
}
