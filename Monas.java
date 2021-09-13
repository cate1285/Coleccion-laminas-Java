/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author robin
 */
public class Monas {
    public ArrayList<Integer> lista ;
    public ArrayList<Integer> faltan;
    public ArrayList<Integer> para_cambiar;
    public ArrayList<Integer> li;
    public ArrayList<Integer> lista1;
    public ArrayList<Integer> lista2;
    public int numero;
    
    public Monas (){
        this.faltan=faltan;
        this.para_cambiar=para_cambiar;
        this.li=li;
        this.lista1=lista1;
        this.lista2=lista2;
        this.numero= numero;
       
    }

    public Monas (ArrayList<Integer> lista){
       this.lista=lista;
       
    }
    public Monas (ArrayList<Integer> lista1,ArrayList<Integer> lista2,int numero){
       
    }
    public Monas (ArrayList<Integer> lista3,ArrayList<Integer> lista4){
       
    }

    
    public ArrayList<Integer> clases (ArrayList<Integer> lista){
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0; i<lista.size();i++){
            if(!li.contains(lista.get(i))){
                li.add(lista.get(i));
            }  
        } 
        return li;
    }
    
    public ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> lista1,ArrayList<Integer> lista2,int numero){
        ArrayList<Integer> posicion = new ArrayList<>();
        ArrayList<Integer> ver = new ArrayList<>();
        for(int i=0; i<lista2.size();i++){
            if((lista2.get(i)).equals(numero) ){
                if(lista1.contains(i)){
                    posicion.add(i);
                } 
            }
        }
        for(int i=0; i< lista1.size();i++){
            if (posicion.contains(lista1.get(i))){
                ver.add(lista1.get(i));
            }
            
        }
        
       return ver; 
    
    }
      
    public ArrayList<Integer> meFaltan(ArrayList<Integer> lista1,ArrayList<Integer> lista2){
        ArrayList<Integer> faltan = new ArrayList<>();
        for(int i=0; i<lista2.size();i++){
            if (! lista2.contains(lista1.get(i))){
                faltan.add(lista1.get(i));
                
            }
            
        } 
        return faltan;
    }
    
    
    public Integer puedoCambiar(ArrayList<Integer> lista3,ArrayList<Integer> lista4){
        ArrayList<Integer> para_cambiar = new ArrayList<>();
        int n=0;
        if(lista3.size()< lista4.size()){
            for(int i=0; i<lista3.size();i++){
                if (!lista4.contains(lista3.get(i))){
                    para_cambiar.add(lista3.get(i));
                }
               
            }            
        } 
        else{
            for(int i=0; i<lista4.size();i++){
                if (! lista3.contains(lista4.get(i))){
                    para_cambiar.add(lista4.get(i));
                }
               
            }  
            
        }
        n=para_cambiar.size();
        return (n);
    }
    

    
}
 