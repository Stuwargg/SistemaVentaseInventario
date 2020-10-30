package Control;

import Modelo.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class ColaCategoria {

    NodoCola frente, fincola;

    public ColaCategoria() {
        frente = fincola = null;
    }

    public boolean empty() {
        return frente == null;
    }

    public void encolar(Categoria c) {
        NodoCola nuevo = new NodoCola(c);
        if (frente == null) {
            frente = nuevo;
        } else {
            fincola.setSiguiente(nuevo);
        }
        fincola = nuevo;
        fincola.setSiguiente(null);
    }

    public void desencolar() {
        if (!empty()) {
            NodoCola aux = frente;
            frente = frente.getSiguiente();
            aux.setSiguiente(null);
        }
    }

    public Categoria buscar(String cod) {
        NodoCola aux = frente;
        while (aux != null && !cod.equalsIgnoreCase(aux.getInformacion().getCodigo())) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getInformacion();
        } else {
            return null;
        }
    }

    public boolean actualizar(Categoria objC) {
        NodoCola aux = frente;
        while (aux != null && !objC.getCodigo().equalsIgnoreCase(aux.getInformacion().getCodigo())) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            aux.setInformacion(objC);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Categoria> listado(){
        NodoCola aux = frente;
        ArrayList<Categoria> array= new ArrayList<>();
        while (aux != null) {            
            array.add(aux.getInformacion());
            aux = aux.getSiguiente();
        }
        return array;
    }
}
