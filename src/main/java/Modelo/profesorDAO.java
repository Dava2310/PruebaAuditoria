
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class profesorDAO {
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarProfesor(profesor pr){
        String sql = "INSERT INTO PROFESOR (NOMBRE, APELLIDO, CÉDULA, CORREO) VALUES (?,?,?,?)";
        try {
            con = cn.getConnetion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNOMBRE());
            ps.setString(2, pr.getAPELLIDO());
            ps.setInt(3, pr.getCÉDULA());
            ps.setString(4, pr.getCORREO());
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
    
    public List Listarprofesor(){
       List<profesor> ListaPr = new ArrayList();
       String sql = "SELECT * FROM PROFESOR";
       try {
           con = cn.getConnetion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               profesor pr = new profesor();
               pr.setID_PROFESOR(rs.getInt("ID_PROFESOR"));
               pr.setNOMBRE(rs.getString("NOMBRE"));
               pr.setAPELLIDO(rs.getString("APELLIDO"));
               pr.setCÉDULA(rs.getInt("CÉDULA"));
               pr.setCORREO(rs.getString("CORREO"));
               ListaPr.add(pr);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaPr;
   }
    
    public boolean Eliminarprofesor(int id){
       String sql = "DELETE FROM PROFESOR WHERE CÉDULA = ?";
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
    
       public boolean Modificarprofesor(profesor pr){
       String sql = "UPDATE PROFESOR SET NOMBRE=?, APELLIDO=?, CÉDULA=?, CORREO=? WHERE ID_PROFESOR=?";
       try {
           ps = con.prepareStatement(sql);   
           ps.setString(1, pr.getNOMBRE());
           ps.setString(2, pr.getAPELLIDO());
           ps.setInt(3, pr.getCÉDULA());
           ps.setString(4, pr.getCORREO());
           ps.setInt(5, pr.getID_PROFESOR());
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
