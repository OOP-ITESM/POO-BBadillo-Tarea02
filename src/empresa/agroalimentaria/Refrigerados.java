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
public class Refrigerados extends productos {
    protected double humedad; // porcentaje de humedad que deben tener los alimentos para que se conserven mejor

    public Refrigerados(String caducidad, int lote, double precio, double stock, double humedad) {
        super(caducidad, lote, precio, stock);
        this.humedad=humedad;
    }
    public double getHumedad(){
        return this.humedad;
    }
    public void actualizarHumedad(double humedad){
        this.humedad= humedad;     
    }
   
}
