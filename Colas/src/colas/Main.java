
package colas;

/**
 *
 * @author Cristofer
 */
public class Main {

    public static void main(String[] args) {
        
        Cola cola = new Cola();
        cola.encola(new Nodo("Jose"));
        cola.encola(new Nodo("Andres"));
        cola.encola(new Nodo("ricardo"));
        cola.encola(new Nodo("keylor"));
        
        System.out.println(cola);
        
        System.out.println(cola.encuentra("Andres"));
        
        
    }
    
}
