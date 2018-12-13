/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitoVerificador;

/**
 *
 * @author Nico
 */
public class DNI {
    Long DNI;
    Character letra;
    
    public DNI(){
        this.DNI = Long.valueOf(0);
        this.letra = ' ';
    }
    
    public DNI (Long DNI){
        this.DNI = DNI;
        this.letra = this.calculaLetra(DNI);
    }
    
    public Long getDNI(){
        return this.DNI;
        
    }
    
    public Character getletra(){
        return this.letra;
    }
    
    public void setDNI (Long DNI){
        this.DNI = DNI;
    }
    
    public void setLetra (Character letra){
        this.letra = letra;
    }
    
    public void leer(Long DNI){
        this.DNI = DNI;
        this.letra = this.calculaLetra(DNI);
        
    }
    
    private Character calculaLetra(Long DNI){
        Character[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Integer resto = Math.toIntExact(DNI%23);
        
        return letras[resto];
        

        
    }
    
    public void mostrarNif (){
        System.out.println(this.DNI+"-"+this.letra);
    }
    
}
