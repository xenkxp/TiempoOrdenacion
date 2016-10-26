/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectionBD;

import java.sql.*;
import java.sql.DriverManager;
import java.util.*;

/**
 *
 * @author E008
 */
public class UConection {
    private static Connection con=null;
    public static Connection getConnection()
    {
        try
        {
            if( con == null )
            {
            // con esto determinamos cuando fi nalize el programa
            Runtime.getRuntime();
            ResourceBundle rb=ResourceBundle.getBundle("properties\\jdbc");
            String driver=rb.getString("driver");
            String url=rb.getString("url");
            String pwd=rb.getString("pwd");
            String usr=rb.getString("usr");
            Class.forName(driver);
            con = DriverManager.getConnection(url,usr,pwd);
        }
        return con;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            throw new RuntimeException("Error al crear la conexion",ex);
        }
    }
    public static void closeConectiion(){
        try{
            
        }finally{
            try {
                if(con != null)
                {
                    con.close();
                    con = null;
                }
            }catch(SQLException sqle){
                System.out.println("Imposible cerrar la conexión con la BD: "+sqle);
            }
        }
    }
    static class MiShDwnHook extends Thread
    {
    // justo antes de fi nalizar el programa la JVM invocara
    // a este metodo donde podemos cerrar la conexion
        @Override
        public void run()
        {
            try
            {
                Connection con = UConection.getConnection();
                if(con != null)
                    con.close();
            }
            catch( Exception ex )
            {
            ex.printStackTrace();
            throw new RuntimeException(ex);
            }
        }
    }
   
}
    

