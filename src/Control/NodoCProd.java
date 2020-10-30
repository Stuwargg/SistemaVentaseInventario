package Control;

import Modelo.Productos;
import Modelo.provedor;


public class NodoCProd {
    Productos informacion;
    NodoCProd enlace;
    
    public NodoCProd(Productos informacion) {
        this.informacion = informacion;
        this.enlace = this;
    }

    public Productos getInformacion() {
        return informacion;
    }

    public void setInformacion(Productos informacion) {
        this.informacion = informacion;
    }

    public NodoCProd getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoCProd enlace) {
        this.enlace = enlace;
    }
    
    
}
