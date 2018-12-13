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
public class Cafetera {
    Integer capacidadMaxima;
    Integer capacidadActual;

    public Cafetera() {
        this.capacidadActual = 0;
        this.capacidadMaxima = 1000;
    }
    
        public Cafetera(Integer capMaxima) {
            this.capacidadMaxima = capMaxima;
            this.capacidadActual = this.capacidadMaxima;
        
    }
        
        public Cafetera(Integer capMaxima, Integer capActual){
            this.capacidadMaxima = capMaxima;
            if (capActual > this.capacidadMaxima){
                this.capacidadActual = this.capacidadMaxima;
            } else {
                this.capacidadActual = capActual;
            }
        }
        
        public Integer getCapacidadMaxima(){
            
            return this.capacidadMaxima;
        }
        
        public Integer getCapacidadActual(){
            return this.capacidadActual;
        }
        
        public void setCapacidadActual(Integer capNueva){
            Integer capMaxima = this.getCapacidadMaxima();
            if (capMaxima >= capNueva){
                this.capacidadActual = capNueva;
            } else {
                System.out.println("La capacidad Actual no puede ser mayor a la máxima que es "+ capMaxima);
            }
        }
        
        public void llenar (){
            Integer capMaxima = this.getCapacidadMaxima();
            this.setCapacidadActual(capMaxima);
            System.out.println("La cafetera ha sido llenada hasta los "+ capMaxima);
        }
                
        public void servirTaza (Integer taza){
            Integer capActual = this.getCapacidadActual();
            Integer tazaInc = 0;
            if (capActual >= taza){
                this.setCapacidadActual((capActual-taza));
                System.out.println("La taza de "+ taza + " ha sido llenada y la capacidad actual de la cafetera es de "+this.getCapacidadActual());
            } else {
                tazaInc = this.getCapacidadActual();
                this.setCapacidadActual(0);
                System.out.println("La taza ha sido llenado con " + tazaInc + " ml dado que la capacidad de la cafetera no era la necesaria");
            }
            
        }
        
        public void vaciarCafetera(){
            this.setCapacidadActual(0);
            System.out.println("La cafetera ha sido vaciada");
        }
        
        public void agregarCafe(Integer agregar){
            Integer capActual = this.getCapacidadActual();
            Integer capMax = this.getCapacidadMaxima();
            
                    if ((capActual + agregar) <= capMax){
                        this.setCapacidadActual((capActual+agregar));
                        System.out.println("La nueva capacidad actual es : "+this.getCapacidadActual());
                    } else {
                        this.setCapacidadActual(capMax);
                        System.out.println("La capacidad máxima ha sido excedidada, se ha llenado hasta el límite máximo de la máquina");
                    }
        }
        
}
