/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nespresso;

/**
 *
 * @author Nico
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera c = new Cafetera(2000, 1500);
        c.llenar();
        c.servirTaza(300);
        c.servirTaza(1000);
        c.vaciarCafetera();
        c.agregarCafe(500);
        c.agregarCafe(500);
        c.agregarCafe(200);
        
    }
    
}
