/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author Carmen Hernández Echeverría 240210 Clase que implementa la interfaz
 * bebida, y regresenta cualquier bebida, que puede ser decorada con
 * condimentos.
 */
public class Bebida implements IBebida {

    /**
     * Atributo que instancia a la interfaz IBebida.
     */
    private IBebida Ibebida;
    /**
     * Atributo descripción que almacena la descripción de la bebida.
     */
    String descripcion = "Sabra que bebida sea";
    /**
     * Atributo costo que almacena el costo de la bebida.
     */
    double costo;

    /**
     * Constructor por defecto de la clase.
     */
    public Bebida() {
    }

    /**
     * Constructor que inicializa la instancia de Ibebida.
     *
     * @param Ibebida la bebida decorada.
     */
    public Bebida(IBebida Ibebida) {
        this.Ibebida = Ibebida;
    }

    /**
     * Obtiene la descripción de la bebida decorada.
     *
     * @return regresa la descripción final de la bebida.
     */
    @Override
    public String getDescription() {
        return descripcion;
    }

    /**
     * Obtiene el costo de la bebida decorada.
     *
     * @return regresa un costo final de la bebida.
     */
    @Override
    public double costo() {
        return costo;
    }

}
