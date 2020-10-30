package Control;

import Modelo.Detalle;
import java.util.ArrayList;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class PilaVenta {
    NodoPila tope;

    public PilaVenta() {
        tope = null;
    }
    
    public boolean empty(){
        return tope == null;
    }
    
    public void push(Detalle objDe){
        NodoPila nuevo = new NodoPila(objDe);
        if (empty()) {
            nuevo.setSiguiente(null);
        }else{
            nuevo.setSiguiente(tope);
        }
        tope = nuevo;
    }
    
    public void pop(){
        if (!empty()) {
            NodoPila aux = tope;
            tope = tope.getSiguiente();
            aux.setSiguiente(null);
        }
    }
    
    public Detalle buscar(String cod){
        NodoPila  aux = tope;
        while (aux != null && !cod.equalsIgnoreCase(aux.getInformacion().getCod_pro())) {            
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            return aux.getInformacion();
        }else{
            return null;
        }
    }
    
    public boolean actualizar(Detalle de){
        NodoPila aux = tope;
        while (aux != null && !de.getCod_pro().equalsIgnoreCase(aux.getInformacion().getCod_pro())) {            
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            aux.setInformacion(de);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Detalle> listado(){
        NodoPila aux = tope;
        ArrayList<Detalle> array = new ArrayList<>();
        while (aux != null) {            
            array.add(aux.getInformacion());
            aux = aux.getSiguiente();
        }
        return array;
    }
}
