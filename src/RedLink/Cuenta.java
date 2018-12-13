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
public class Cuenta extends Transaccion {

   private String propietario;
   private long dniPropietario;
   private String direccion;
   private long telefono;

   public Cuenta(String propie, double monto, long dni, String direc, long tel) {
       this.propietario = propie;
       this.mont = monto;
       this.dniPropietario = dni;
       this.telefono = tel;
       this.direccion = direc;
   }

   public String getPropietario() {
       return propietario;
   }

   public void setPropietario(String propietario) {
       this.propietario = propietario;
   }

   public long getDniPropietario() {
       return dniPropietario;
   }

   public void setDniPropietario(long dniPropietario) {
       this.dniPropietario = dniPropietario;
   }

   public String getDireccion() {
       return direccion;
   }

   public void setDireccion(String direccion) {
       this.direccion = direccion;
   }

   public long getTelefono() {
       return telefono;
   }

   public void setTelefono(long telefono) {
       this.telefono = telefono;
   }

   public double consultarSald() {
       return getMonto();
   }

   public double getMonto() {
       return this.mont;
   }

   public void actualirSald(double valor) {
       double montoParcial;
       double montoActualizado;
       montoParcial = consultarSald();
       montoActualizado = montoParcial + valor;
       this.setMonto(montoActualizado);
   }

   public void setMonto(double valor) {
       this.mont = valor;
   }

}
