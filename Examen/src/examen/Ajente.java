package examen;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aulas Heredia
 */

//creo una clase llamada ajente donde agrego todo lo que solicita de el
public class Ajente {
 class AjemnteV{
     private String name;
     private String ced; 
     private String codi;
     private String sucursal;
     public String car;
     
     public AjemnteV (String name, String ced, String codi, String sucursal, String car  ){
        this.name = name;
        this.ced = ced;
        this.codi = codi;
        this.sucursal = sucursal;
        this.car = car;
     }
// creo un meno en el que tire los datos que me dieron de ello 
    public void info(){
        System.out.println("el nombre del ajente es "+ name);
        System.out.println("la cedula del ajente es "+ced);
        System.out.println("el codigo del ajente es"+ codi);
        System.out.println("el sucursal del ajente es"+ sucursal);
        System.out.println("el ajente de ventas posee carro "+car);
    }
 }
}
