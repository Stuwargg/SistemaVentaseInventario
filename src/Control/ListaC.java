/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.DatosEmpresa;
import java.util.ArrayList;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class ListaC {

    NodoCircular nc;

    public ListaC() {
        nc = null;
    }

    public boolean vacio() {
        if (nc == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertar(DatosEmpresa de) {
        NodoCircular nuevo = new NodoCircular(de);
        if (!vacio()) {
            nuevo.setEnlance(nc.getEnlance());
            nc.setEnlance(nuevo);
        }
        nc = nuevo;
    }

    public ArrayList<DatosEmpresa> listar() {
        NodoCircular n;
        ArrayList<DatosEmpresa> array = new ArrayList();
        if (!vacio()) {
            n = nc.getEnlance();
            do {
                array.add(n.getInformacion());
                n = n.getEnlance();
            } while (n != nc.getEnlance());
        }
        return array;
    }

    public DatosEmpresa buscar(String ruc) {
        NodoCircular actual;
        boolean encontrado = false;
        actual = nc;
        while ((actual.getEnlance() != nc) && (!encontrado)) {
            encontrado = ruc.equals(actual.getInformacion().getRuc());
            if (!encontrado) {
                actual = actual.getEnlance();
            }
        }
        
        encontrado = ruc.equals(actual.getInformacion().getRuc());
        
        if(encontrado)
        return actual.getInformacion();
        else
         return null;

    }

    public boolean actualiar(DatosEmpresa de) {
        NodoCircular actual;
        boolean encontrado = false;
        actual = nc;
        while ((actual.getEnlance() != nc) && (!encontrado)) {
            encontrado = de.getRuc().equals(actual.getInformacion().getRuc());
            if (!encontrado) {
                actual = actual.getEnlance();
            }
        }
        encontrado = de.getRuc().equals(actual.getInformacion().getRuc());

        if (encontrado) {
            actual.setInformacion(de);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(String ruc) {
        NodoCircular actual;
        boolean encontrado = false;
        actual = nc;
        while ((actual.getEnlance() != nc) && (!encontrado)) {
            encontrado = actual.getEnlance().getInformacion().getRuc().equalsIgnoreCase(ruc);
            if (!encontrado) {
                actual = actual.getEnlance();
            }
        }
        encontrado = actual.getEnlance().getInformacion().getRuc().equalsIgnoreCase(ruc);
        if (encontrado) {
            NodoCircular nx = actual.getEnlance();
            if (nc == nc.getEnlance()) {
                nc = null;
            } else {
                if (nx == nc) {
                    nc = actual;
                }
                actual.setEnlance(nx.getEnlance());
            }
            return true;
        } else {
            return false;
        }
    }

}
