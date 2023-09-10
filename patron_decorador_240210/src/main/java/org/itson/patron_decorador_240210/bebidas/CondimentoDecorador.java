/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author hoshi
 */
public class CondimentoDecorador extends Bebida{
    
    public Bebida bebida;
	 @Override
    public String getDescription() {
       return descripcion;
    }

    @Override
    public double costo() {
        return costo;
    }

}
