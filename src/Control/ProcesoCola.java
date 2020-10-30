package Control;

import Modelo.Categoria;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class ProcesoCola {

    String ruta = "F:\\Pryectos\\Categoria.txt";
    Categoria ojbCat;
    FileReader fr;  //lector de archivos
    BufferedReader br;    //recepctor de memoria
    FileWriter fw;        //escribir
    File f;
    
    public ArrayList<Categoria> lista = new ArrayList<>();
    
    public void insertar(Categoria c) throws IOException{
        fw = new FileWriter(ruta, true);
        fw.write(c.cadena());
        fw.close();
    }
    
    public void leer() throws FileNotFoundException, IOException{
        lista.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String[] vec;
        while (cad != null) {      
            vec =  cad.split("-");
            Object [] fila = {vec[0], vec[1]};
            lista.add(new Categoria(fila));
            cad = br.readLine();
        }
        fr.close();
    }
    
    public void actualizar(ArrayList<Categoria> array) throws IOException{
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

        for (Categoria c : array) { //recorrer todo el arraylist 1 al ultimo          
        fw.write(c.cadena());
        }

        fw.close();
    }
}
