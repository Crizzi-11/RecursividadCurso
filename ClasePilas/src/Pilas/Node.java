
package Pilas;

/**
 *
 * @author Cristofer
 */
public class Node {
    private Carro valor;
    private Node siguiente;
    
    //constructor para inicializar

    public Node() {
        this.valor = null;
        this.siguiente = null;
    }

    public Carro getValor() {
        return valor;
    }

    public void setValor(Carro valor) {
        this.valor = valor;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
}
