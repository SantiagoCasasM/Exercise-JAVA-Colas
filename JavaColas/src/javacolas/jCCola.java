/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolas;

/**
 *
 * @author Santiago
 */
public class jCCola {
   jCNodoColas inicio,fin;
   int tama;
   public jCCola(){
       inicio =fin = null;
       tama = 0;
   }
   public boolean estVacia(){
       return inicio==null;
   }
   public void insertar(int ele){
       jCNodoColas nuevo = new jCNodoColas(ele);
       if (estVacia()){
           inicio=nuevo;
       }else{
           fin.siguiente=nuevo;
       }
       fin = nuevo;
       tama++;
   }
   public int quitar(){
       int aux = inicio.dato;
       inicio = inicio.siguiente;
       tama--;
       return aux;
   }
   public int inicioCola(){
       return inicio.dato;
   }
   public int tamanioCola(){
       return tama;
   }
}
