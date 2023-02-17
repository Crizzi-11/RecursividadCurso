
package colas;

/**
 *
 * @author Cristofer
 */
public class Nodo {
    private String dato;
    private Nodo atras;

    public Nodo(String dato) {
        this.dato = dato;
        this.atras = null;
    }

  

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
    
    @Override
    public String toString(){
        return dato;
    }
    
    
    
    
}
