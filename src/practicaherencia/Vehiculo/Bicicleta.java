package practicaherencia.Vehiculo;

public class Bicicleta extends Vehiculo{
    
    private String tipoBicicleta;

    public Bicicleta() {
        this.tipoBicicleta = "";
    }

    public Bicicleta(String marca, String modelo, String tipoBicicleta) {
        super(marca, modelo);
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public String toString(){
        return super.toString() + "\nTipo bicicleta: " + this.getTipoBicicleta();
    }
}
