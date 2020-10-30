package Modelo;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class Detalle {
//    int id;
    String cod_pro;
    String desp;
    int cantidad;
    double precio;
//    String  Id_venta;

    public Detalle() {
    }

    public Detalle(String cod_pro, String desp, int cantidad, double precio) {
        this.cod_pro = cod_pro;
        this.desp = desp;
        this.cantidad = cantidad;
        this.precio = precio;
        
    }

    

    public Detalle(Object[] arreglo){
        this.cod_pro = arreglo[0].toString();
        this.desp = arreglo[1].toString();
        this.cantidad = Integer.parseInt(arreglo[2].toString());
        this.precio = Double.parseDouble(arreglo[3].toString());
        
    }
    
    public Object[] getInfor(){
        Object[] fila = {getCod_pro(),getDesp(), getCantidad(), getPrecio(),TPagar()};
        return fila;
    }
   
    public String cadena(){
        return getCod_pro()+"-"+getDesp()+"-"+getCantidad()+"-"+getPrecio()+"-"+TPagar()+"\n";
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public float TPagar(){
        return (float) (cantidad*precio);
    }
    
    public double IGV(){
        return TPagar()*0.18;
    }
    
    public double montoTotal(){
        return TPagar()+IGV();
    }
    
    public boolean actualizarStock(int cantidad){
        int stock = 0;
        int stockactual=0;
        if (cantidad > stock) {
            return false;
        }else{
            stockactual = cantidad-stock;
        }
        return false;
        
    }
}
