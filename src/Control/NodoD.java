/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.provedor;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class NodoD {
    provedor informacion;
    NodoD siguiente;
    NodoD anterior;

    public NodoD(provedor inf) {
        this.informacion = inf;
        siguiente =anterior =null;
    }

    public provedor getInformacion() {
        return informacion;
    }

    public void setInformacion(provedor informacion) {
        this.informacion = informacion;
    }

    public NodoD getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoD siguiente) {
        this.siguiente = siguiente;
    }

    public NodoD getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoD anterior) {
        this.anterior = anterior;
    }
    
    
}
