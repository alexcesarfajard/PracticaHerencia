package practicaherencia.Vehiculo;

public class Vehiculo {
    
    private String marca;
    private String modelo;

    public Vehiculo() {
        this.marca = "";
        this.modelo = "";
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        return "Marca: " + this.getMarca() + " Modelo: " + this.getModelo();
    }
    
    
    
    
    
}
