/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talle.poo;

/**
 *
 * @author anuar parejo, anderson ochoa
 */
public class moto extends vehiculo{
    
    public moto(String marca, String placa, int numserie, float kilometraje, float combustible) {
        super(marca, placa, numserie, kilometraje, combustible);
    }
                                                                                                                                                                                                                                                                                                                                                                                                  
     public String mostrar(){
        String resultado ="";
        resultado = mostrarInfo();
        return resultado;
    }
}
