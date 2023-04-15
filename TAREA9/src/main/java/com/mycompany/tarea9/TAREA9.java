/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea9;

/**
 *
 * @author PEREIRA
 */
public class TAREA9 {

    /**
     *
     */
    public final class Datos extends Datos  {
        
       private double precio;
       private double codig;
       private double cantidad
               
       public Datos() { 
    }
     public Datos(double _codig, double _precio, double _cantidad)
       {
    this.setCodigo(_codig); 
       } 
    public void setCodigo(double _codig){
           
    this.codig = _codig; } 
   }
   public double getCodigo(){
       return this.codig; 
   } 
   public void setPrecio(double _precio){
       this.precio = _precio;
       
   } 
   public double getPrecio(){
       return this.precio;
   } 
   public void setCantidad(double _cantidad){
       this.cantidad = _cantidad; 
   } 
 
}
