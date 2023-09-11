/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author Carmen Hernández Echeverría 240210
 *
 * Esta interfaz implementa los métodos que deben ser implementados por
 * cualquier clase que represente una bebida. Utiliza el patrón de diseño
 * decorador que permite la composición de bebidas diferentes con diferentes
 * condimentos agregados.
 */
public interface IBebida {

    /**
     * Método que obtiene la descripción de la bebida.
     * @return regresa una descripción
     */
    public String getDescription();

    /**
     * Método que obtiene el costo de la bebida.
     * @return regresa el costo
     */
    public double costo();
}
