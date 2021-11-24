/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.EjPojosN_1;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author Vespertino
 */
public class Articulo implements Serializable {
    private int codarti;
    private String denom;
    private int stock;
    private float pvp;
    private Set<Ventas> Compras;
    
    public Articulo(){}

    public Articulo(int codarti, String denom, int stock, float pvp, Set<Ventas> Compras) {
        this.codarti = codarti;
        this.denom = denom;
        this.stock = stock;
        this.pvp = pvp;
        this.Compras = Compras;
    }

    public int getCodarti() {
        return codarti;
    }

    public String getDenom() {
        return denom;
    }

    public int getStock() {
        return stock;
    }

    public float getPvp() {
        return pvp;
    }

    public Set<Ventas> getCompras() {
        return Compras;
    }

    public void setCodarti(int codarti) {
        this.codarti = codarti;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public void setCompras(Set<Ventas> Compras) {
        this.Compras = Compras;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codarti=" + codarti + ", denom=" + denom + ", stock=" + stock + ", pvp=" + pvp + ", Compras=" + Compras + '}';
    }
    
    
    
}
