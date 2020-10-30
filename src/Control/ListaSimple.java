/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class ListaSimple {

    NodoSimple inicio, fin;

    public ListaSimple() {
        inicio = fin = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void insertarC(Cliente objCliente) {
        NodoSimple nuevo = new NodoSimple(objCliente);
        if (vacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        fin.setSiguiente(null);
    }

    public ArrayList<Cliente> listarC() {
        NodoSimple aux = inicio;
        ArrayList<Cliente> array = new ArrayList<>();
        Cliente obCliente;
        while (aux != null) {
            obCliente = new Cliente(aux.getInformacion().getId(), aux.getInformacion().getDni(), aux.getInformacion().getNombre(), aux.getInformacion().getTelefono(),
                    aux.getInformacion().getDireccion(), aux.getInformacion().getRazon());
            array.add(obCliente);
            aux = aux.getSiguiente();
        }
        return array;
    }

    public Cliente buscarC(String objBuscar, String tipobusq) {
        switch (tipobusq) {
            case "1": {
                NodoSimple aux = inicio;
                while (aux != null && !objBuscar.equalsIgnoreCase(aux.getInformacion().getDni())) {
                    aux = aux.getSiguiente();
                }
                if (aux != null) {
                    return aux.getInformacion();
                } else {
                    return null;
                }
            }
            case "2": {
                NodoSimple aux = inicio;
                while (aux != null && !objBuscar.equalsIgnoreCase(aux.getInformacion().getNombre())) {
                    aux = aux.getSiguiente();
                }
                if (aux != null) {
                    return aux.getInformacion();
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public boolean actualizarC(Cliente objCliente) {
        NodoSimple aux = inicio;
        while (aux != null && !objCliente.getDni().equalsIgnoreCase(aux.getInformacion().getDni())) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            aux.setInformacion(objCliente);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(Cliente obCliente) {
        NodoSimple nodoBus = inicio;
        while (nodoBus != null && obCliente.getNombre().equalsIgnoreCase(nodoBus.getInformacion().getNombre())) { // CUIDADO ACA            
            nodoBus = nodoBus.getSiguiente();
        }
        NodoSimple nodoEli = inicio;
        while (nodoEli.getSiguiente() != null && nodoEli.getSiguiente() != nodoBus) {
            nodoEli = nodoEli.getSiguiente();
        }
        if (nodoBus != null) {
            if (inicio == nodoBus) {   //eliminamos el nodo inicio
                inicio = nodoBus.getSiguiente();
            } else if (fin == nodoBus) {    //eliminamos el ultimo nodo
                fin = nodoEli;
                nodoEli.setSiguiente(null);
            } else {                //elimina posición intermedio
                nodoEli.setSiguiente(nodoBus.getSiguiente());
            }
            return true;
        } else {
            return false;
        }
    }

}
