/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */

// creo una clase llamada factura donde guardo los datos del cliente 
public class factura {
    public String nameClien;
    public String cedClien;
    public String codiFact;
    public String montFct;
    public String mes; 
    public String elec;
    public String automot;
    public String construct;
   
//solicite los datos de la factura del cliente    
    
    public factura (String nombreCliente, String cadClient, String codiFact, String montFct){
        this.nameClien = nameClien;
        this.cedClien = cedClien;
        this.codiFact = codiFact;
        this.montFct = montFct;
        this.mes = mes;
        this.elec = elec;
        this.automot = automot;
        this.construct = construct;
    }
    
 //creo un menu donde tira toda la informacion de la factura  
     public void info(){
        System.out.println("el nombre del cliente es "+ nameClien);
        System.out.println("la cedula del cliente es "+cedClien);
        System.out.println("el codigo de la factura es"+ codiFact);
        System.out.println("el monto de la factura es de"+ montFct);
        System.out.println("el mes de la factura es"+mes);
        System.out.println("cuantos electrodomesticos llevas"+elec);
        System.out.println("cuantos productos de automotris llevas"+ automot);
        System.out.println("cuantos productos de construccion llevas"+construct);
        
         
         
    } 

     
       
          
                 
                
        
 
    
}
