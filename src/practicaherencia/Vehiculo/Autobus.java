package practicaherencia.Vehiculo;

public class Autobus extends Vehiculo{
    private String ruta;
    private float costoPasaje;

    public Autobus() {
        this.ruta = "";
        this.costoPasaje = 0.0f;
    }

    public Autobus(String marca, String modelo, String ruta, float costoPasaje) {
        super(marca, modelo);
        this.ruta = ruta;
        this.costoPasaje = costoPasaje;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public float getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(float costoPasaje) {
        this.costoPasaje = costoPasaje;
    }
    
    public String toString(){
        return super.toString() + "\nRuta: " + this.getRuta() + " Costo del pasaje: " + this.getCostoPasaje();
    }
    
}
