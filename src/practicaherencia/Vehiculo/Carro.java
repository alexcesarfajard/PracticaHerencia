package practicaherencia.Vehiculo;

public class Carro extends Vehiculo{

    private int cantPasajeros;

    public Carro() {
        this.cantPasajeros = 0;
    }

    public Carro(String marca, String modelo, int cantPasajeros) {
        super(marca, modelo);
        this.cantPasajeros = cantPasajeros;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCantidad pasajeros: " + this.getCantPasajeros();
    }
    
    


}
