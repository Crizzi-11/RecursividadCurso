
package colas;

/**
 *
 * @author Cristofer
 */
public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    private int largo;
    
    public Cola(){
    this.frente = null;
    this.ultimo = null;
    }
    
    public void encola(Nodo nuevoNodo){
        if (frente == null) {
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        }else{
            ultimo.setAtras(nuevoNodo);
            ultimo = nuevoNodo;
        }
        largo++;
    }
    
    public Nodo atiende(){
    Nodo aux = frente;
        if (frente!=null) {
            frente= frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }
    
    public boolean encuentra(String referencia){
    if(frente!= null){
        if (frente.getDato().equals(referencia)) {
            return true;
        }else if(ultimo.getDato().equals(referencia)){
            return true;
        }else{
               Nodo aux = frente;
               while (aux!=null) {
                    if(aux.getDato().equals(referencia)){
                        return true;
                    }
                    aux=aux.getAtras();
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
    String s="";
    Nodo aux = frente;
        while (aux!=null) {
            s+=aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}
