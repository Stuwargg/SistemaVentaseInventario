/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.provedor;
import java.util.ArrayList;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class ListaD {
    NodoD inicio, fin;

    public ListaD() {
        inicio = fin = null;
    }
    
    public boolean vacia(){
        return inicio==null;
    }
    
    public void InsertarI(provedor p){
        NodoD nuevo = new NodoD(p);
        nuevo.setSiguiente(inicio);
        if (vacia()) {
            fin = nuevo;
            fin.setSiguiente(null);
        }
        if (!vacia()) {
            inicio.setAnterior(nuevo);
        }
        inicio = nuevo;
    }
    
    public ArrayList<provedor> listar(int i){
        ArrayList<provedor> array = new ArrayList<>();
        switch(i){
            case 0: {
                NodoD aux = inicio;
                while (aux != null) {                    
                    array.add(aux.getInformacion());
                    aux = aux.getSiguiente();
                }
            }
            break;
            case 1: {
                NodoD aux = fin;
                while (aux != null) {                    
                    array.add(aux.getInformacion());
                    aux = aux.getAnterior();
                }
            }
            break;
        }
        return array;
    }
    
    public provedor buscar(String nom){
        NodoD aux = inicio;
        while (aux != null && !nom.equalsIgnoreCase(aux.getInformacion().getNombre())) {            
            aux =aux.getSiguiente();
        }
        if(aux != null){
            return aux.getInformacion();
        }else{
            return null;
        }
    }
    
    public boolean actualizar(provedor p){
        NodoD aux = inicio;
        while (aux != null && !p.getNombre().equalsIgnoreCase(aux.getInformacion().getNombre())) {            
            aux =aux.getSiguiente();
        }
        if (aux != null) {
            aux.setInformacion(p);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminar(String nom){
       NodoD actual;
        boolean encontrado = false;
        actual = inicio;
        while ((actual != null) && (!encontrado)) //bucle de Búsqueda
        {
            encontrado = (actual.getInformacion().getNombre().equalsIgnoreCase(nom)); // se actualiza elvalor de encontrado
            if (!encontrado) // severifica para pasar al siguiente nodo
            {
                actual = actual.getSiguiente();
            }
        }
        //Realizando los enlaces
        if (actual != null) // se verifica si se encontro el elemento buscado
        {
            if (actual == inicio) {
                inicio = actual.getSiguiente(); // borrar el primer nodo
                if (actual.getSiguiente() != null) {
                    actual.getSiguiente().setAnterior(null);
                }
            } else if (actual.getSiguiente() != null) // Borrar un nodo intermedio
            {
                actual.getAnterior().setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
            } else {
                actual.getAnterior().setSiguiente(null); // el ultimo
                fin = actual.getAnterior();  // moviendo el final
            }
            actual = null;
            return true;
        } else {
            return false;
        }
    }
}
