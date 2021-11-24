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
public class Cliente implements Serializable{
    private int numcli;
    private String nombre;
    private String pobla;
    
    public Cliente(){}

    public Cliente(int numcli, String nombre, String pobla) {
        this.numcli = numcli;
        this.nombre = nombre;
        this.pobla = pobla;
    }

    public int getNumcli() {
        return numcli;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPobla() {
        return pobla;
    }

    public void setNumcli(int numcli) {
        this.numcli = numcli;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPobla(String pobla) {
        this.pobla = pobla;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numcli=" + numcli + ", nombre=" + nombre + ", pobla=" + pobla + '}';
    }
    
    
    
}
