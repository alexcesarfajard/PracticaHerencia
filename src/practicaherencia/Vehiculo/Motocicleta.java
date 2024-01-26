package practicaherencia.Vehiculo;

public class Motocicleta extends Vehiculo{
    
    private int cilindrada;

    public Motocicleta() {
        this.cilindrada = 0;
    }

    public Motocicleta(String marca, String modelo, int cilindradax) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCilindrada: " + this.getCilindrada();
    }
    
}
