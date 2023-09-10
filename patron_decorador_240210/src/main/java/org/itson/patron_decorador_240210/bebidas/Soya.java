/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author Carmen Hernández Echeverría 240210
 */
public class Soya extends CondimentoDecorador{
    
    public Soya(Bebida bebida){
        this.bebida = bebida;
    }
    
    @Override
    public String getDescription(){
        return bebida.getDescription()+", Soya";
    }
    
    public double costo(){
        double aumento = bebida.costo()+10.00;
        return aumento;
    }
    
    
}
