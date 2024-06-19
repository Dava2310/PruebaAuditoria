
package Modelo;

import java.util.Date;

public class solicitud {
    
    private int ID_SOLICITUD;
    private String NOMBRE;
    private String APELLIDO;
    private Date FECHA;
    private String DESCRIPCIÓN;

    public solicitud() {
    }

    public solicitud(int ID_SOLICITUD, String NOMBRE, String APELLIDO, Date FECHA, String DESCRIPCIÓN) {
        this.ID_SOLICITUD = ID_SOLICITUD;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.FECHA = FECHA;
        this.DESCRIPCIÓN = DESCRIPCIÓN;
    }

    public int getID_SOLICITUD() {
        return ID_SOLICITUD;
    }

    public void setID_SOLICITUD(int ID_SOLICITUD) {
        this.ID_SOLICITUD = ID_SOLICITUD;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public Date getFECHA() {
        return FECHA;
    }

    public void setFECHA(Date FECHA) {
        this.FECHA = new java.sql.Date(FECHA.getTime());      
    }

    public String getDESCRIPCIÓN() {
        return DESCRIPCIÓN;
    }

    public void setDESCRIPCIÓN(String DESCRIPCIÓN) {
        this.DESCRIPCIÓN = DESCRIPCIÓN;
    }
    
    
    
   
    
    
    
    
}
