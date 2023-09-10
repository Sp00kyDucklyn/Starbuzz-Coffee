/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author hoshi
 */
public class CremaBatida extends CondimentoDecorador{
    
    public CremaBatida(Bebida bebida){
        this.bebida = bebida;
    }
    
    @Override
    public String getDescription(){
        return bebida.getDescription()+", Crema Batida";
    }
    
    public double costo(){
        double aumento = bebida.costo()+15.00;
        return aumento;
    }
}
