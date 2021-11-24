/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.EjPojosN_1;

import java.util.HashSet;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ODBServer;
import org.neodatis.odb.Objects;

/**
 *
 * @author Vespertino
 */
public class Cliente_Serv {

    //CLIENTE
    public static void main(String[] args) {
        //HACEMOS LA CONEXION
        ODB odb = ODBFactory.openClient("localhost", 8001, "base");

        //DEPENDIENDO DE LO QUE QUERRAMOS RECORRER USAMOS UNO U OTRO
        Objects<Articulo> art = odb.getObjects(Articulo.class); 
        Objects<Ventas> ven = odb.getObjects(Ventas.class);
        Objects<Cliente> cli = odb.getObjects(Cliente.class);
        
        //RECORREMOS Y MOSTRAMOS DATOS DE ARTICULO
        while (art.hasNext()) { //con el .hasNext() recorremos la coleccion con los datos
            Articulo articu = (Articulo) art.next();
            System.out.println(articu.getCodarti() + articu.getDenom()+articu.getCompras().toString());
        }
        odb.close(); // Cerrar BD

    }

}
