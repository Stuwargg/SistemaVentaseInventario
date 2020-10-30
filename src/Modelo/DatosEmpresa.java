/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class DatosEmpresa {
    String ruc;
    String nombre;
    String direccion;
    int telefono;
    String correo;
    String razon;

    public DatosEmpresa() {
    }

    public DatosEmpresa(String ruc, String nombre, String direccion, int telefono, String correo, String razon) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.razon = razon;
    }
    

    public DatosEmpresa(Object [] arreglo){
        this.ruc = arreglo[0].toString();
        this.nombre  = arreglo[1].toString();
        this.direccion = arreglo[2].toString();
        this.telefono = Integer.parseInt(arreglo[3].toString());
        this.correo = arreglo[4].toString();
        this.razon = arreglo[5].toString();
    }
    
    public Object [] getinfo(){
        Object [] fila = {getRuc(),getNombre(),getDireccion(),getTelefono(),getCorreo(),getRazon()};
        return fila;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
    
   
    
}
