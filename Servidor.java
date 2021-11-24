/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.EjPojosN_1;

import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ODBServer;

/**
 *
 * @author Vespertino
 */
public class Servidor {
    //SERVIDOR
    public static void main(String[] args) {
        //CONEXIONES
        ODBServer server = ODBFactory.openServer(8001);
        server.addBase("base", "Ventas.db");
        server.startServer(true);
        System.out.println("Servidor en funcionamiento");
    }
    
}
