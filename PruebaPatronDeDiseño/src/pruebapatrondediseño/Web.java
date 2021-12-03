
package pruebapatrondediseño;

public class Web implements Facade{
    
    public void ActualizarDatos(){
        System.out.println("Se han actualizado lso datos");
    }
    @Override
    public void consultarmonto(Cliente cliente) {
        System.out.println("Se ha mostrado su monto actual");
    }    
}
