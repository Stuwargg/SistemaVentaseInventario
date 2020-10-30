/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.DatosEmpresa;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class NodoCircular {
    DatosEmpresa informacion;
    NodoCircular enlance;
    
    public NodoCircular(DatosEmpresa informacion) {
        this.informacion = informacion;
        this.enlance = this;
    }

    public DatosEmpresa getInformacion() {
        return informacion;
    }

    public void setInformacion(DatosEmpresa informacion) {
        this.informacion = informacion;
    }

    public NodoCircular getEnlance() {
        return enlance;
    }

    public void setEnlance(NodoCircular enlance) {
        this.enlance = enlance;
    }
    
}
