/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.losm.mensajes_app;
import java.sql.Connection;
/**
 *
 * @author usuario
 */
public class Mensajes_app {

    public static void main(String[] args) {
        Conection con = new Conection();
        try(Connection cnx = con.get_conection()){
           System.out.println("Conectado.........");
        } catch (Exception e) {
            System.out.println("Error al intentar conectar.....");
            System.out.println(e);
        }
        
    }
}
