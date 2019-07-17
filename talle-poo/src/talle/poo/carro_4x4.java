/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talle.poo;

/**
 *
 * @author CBN  anuar parejo, anderson ochoa
 */
public class carro_4x4 extends vehiculo {
    protected String motor,numasientos;

    public carro_4x4(String marca, String placa, int numserie, float kilometraje, float combustible, String motor, String numasientos) {
        super(marca, placa, numserie, kilometraje, combustible);
        this.motor = motor;
        this.numasientos = numasientos;
    }
     public String mostrar(){
        String resultado ="";
        resultado = mostrarInfo()+"\t"+motor+"\t"+numasientos;
        return resultado;}
    
}
