/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author Carmen Hernández Echeverría 240210 
 * Esta clase hereda de la clase
 * Bebida y representa una bebida específica llamada "Dark Roast".
 */
public class DarkRoast extends Bebida {

    /**
     * Constructor que establece la descripción como "Dark Roast" y el costo
     * como 45.00.
     */
    public DarkRoast() {
        super.descripcion = "Dark Roast";
        super.costo = 45.00;
    }
}
