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
public class EmpresaAgroalimentaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frescos lechugas = new Frescos("13 de Abril", 12345, 5.56, 50.3, "Costales de fibra", 15);
        Refrigerados mangos = new Refrigerados ("4 de Mayo", 67890, 15.00, 60.23, 89.2);
        Nitrogeno calabaza = new Nitrogeno ("13 de Mayo", 98765, 13.80, 30.05, -16, -13);
        Aire zanahoria = new Aire ("04 de Abril", 456113, 15.03, 41.03, -16, 6);
        Agua acelgas = new Agua ("18 de Marzo", 854712, 4.20, 60.32, -17, 30.5);
        
        
        System.out.println("Esta es la información de las lechigas frescas");
        System.out.println("Caducidad: "+lechugas.getCaducidad());
        System.out.println("Lote: "+lechugas.getLote());
        System.out.println("Precio:"+lechugas.getPrecio());
        System.out.println("Stock:"+lechugas.getStock()+"kilos");
        System.out.println("Empaquetado:"+lechugas.getEmpaquetado());
        System.out.println("Días que puede estar al aire libre:"+lechugas.getDias());
        System.out.println();
        System.out.println("Esta es la información de los mangos");
        System.out.println("Caducidad: "+mangos.getCaducidad());
        System.out.println("Lote: "+mangos.getLote());
        System.out.println("Precio:"+mangos.getPrecio());
        System.out.println("Stock:"+mangos.getStock()+"kilos");
        System.out.println("Nivel de Humedad:"+mangos.getHumedad());
        System.out.println();
        System.out.println("Esta es la información de las calabazas congeladas por nitrógeno");
        System.out.println("Caducidad: "+calabaza.getCaducidad());
        System.out.println("Lote: "+calabaza.getLote());
        System.out.println("Precio:"+calabaza.getPrecio());
        System.out.println("Stock:"+calabaza.getStock()+"kilos");
        System.out.println("Temperatura de congelación:"+calabaza.getTemperatura());
        System.out.println("Temperatura de congelación mínima:"+calabaza.getTempmin());
        System.out.println();
          System.out.println("Esta es la información de las zanahorias congeladas por aire");
        System.out.println("Caducidad: "+zanahoria.getCaducidad());
        System.out.println("Lote: "+zanahoria.getLote());
        System.out.println("Precio:"+zanahoria.getPrecio());
        System.out.println("Stock:"+zanahoria.getStock()+"kilos");
        System.out.println("Temperatura de congelación:"+zanahoria.getTemperatura());
        System.out.println("Frecuencia de ventilación:"+zanahoria.getFrecuencia());
        System.out.println();
        System.out.println("Esta es la información de las Acelgas congeladas por agua");
        System.out.println("Caducidad: "+acelgas.getCaducidad());
        System.out.println("Lote: "+acelgas.getLote());
        System.out.println("Precio:"+acelgas.getPrecio());
        System.out.println("Stock:"+acelgas.getStock()+"kilos");
        System.out.println("Temperatura de congelación:"+acelgas.getTemperatura());
        System.out.println("Litros de agua:"+acelgas.getLitros());
        System.out.println();
       System.out.println("Esta es la información actualizada");
       acelgas.actualizarCaducidad("8 de Marzo");
        System.out.println("Caducidad Actualizada de las acelgas: "+acelgas.getCaducidad());
        mangos.actualizarLote(789320);
        System.out.println("Lote actualizado de los mangos: "+mangos.getLote());
        zanahoria.actualizarPrecio(11);
        System.out.println("Precio actualizado de las zanahorias:"+zanahoria.getPrecio());
         calabaza.actualizarStock(51.84);
        System.out.println("Stock actualizado de la calabaza:"+calabaza.getStock()+"kilos");
        System.out.println("Actualizamos el Stock de calabazas a 0");
          calabaza.actualizarStock(0);
        System.out.println("Verificar stock de la calabaza : "+ calabaza.verificarStock());
        System.out.println("Actualizamos el Stock de la calabaza a 40");
        calabaza.actualizarStock(40);
        System.out.println("Verificar stock de la calabaza: "+ calabaza.verificarStock());
       
       
    }
    
}
