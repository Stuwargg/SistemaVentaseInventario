package Control;

import Modelo.Categoria;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class NodoCola {
    Categoria informacion;
    NodoCola siguiente;
    
    public NodoCola(Categoria informacion) {
        this.informacion = informacion;
        this.siguiente = null;
    }

    public Categoria getInformacion() {
        return informacion;
    }

    public void setInformacion(Categoria informacion) {
        this.informacion = informacion;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
