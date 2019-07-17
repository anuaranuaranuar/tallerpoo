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
public class furgoneta extends vehiculo{
    protected double carga,altura;

    public furgoneta(String marca, String placa, int numserie, float kilometraje, float combustible, double carga, double altura) {
        super(marca, placa, numserie, kilometraje, combustible);
        this.carga = carga;
        this.altura = altura;
    }
    public String mostrar(){
        String resultado ="";
        resultado = mostrarInfo()+"\t"+carga+"\t"+altura;
        return resultado;
    
}}
