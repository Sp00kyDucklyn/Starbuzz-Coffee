/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author Carmen Hernández Echeverría 240210
 * Esta clase hereda de la clase
 * Bebida y representa una bebida específica llamada "Decaf".
 */
public class Decaf extends Bebida{
    
      /**
     * Constructor que establece la descripción como "Decaf" y el costo
     * como 30.00.
     */
    public Decaf(){
        super.descripcion ="Decaf";
        super.costo = 30.00;
    }
}
