/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talle.poo;

/**
 *
 * @author  anuar parejo, anderson ochoa
 */
public class carro_deportivo extends vehiculo {
    protected int caballo,numpuerta,numasiento;
    protected boolean turbo;

    public carro_deportivo(String marca, String placa, int numserie, float kilometraje, float combustible, int caballo, int numpuerta, int numasiento, boolean turbo) {
        super(marca, placa, numserie, kilometraje, combustible);
        this.caballo = caballo;
        this.numpuerta = numpuerta;
        this.numasiento = numasiento;
        this.turbo = turbo;
    }

    public boolean isTurbo() {
        return turbo;
    }
        public String mostrar(){
        String resultado= "";    
        String estado ="";
        if(this.turbo){
            estado = "Inactivo";
        }else{
            estado = "Activo";
        }
        resultado = mostrarInfo()+"\t"+caballo+"\t"+numpuerta+"\t"+numasiento+"\t"+estado;
        return resultado;}
    
}
