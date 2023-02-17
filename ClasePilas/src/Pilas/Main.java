
package Pilas;

/**
 *
 * @author Cristofer
 */
public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        Pila miPila = new Pila();
        
       miPila.push(new Carro("Toyota","123456"));
       miPila.push(new Carro("Nissan","5445444"));
       miPila.push(new Carro("SUZUKI","46565"));
       miPila.push(new Carro("Homer","5446546"));
        
        System.out.println("PILA Original");
        miPila.listar();
        
        miPila.popModificado(new Carro("SUZUKI","46565"));
        System.out.println("PILA DESPUES DEL POPMODIFICADO");
        miPila.listar();
        
       
        
       
        
        
//        miPila.popModificado(89);
//        System.out.println("PILA DESPUES DE UN DELETE A LA REFERENCIA 89");
//        miPila.listar();
  
    }
    
}
