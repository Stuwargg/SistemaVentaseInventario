package Control;

import Modelo.Productos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ProcesoCProd {
    String ruta = "F:\\Pryectos\\Productos.txt";
    Productos objProdu;
    FileReader fr;  //lector de archivos
    BufferedReader br;    //recepctor de memoria
    FileWriter fw;        //escribir
    File f;
    
    public ArrayList<Productos> lista = new ArrayList<>();
    
    public void insertar(Productos pr) throws IOException{
        fw = new FileWriter(ruta, true);
        fw.write(pr.getCodigo()+"-"+pr.getNombre()+"-"+pr.getProveedor()+"-"+pr.getCategoria()+"-"+pr.getStock()+"-"+pr.getPrecio()+"\n");
        fw.close();
    }
    
    public void leer() throws FileNotFoundException, IOException{
        lista.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String [] vec;
        while (cad != null) {            
            vec = cad.split("-");
            Object[] fila= {vec[0],vec[1],vec[2],vec[3],Integer.parseInt(vec[4]), Double.parseDouble(vec[5])};
            lista.add(new Productos(fila));
            cad = br.readLine();
            
        }
        fr.close();
    }
    
    public void actualizar(ArrayList<Productos> array) throws IOException{
        f = new File(ruta);
        fw = new FileWriter(ruta, true);
        //BORRAR EL ARCHIVO
        fw.close();
        f.delete();

        //CREAR UN NUEVO ARCHIVO
        f = new File(ruta);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        fw = new FileWriter(f, true);
        for (Productos pr : array) {
            fw.write(pr.getCodigo()+"-"+pr.getNombre()+"-"+pr.getProveedor()+"-"+pr.getCategoria()+"-"+pr.getStock()+"-"+pr.getPrecio()+"\n");
        
        }
        fw.close();
        
    }
}
