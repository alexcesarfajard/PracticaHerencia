package practicaherencia;

import Personas.Conductor;
import Personas.Persona;
import practicaherencia.Vehiculo.Autobus;
import practicaherencia.Vehiculo.Bicicleta;
import practicaherencia.Vehiculo.Carro;
import practicaherencia.Vehiculo.Motocicleta;

public class PracticaHerencia {

    public static void main(String[] args) {
        
        //Creando un vehiculo (Carro) y un dueño de carro
        System.out.println("*** CARRO ***");
        Carro c1 = new Carro("Citroen", "C-Elysse", 5);
        Conductor conductor1 = new Conductor("Alex", "123456789", "B1");
        System.out.println("Datos del carro:\n" + c1.toString());
        System.out.println("Y su conductor es:\n" + conductor1.toString());
        
        //Creando una motocicleta y un conductor
        System.out.println("\n*** MOTOCICLETA ***");
        Motocicleta moto1 = new Motocicleta("Honda", "CB300", 300);
        Conductor conductor2 = new Conductor("Luis", "43216598", "A2");
        System.out.println("Datos de la motocicleta:\n " + moto1.toString());
        System.out.println("Y su conductor es:\n" + conductor2.toString());
        
        //Creando un autobus y un conductor
        System.out.println("\n*** AUTOBUS ***");
        Autobus bus = new Autobus("Mercedes Benz", "OF1724", "Heredia", 635);
        Conductor conductor3 = new Conductor("Arley", "245698713", "C3");
        System.out.println("Datos del autobus: \n" + bus.toString());
        System.out.println("Y su conductor es:\n" + conductor3.toString());
        
        //Creando una bicicleta y un conductor:
        System.out.println("\n*** BICICLETA ***");
        Bicicleta bici = new Bicicleta("Canondale", "Sprint", "Ruta");
        Persona pers1 = new Persona("Ronny", "654321789");
        System.out.println("Datos de la bicicleta:\n" + bici.toString());
        System.out.println("Y su conductor es: "+pers1.toString());
    }
    
}
