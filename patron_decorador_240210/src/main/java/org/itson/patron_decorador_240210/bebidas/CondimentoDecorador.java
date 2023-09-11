/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author Carmen Hernández Echeverría 240210 Esta clase es una extensión de la
 * clase Bebida y actúa como una base para decoradores de condimentos que
 * agregan ingredientes o características a una bebida base.
 */
public class CondimentoDecorador extends Bebida {

    /**
     * Atributo que instancia a la bebida que sera decorada.
     */
    public Bebida bebida;

    /**
     * Obtiene la descripción decorada.
     *
     * @return regresa una descripción decorada.
     */
    @Override
    public String getDescription() {
        return descripcion;
    }

    /**
     * Obtiene el costo decorado.
     *
     * @return regresa una descripción decorada.
     */
    @Override
    public double costo() {
        return costo;
    }

}
