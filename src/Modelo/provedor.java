package Modelo;

public class provedor {
    int id;
    int ruc;
    String nombre;
    int telefono;
    String direccion;
    String razon;

    public provedor() {
    }

    public provedor(int id, int ruc, String nombre, int telefono, String direccion, String razon) {
        this.id = id;
        this.ruc = ruc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.razon = razon;
    }
    
    public provedor(Object [] objprovedor){
        this.id = Integer.parseInt(objprovedor[0].toString());
        this.ruc = Integer.parseInt(objprovedor[1].toString());
        this.nombre = objprovedor[2].toString();
        this.telefono = Integer.parseInt(objprovedor[3].toString());
        this.direccion = objprovedor[4].toString();
        this.razon = objprovedor[5].toString();
    }
    public Object[] getinformacion(){
        Object[] fila = {getId(),getRuc(),getNombre(),getTelefono(),getDireccion(),getRazon()};
        return fila;
    }
    
    
    
    
    
    
    
    
    
    public int getId() {
        return id;
    }

    public int getRuc() {
        return ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getRazon() {
        return razon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
}
