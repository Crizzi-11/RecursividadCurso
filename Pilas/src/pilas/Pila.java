
package pilas;

public class Pila {
    private Node cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }
    
    public boolean Vacia(){
    return cima == null;
    }
    
    public int tamanio(){
    return this.largo;
    }
    
    public void push(int valor){
    Node newNode = new Node();
    newNode.setValor(valor);
    
        if (this.Vacia()) {
            this.cima = newNode;    
        }
        else{
        newNode.setSiguiente(this.cima);
        this.cima = newNode;
        }
        this.largo++;
    }
    
    public void pop(){
        //!----> significa negar
        if (!Vacia()) {
         //asigna como primer node al siguiente de la pila!   
         this.cima = this.cima.getSiguiente();
         // decrementa el contador del tamaño de la pila
         this.largo--;
            
        }
    }
    
    
    
    
    
    
    public void Listar(){
        //Crea una copia de la pila
        Node aux = cima;
        //Recorre la pila hasta el ultimo node.
        while(aux != null){
            System.out.println("|\t"+ aux.getValor() + "|\t");
            System.out.println("------------------");
            aux = aux.getSiguiente();
        }
    }
}
