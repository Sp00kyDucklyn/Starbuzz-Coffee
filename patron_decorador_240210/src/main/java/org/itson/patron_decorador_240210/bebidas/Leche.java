/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author Carmen Hernández Echeverría 240210
 * CondimentoDecorador y representa un condimento específico, en este caso,
 * Leche, que puede ser agregado a una bebida base.
 */
public class Leche extends CondimentoDecorador{
    
    /**
     * Constructor que toma una bebida base como parámetro y agrega a esta
     * bebida el condimento de Leche
     *
     * @param bebida
     */
    public Leche(Bebida bebida){
        this.bebida = bebida;
    }
    
    /**
     * Obtiene la descripción de la bebida decorada.
     *
     * @return regresa una descripción decorada.
     */
    @Override
    public String getDescription(){
        return bebida.getDescription()+", Leche";
    }
    
    /**
     * Obtiene el costo de la bebida base más el condimento.
     *
     * @return regresa el costo decorado.
     */
    public double costo(){
        double aumento = bebida.costo()+5.00;
        return aumento;
    }
}
