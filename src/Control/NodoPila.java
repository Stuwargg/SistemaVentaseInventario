package Control;

import Modelo.Detalle;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class NodoPila {
    Detalle informacion;
    NodoPila siguiente;

    public NodoPila(Detalle informacion) {
        this.informacion = informacion;
        this.siguiente = null;
    }

    public Detalle getInformacion() {
        return informacion;
    }

    public void setInformacion(Detalle informacion) {
        this.informacion = informacion;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
