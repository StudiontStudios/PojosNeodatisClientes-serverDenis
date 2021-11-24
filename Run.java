/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.EjPojosN_1;

import com.github.javafaker.Faker;
import java.util.HashSet;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

/**
 *
 * @author Vespertino
 */
public class Run {

    //INTRODUCIR DATOS
    public static void main(String[] args) {
        ODB odb = ODBFactory.open("Ventas.DB");	// Abrir BD
        Faker f = new Faker();
        HashSet<Ventas> vent = new HashSet<Ventas>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                Cliente c = new Cliente(j, f.name().firstName(), f.address().cityName());
                Ventas v = new Ventas(j, c, f.number().randomDigit(), f.date().birthday().toString());
                vent.add(v);
            }
            Articulo a = new Articulo(i, f.animal().name(), f.number().numberBetween(0, 50), f.number().numberBetween(2, 70), vent);
            odb.store(a);
            vent.clear();
        }
        odb.close(); // Cerrar BD
        System.out.println("** Creada la Base de Datos: Ventas.DB");

    }

}
