package Personas;

import java.util.logging.Logger;

public class Conductor extends Persona{
    
    private String tipoLicencia;

    public Conductor(){
        this.tipoLicencia = "";
    }

    public Conductor(String nombre, String cedula, String tipoLicencia){
        super(nombre, cedula);
        this.tipoLicencia = tipoLicencia;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
    public String toString(){
        return super.toString() + "\nTipo de licencia: " + this.getTipoLicencia();
    }
    
    
    
    
    
    
}
