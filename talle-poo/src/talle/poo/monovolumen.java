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
public class monovolumen extends vehiculo{
    protected int numpuerta,numasiento, motor;
    protected boolean latpuerta;
    protected double carga;

    public monovolumen(String marca, String placa, int numserie, float kilometraje, float combustible, int numpuerta, int numasiento, int motor, boolean latpuerta, double carga) {
        super(marca, placa, numserie, kilometraje, combustible);
        this.numpuerta = numpuerta;
        this.numasiento = numasiento;
        this.motor = motor;
        this.latpuerta = latpuerta;
        this.carga = carga;
    }
     public String mostrar(){
        String resultado ="";
        String estado="";
        if(this.latpuerta){
            estado = "Activo";
        }else{
            estado = "Inactivo";
        }
        resultado = mostrarInfo()+"\t"+numpuerta+"\t"+numasiento+"\t"+motor+"\t"+estado+"\t"+carga;
        return resultado;
    }


}
