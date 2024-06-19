
package Modelo;

public class profesor {
    
    private int ID_PROFESOR;
    private String NOMBRE;
    private String APELLIDO;
    private int CÉDULA;
    private String CORREO;

    public profesor() {
    }

    public profesor(int ID_PROFESOR, String APELLIDO, int CÉDULA, String CORREO) {
        this.ID_PROFESOR = ID_PROFESOR;
        this.APELLIDO = APELLIDO;
        this.CÉDULA = CÉDULA;
        this.CORREO = CORREO;
    }

    public int getID_PROFESOR() {
        return ID_PROFESOR;
    }

    public void setID_PROFESOR(int ID_PROFESOR) {
        this.ID_PROFESOR = ID_PROFESOR;
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

    public int getCÉDULA() {
        return CÉDULA;
    }

    public void setCÉDULA(int CÉDULA) {
        this.CÉDULA = CÉDULA;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }
    
}
