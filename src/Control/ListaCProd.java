package Control;

import Modelo.Productos;
import java.util.ArrayList;

public class ListaCProd {

    NodoCProd nc;

    public ListaCProd() {
        nc = null;
    }

    public boolean vacia() {
        return nc == null;
    }

    public void insetarPro(Productos pr) {
        NodoCProd nuevo = new NodoCProd(pr);
        if (!vacia()) {
            nuevo.setEnlace(nc.getEnlace());
            nc.setEnlace(nuevo);
        }
        nc = nuevo;
    }

    public ArrayList<Productos> listar() {
        NodoCProd n;
        ArrayList<Productos> array = new ArrayList<>();
        if (!vacia()) {
            n = nc.getEnlace();
            do {
                array.add(n.getInformacion());
                n = n.getEnlace();
            } while (n != nc.getEnlace());
        }
        return array;
    }

    public Productos buscar(String cod) {
        NodoCProd actual;
        boolean encontrado = false;
        actual = nc;
        while ((actual.getEnlace() != nc) && (!encontrado)) {
            encontrado = cod.equals(actual.getInformacion().getCodigo());
            if (!encontrado) {
                actual = actual.getEnlace();
            }
        }
        encontrado = cod.equals(actual.getInformacion().getCodigo());
        if (encontrado) {
            return actual.getInformacion();
        } else {
            return null;
        }
    }

    public boolean actualizar(Productos pro) {
        NodoCProd actual;
        boolean encontrado = false;
        actual = nc;
        while ((actual.getEnlace() != nc) && (!encontrado)) {
            encontrado = pro.getCodigo().equals(actual.getInformacion().getCodigo());
            if (!encontrado) {
                actual = actual.getEnlace();
            }
        }
        encontrado = pro.getCodigo().equals(actual.getInformacion().getCodigo());
        if (encontrado) {
            actual.setInformacion(pro);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(String cod) {
        NodoCProd actual = nc;
        boolean encontrado = false;
        while ((actual.getEnlace() != nc) && (!encontrado)) {
            encontrado = actual.getEnlace().getInformacion().getCodigo().equalsIgnoreCase(cod);
            if (!encontrado) {
                actual = actual.getEnlace();
            }
        }
        encontrado = actual.getEnlace().getInformacion().getCodigo().equalsIgnoreCase(cod);
        if (encontrado) {
            NodoCProd n = actual.getEnlace();
            if (nc == nc.getEnlace()) {
                nc = null;
            }else{
                if (n == nc) {
                    nc = actual;
                }
                actual.setEnlace(n.getEnlace());
            }
            return true;
        }else{
            return false;
        }
    }
}
