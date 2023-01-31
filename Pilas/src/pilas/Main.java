package pilas;

/**
 *
 * @author Cristofer
 */
public class Main {

    public static void main(String[] args) {
       Pila miPila = new Pila();
       miPila.push(5);
       miPila.push(89);
       miPila.push(189);
       miPila.push(677);
       miPila.push(980);
       
       System.out.println("PILA ANTES DEL POP");
       miPila.Listar();
       
       miPila.pop();
       
        System.out.println("PILA DESPUES DEL POP");
        miPila.Listar();
        
        
        
        
    }
}
