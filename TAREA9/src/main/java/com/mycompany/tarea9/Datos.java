/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea9;

/**
 *
 * @author PEREIRA
 */
public class Datos {
    private String nombre; 
    public Datos(){    
}
  public Datos (String _nombre){
   this.setNombre(_nombre); 
 }
 public void setNombre(String _nombre)
{ 
this.nombre = _nombre;
} 
} 
public String getNombre(){ 

    return this.nombre; 
}