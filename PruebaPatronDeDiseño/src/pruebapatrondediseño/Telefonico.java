
package pruebapatrondediseño;


public class Telefonico implements Facade {
    public void Reclamo(){
        System.out.println("Su reclamo ha sido recibido, Espere nuestra respuesta");
    }
    @Override
    public void consultarmonto(Cliente ciente) {
        System.out.println("Se ha mostrado su monto actual");
    }
    
}
