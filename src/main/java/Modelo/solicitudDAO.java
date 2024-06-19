/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class solicitudDAO {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
     public boolean RegistrarSolicitud(solicitud sol){
        String sql = "INSERT INTO SOLICITUD (ID_SOLICITUD ,NOMBRE, APELLIDO, FECHA, DESCRIPCIÓN) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnetion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,sol.getID_SOLICITUD());
            ps.setString(2, sol.getNOMBRE());
            ps.setString(3, sol.getAPELLIDO());
            ps.setDate(4,(java.sql.Date)sol.getFECHA());
            ps.setString(5, sol.getDESCRIPCIÓN());
            ps.execute();
            return true;
        }
         catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
         } finally{
            try{
                con.close();
            } catch (SQLException e){
                System.out.println(e.toString());
            }
        }
    }
     
    public List ListarSolicitud(){
       List<solicitud> ListaSol = new ArrayList();
       String sql = "SELECT * FROM SOLICITUD";
       try {
           con = cn.getConnetion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               solicitud sol = new solicitud();
               sol.setID_SOLICITUD(rs.getInt("ID_SOLICITUD"));
               sol.setNOMBRE(rs.getString("NOMBRE"));
               sol.setAPELLIDO(rs.getString("APELLIDO"));
               sol.setFECHA(rs.getDate("FECHA"));
               sol.setDESCRIPCIÓN(rs.getString("DESCRIPCIÓN"));
               ListaSol.add(sol);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaSol;
   }
    
    public boolean Eliminarsolicitud(int id){
       String sql = "DELETE FROM SOLICITUD WHERE ID_SOLICITUD = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }
    
       public boolean Modificarsolicitud(solicitud sol){
       String sql = "UPDATE SOLICITUD SET NOMBRE=?, APELLIDO=?, FECHA=?, DESCRIPCIÓN=? WHERE ID_SOLICITUD=?";
       try {
           ps = con.prepareStatement(sql);   
           ps.setString(1, sol.getNOMBRE());
           ps.setString(2, sol.getAPELLIDO());
           ps.setDate(3,(Date)(sol.getFECHA()));
           ps.setString(4, sol.getDESCRIPCIÓN());
           ps.setInt(5, sol.getID_SOLICITUD());
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
     
    
}
