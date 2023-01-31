/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividadclase03;

/**
 *
 * @author Cristofer
 */
public class RecursividadClase03 {

  public static void main(String[] args) {
  Recursividad Mrecursividad = new Recursividad();
  int[] array = {69,89,100,56,23};
  //System.out.println("----Metodo NOrmal----");
  //Mrecursividad.recorreArrayFor(array);
  //System.out.println("-----Con Metodo Recursivo------");
  //Mrecursividad.recorrerArrayRecursivo(array, 0);
  //int posMayor = Mrecursividad.sacaPosicionMayorFor(array);
  //System.out.printf("Pos mayor con ciclo: %d\n",posMayor);
  /*
    int posMayor = Mrecursividad.sacaPosicionMayor(array);
  if (posMayor == -1){System.out.println("----Error-----");}
  else{
      System.out.printf("El indice con el numero mayor es: %d\n",posMayor);}
     
   */
  
  
  int buscaN = Mrecursividad.busca(array, 100);
      if (buscaN == -2){
          System.out.println("---Error---\nARREGLO VACÍO");
      }else if(buscaN == -1){
          System.out.println("----ERROR----:No se encontró el número en el "+
          "arreglo");
      }else{
          System.out.println("Si se encontro el numero en el arreglo");}
      
          }
  }

    
}
