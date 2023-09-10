/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.patron_decorador_240210.bebidas;

/**
 *
 * @author hoshi
 */
public class Bebida implements IBebida{
    
    private IBebida Ibebida;
    String descripcion = "Sabra que bebida sea";
    double costo;
    
    public Bebida() {
    }
    
    public Bebida(IBebida Ibebida){
        this.Ibebida = Ibebida;
    }
    

    @Override
    public String getDescription() {
       return descripcion;
    }

    @Override
    public double costo() {
        return costo;
    }
    
    
    
//    private String descripcion;
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//    
//    public float getCost(float costo){
//        return costo;
//    }
}
