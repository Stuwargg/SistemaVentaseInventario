package Modelo;


public class Cliente {
    int id;
//    int  dni;
    String dni;
    String nombre;
    int telefono;
    String direccion;
    String razon;

    public Cliente() {
    }

//    public Cliente(int id, int dni, String nombre, int telefono, String direccion, String razon) {
//        this.id = id;
//        this.dni = dni;
//        this.nombre = nombre;
//        this.telefono = telefono;
//        this.direccion = direccion;
//        this.razon = razon;
//    }

    public Cliente(int id, String dni, String nombre, int telefono, String direccion, String razon) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.razon = razon;
    }

//    public int getId() {
//        return id;
//    }
//
//    public int getDni() {
//        return dni;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public int getTelefono() {
//        return telefono;
//    }
//
//    public String getDireccion() {
//        return direccion;
//    }
//
//    public String getRazon() {
//        return razon;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setDni(int dni) {
//        this.dni = dni;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void setTelefono(int telefono) {
//        this.telefono = telefono;
//    }
//
//    public void setDireccion(String direccion) {
//        this.direccion = direccion;
//    }
//
//    public void setRazon(String razon) {
//        this.razon = razon;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

            
}
