package Control;

import Modelo.Detalle;
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
public class ProcesoPila {
    String ruta = "F:\\Pryectos\\DetalleVenta.txt";
    FileWriter fw;
    FileReader fr;
    BufferedReader br;
    File f;
    
    public ArrayList<Detalle> array = new ArrayList<>();
    
    public void insertaR(Detalle d) throws FileNotFoundException, IOException{
        array.add(0,new Detalle(d.getInfor()));
        actualizar(array);
    }

    public void leer()throws FileNotFoundException, IOException {
        array.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String[] vec;
        while (cad != null) {            
            vec = cad.split("-");
            Object[] fila = {vec[0],vec[1],Integer.parseInt(vec[2]), Double.parseDouble(vec[3]) };
            array.add(new Detalle(fila));
            cad = br.readLine();
        }
        fr.close();
    }

    public void actualizar(ArrayList<Detalle> array) throws IOException {
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
        for (Detalle d : array) {
            fw.write(d.cadena());
        }
        fw.close();
    }
}
