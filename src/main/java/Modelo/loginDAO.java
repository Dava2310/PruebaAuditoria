
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    @SuppressWarnings("empty-statement")
    public login1 log(String CORREO, String CONTRASEÑA){
        login1 l= new login1();
        String sql = "SELECT * FROM usuarios WHERE CORREO = ? AND CONTRASEÑA = ?";
        try{
            con = cn.getConnetion();
            ps = con.prepareStatement(sql);
            ps.setString(1,CORREO);
            ps.setString(2, CONTRASEÑA);
            rs = ps.executeQuery();
            if (rs.next()){
            l.setID_USUARIO(rs.getInt("ID_USUARIO"));
            l.setNOMBRE(rs.getString("NOMBRE"));
            l.setCORREO(rs.getString("CORREO"));
            l.setCONTRASEÑA(rs.getString("CONTRASEÑA"));
            }
            }
            catch (SQLException e){
                        System.out.println(e.toString());
                        }
                        return l;
    }
}
