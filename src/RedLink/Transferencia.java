/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RedLink;

/**
 *
 * @author Nico
 */
public class Transferencia extends Transaccion{
    private String nomEmisor;
    private long dniEmisor;
    private String nomReceptor;
    private String Mensaje;

    public String getNomEmisor() {
        return nomEmisor;
    }

    public void setNomEmisor(String nomEmisor) {
        this.nomEmisor = nomEmisor;
    }

    public long getDniEmisor() {
        return dniEmisor;
    }

    public void setDniEmisor(long dniEmisor) {
        this.dniEmisor = dniEmisor;
    }

    public String getNomReceptor() {
        return nomReceptor;
    }

    public void setNomReceptor(String nomReceptor) {
        this.nomReceptor = nomReceptor;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
    
    
}
