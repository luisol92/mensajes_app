/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.losm.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class Conection {
    
    public Connection get_conection (){
        Connection  conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            if(conection != null){
                System.out.println("Conexión Exitosa.....");
            }
        }catch(SQLException e){
            System.out.println("Hubo un error.....");
            System.out.println(e);
        }
        return conection;
    }
    
}
