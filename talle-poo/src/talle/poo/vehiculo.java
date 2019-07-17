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
public class vehiculo {
    protected String marca, placa ; 
    protected int numserie;
    protected  float kilometraje, combustible;
 
    public vehiculo(String marca, String placa, int numserie, float kilometraje, float combustible) {
        this.marca = marca;
        this.placa = placa;
        this.numserie = numserie;
        this.kilometraje = kilometraje;
        this.combustible = combustible;
    }public String mostrarInfo(){
        String resultado = "";
        resultado = marca+"\t"+placa+"\t"+Integer.toString(numserie)+"\t"+Float.toString(kilometraje)+"\t"+Float.toString(combustible);
        return resultado;
    }

     public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }
    
    }
 
