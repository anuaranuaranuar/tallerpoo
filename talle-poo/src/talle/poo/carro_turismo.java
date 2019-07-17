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
public class carro_turismo extends vehiculo{
    protected String tipo, motor;
    protected int numpuertas ;

    public carro_turismo(String marca, String placa, int numserie, float kilometraje, float combustible, String tipo, String motor, int numpuertas) {
        super(marca, placa, numserie, kilometraje, combustible);
        this.tipo = tipo;
        this.motor = motor;
        this.numpuertas = numpuertas;
    }
     public String mostrar(){
        String resultado ="";
        resultado = mostrarInfo()+"\t"+tipo+"\t"+motor+"\t"+numpuertas;
        return resultado;
    
    
}}
