
package Modelo;

public class login1 {
  private int ID_USUARIO;
  private String NOMBRE;
  private String CORREO;
  private String CONTRASEÑA; 

    public login1() {
    }

    public login1(int ID_USUARIO, String NOMBRE, String CORREO, String CONTRASEÑA) {
        this.ID_USUARIO = ID_USUARIO;
        this.NOMBRE = NOMBRE;
        this.CORREO = CORREO;
        this.CONTRASEÑA = CONTRASEÑA;
    }

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public String getCONTRASEÑA() {
        return CONTRASEÑA;
    }

    public void setCONTRASEÑA(String CONTRASEÑA) {
        this.CONTRASEÑA = CONTRASEÑA;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
  
}
