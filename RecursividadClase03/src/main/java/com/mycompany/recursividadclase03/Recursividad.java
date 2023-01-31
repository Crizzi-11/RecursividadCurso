/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursividadclase03;

/**
 *
 * @author Cristofer
 */
public class Recursividad {
    //NORMAL
    public void recorreArrayFor(int[] array){
        for (int i = 0; i <array.length; i++) {
            System.out.printf("Indice %d, valor %d\n", i, array[i]);
        }
}
    
    public void recorrerArrayRecursivo(int []array,int i){
        //RECURSIVO
    
    if (i<array.length) {
        System.out.printf("Indice %d, valor %d\n", i,array[i]);
        recorrerArrayRecursivo(array, i+1);}
    }
    
    
    public int sacaPosicionMayorFor(int [] array){
        int posM = 0;
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp) {
                posM = i;
                temp = array[i];   
            }   
        }
        return posM;
    }
    
    
    public int sacaPosicionMayor(int [] array){
        if (array.length == 0) {
            System.out.println("----ERROR: El arreglo esta vacío----");
            return -1; //---> significa que no hay datos en el vector
            
        }
        else{
            return sacaPosicionMayorR(array, 0, array[0], 0);
                }
        
    }
    
    
    private int sacaPosicionMayorR(int [] array, int i, int temp, int postM){
        if(i>= array.length){
        return postM;
        }
        else if (array[i] > temp) {
            return sacaPosicionMayorR(array, i+1, array[i], i); 
        }
        
        else{
        return sacaPosicionMayorR(array, i+1, temp, postM);
                }
        
        
        
    }
    
    public int busca(int []array, int num){
        if (array.length == 0) {
            return -2;
        }else{
        return buscarR(array, 0, num);}
}
    
    private int buscarR(int []array, int i, int num){
        // cod: -1 si no lo encuntra,1 si  lo encuentra
        if (i >= array.length){
            return -1;
        }else if (array[i] == num){
        return 1;
        }else{
        return buscarR(array, i+1, num);
        }
    }
    
    
       
}
