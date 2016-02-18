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
public class Congelados extends productos{
    //atributos
    protected double temperatura; //temperatura en grados

    public Congelados(String caducidad, int lote, double precio, double stock, double temperatura) {
        super(caducidad, lote, precio, stock);
        this.temperatura=temperatura;
    }
    public double getTemperatura(){
        return this.temperatura;
    }
    public void actualizarTemperatura(double temperatura){
        this.temperatura= temperatura;     
    }
}
