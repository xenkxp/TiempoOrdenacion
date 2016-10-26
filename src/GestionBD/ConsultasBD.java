/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBD;

import ConectionBD.UConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.*;

/**
 *
 * @author E008
 */
public class ConsultasBD {
    public Pantalla pantalla1 = null;
    
    
    public void añadirUsuaro(){
        pantalla1 = new Pantalla();
        //Iniciamos el objeto coneccion
        Connection con = null;
        try{
            //Establece la coneccion
            con = UConection.getConnection();
           
            // Recuperar los Datos.
            PreparedStatement ps = con.prepareStatement("INSERT INTO tiempos (tipo_ordenacion,tamanio,tipo_inicializacion,tiempo_milisegundos,date)"
            + "VALUES(?,?,?,?,?);");
            ps.setString(1, pantalla1.genMuestra.getTipoOrd()); 
            ps.setInt(2, pantalla1.genMuestra.getTam());
            ps.setString(3, pantalla1.genMuestra.getTipoIni());
            ps.setDouble(4, pantalla1.genMuestra.getTimeMiliSec());
            ps.setString(5, pantalla1.genMuestra.getDate());
            ps.executeUpdate();
            ps.close();
            
        }catch(SQLException sqle){
            System.out.println("SQLException: Error durante la"+ " conexión con la base de datos:" + sqle);
        } catch (Exception e) {
            System.out.println("Se ha producido un error desconocido durante la conexión a la base de datos..." + e);
        }finally{
            UConection.closeConectiion();
        }
    }
    public void mejorTiemporTam()
    {
         pantalla1 = new Pantalla();
        //Iniciamos el objeto coneccion
        Connection con = null;
        try{
            //Establece la coneccion
            con = UConection.getConnection();
           
            // Recuperar los Datos.
            PreparedStatement ps = con.prepareStatement("INSERT INTO tiempos (tipo_ordenacion,tamanio,tipo_inicializacion,tiempo_milisegundos,date)"
            + "VALUES(?,?,?,?,?);");
            ps.setString(1, pantalla1.genMuestra.getTipoOrd()); 
            ps.setInt(2, pantalla1.genMuestra.getTam());
            ps.setString(3, pantalla1.genMuestra.getTipoIni());
            ps.setDouble(4, pantalla1.genMuestra.getTimeMiliSec());
            ps.setString(5, pantalla1.genMuestra.getDate());
            ps.executeUpdate();
            ps.close();
            
        }catch(SQLException sqle){
            System.out.println("SQLException: Error durante la"+ " conexión con la base de datos:" + sqle);
        } catch (Exception e) {
            System.out.println("Se ha producido un error desconocido durante la conexión a la base de datos..." + e);
        }finally{
            UConection.closeConectiion();
        }
    }
}
