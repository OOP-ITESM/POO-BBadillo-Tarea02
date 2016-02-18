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
public class Aire extends Congelados{
    private final int frecuencia; // número de veces por minuto que se lanzarán ráfagas de aire
    
    public Aire(String caducidad, int lote, double precio, double stock, double temperatura, int frecuencia) {
        super(caducidad, lote, precio, stock, temperatura);
        this.frecuencia=frecuencia;
    }
    public int getFrecuencia(){
        return this.frecuencia;
    }
    
    
}
