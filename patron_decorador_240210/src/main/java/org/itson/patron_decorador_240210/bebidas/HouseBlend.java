/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author Carmen Hernández Echeverría 240210 
 * Esta clase hereda de la clase
 * Bebida y representa una bebida específica llamada "House Blend".
 */
public class HouseBlend extends Bebida {

    /**
     * Constructor que establece la descripción como "House Blend" y el costo
     * como 38.00.
     */
    public HouseBlend() {
        super.descripcion = "House Blend";
        super.costo = 38.00;
    }

}
