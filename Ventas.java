/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.EjPojosN_1;

import java.io.Serializable;

/**
 *
 * @author Vespertino
 */
public class Ventas implements Serializable{
    private int codventa;
    private Cliente numcli;
    private int univen;
    private String fecha;

    public Ventas(){}
    
    public Ventas(int codventa, Cliente numcli, int univen, String fecha) {
        this.codventa = codventa;
        this.numcli = numcli;
        this.univen = univen;
        this.fecha = fecha;
    }

    public int getCodventa() {
        return codventa;
    }

    public Cliente getNumcli() {
        return numcli;
    }

    public int getUniven() {
        return univen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setCodventa(int codventa) {
        this.codventa = codventa;
    }

    public void setNumcli(Cliente numcli) {
        this.numcli = numcli;
    }

    public void setUniven(int univen) {
        this.univen = univen;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ventas{" + "codventa=" + codventa + ", numcli=" + numcli + ", univen=" + univen + ", fecha=" + fecha + '}';
    }
    
    
}
