package org.itson.patron_decorador_240210.bebidas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Carmen Hernández Echeverría 240210
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Bebida bebida = new Expresso();
        System.out.println(bebida.getDescription() + " $" + bebida.costo());

        Bebida bebida2 = new DarkRoast();
        bebida2 = new CremaBatida(bebida2);
        System.out.println(bebida2.getDescription() + " $" + bebida2.costo());
        
        Bebida bebida3 = new Decaf();
        bebida3 = new CremaBatida(bebida3);
        bebida3 = new Leche(bebida3);
        bebida3 = new Chocolate(bebida3);
        System.out.println(bebida3.getDescription() + " $" + bebida3.costo());
        
        Bebida bebida4 = new Decaf();
        bebida4 = new CremaBatida(bebida4);
        bebida4 = new Leche(bebida4);
        bebida4 = new Chocolate(bebida4);
        bebida4 = new Soya(bebida4);
        System.out.println(bebida4.getDescription() + " $" + bebida4.costo());
    }
}
