package Modelo;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class Categoria {
    String codigo;
    String t_categoria;

    public Categoria() {
    }

    public Categoria(String codigo, String t_categoria) {
        this.codigo = codigo;
        this.t_categoria = t_categoria;
    }

    public Categoria(Object[] arreglo){
        this.codigo = arreglo[0].toString();
        this.t_categoria =arreglo[1].toString();
    }
    
    public Object[] getInformacion(){
        Object [] registro = {getCodigo(),getT_categoria()};
        return registro;
    }
    
    public Object[] getinfor(){
        Object[] registro = {getCodigo(),getT_categoria()};
        return registro;
    }
    
    public String cadena(){
        return getCodigo()+"-"+getT_categoria()+"\n";
    }
    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getT_categoria() {
        return t_categoria;
    }

    public void setT_categoria(String t_categoria) {
        this.t_categoria = t_categoria;
    }
    
    
}
