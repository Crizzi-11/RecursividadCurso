
package listas;

/**
 *
 * @author Cristofer
 */
public class Node {
    private  Persona dato;
    private  Node next;

    
    
    @Override
    public String toString(){
        return "Node{"+"dato="+dato+'}';
    }

    public Node(Persona dato) {
        this.dato = dato;
        
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
    
}
