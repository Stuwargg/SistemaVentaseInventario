/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Cliente;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class NodoSimple {
    Cliente informacion;
    NodoSimple siguiente;

    public NodoSimple(Cliente objCliente) {
        this.informacion = objCliente;
        this.siguiente = null;
    }

    public Cliente getInformacion() {
        return informacion;
    }

    public void setInformacion(Cliente informacion) {
        this.informacion = informacion;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
    
}
