/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

/**
 *
 * @author Cristofer
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Lista lalista = new Lista();
        lalista.inserta(new Persona(10, "Juan"));
        lalista.inserta(new Persona(5, "Pedro"));
        lalista.inserta(new Persona(30, "Alberto"));
        lalista.inserta(new Persona(20, "Daniela"));
        lalista.inserta(new Persona(15, "Sebastian"));
        
        System.out.println(lalista.extrae(30).getNombre());
        lalista.elimina(5);
        System.out.println("Existe? "+lalista.existe(20));
        System.out.println(lalista);
        
        System.out.println("-------Modifica--------");
        lalista.modifica(new Persona(15,"Didier"));
        System.out.println(lalista);
    }
    
}
