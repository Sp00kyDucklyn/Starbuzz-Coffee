/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author Carmen Hernández Echeverría 240210
 * Esta clase hereda de la clase
 * Bebida y representa una bebida específica llamada "Expresso".
 */
public class Expresso extends Bebida{
    
     /**
     * Constructor que establece la descripción como "Expresso" y el costo
     * como 36.00.
     */
    public Expresso(){
        super.descripcion ="Expresso";
        super.costo = 36.00;
    }
    
    
}
