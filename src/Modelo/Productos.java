package Modelo;


public class Productos {
//    int id;
    String codigo;
    String nombre;
    String proveedor;
    String categoria;
    int stock;
    double precio;

    public Productos() {
    }

    public Productos(String codigo, String nombre, String proveedor, String categoria, int stock, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
    }
    
    public Productos(Object[] arreglo){
        this.codigo = arreglo[0].toString();
        this.nombre = arreglo[1].toString();
        this.proveedor = arreglo[2].toString();
        this.categoria = arreglo[3].toString();
        this.stock = Integer.parseInt(arreglo[4].toString());
        this.precio =Double.parseDouble(arreglo[5].toString());
    }
    public Object[] getinfo(){
        Object[] fila ={getCodigo(),getNombre(),getProveedor(),getCategoria(),getStock(),getPrecio()};
        return fila;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

     public boolean actualizarStock(){
        int cantidad=0;
        int stockactual=0;
        if (cantidad > stock) {
            return false;
        }else{
            stockactual = stock-cantidad;
        }
        return false;
        
    }
}
