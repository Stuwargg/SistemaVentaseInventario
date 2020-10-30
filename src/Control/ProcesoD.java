/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.provedor;
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
public class ProcesoD {

    String ruta = "F:\\Pryectos\\provedor.txt";
    provedor objprovedor;
    FileReader fr;  //lector de archivos
    BufferedReader br;    //recepctor de memoria
    FileWriter fw;        //escribir
    File f;
    
    public ArrayList<provedor> lista = new ArrayList<>();
    
    public void insertarP(provedor p) throws IOException{
        fw = new FileWriter(ruta,true);
        fw.write(p.getId()+"-"+p.getRuc()+"-"+p.getNombre()+"-"+p.getTelefono()+"-"+p.getDireccion()+"-"+p.getRazon()+"\n");
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
            lista.add(new provedor(Integer.parseInt(vec[0]),Integer.parseInt(vec[1]),vec[2],Integer.parseInt(vec[3]), vec[4],vec[5]));
            cad = br.readLine();
        
        }
        fr.close();
    }
    
    public void actualizar(ArrayList<provedor> arrayProv) throws IOException{ 
        f = new File(ruta);
        fw = new FileWriter(ruta, true);       
        //BORRAR EL ARCHIVO
        fw.close();
        f.delete();
        
        //CREAR UN NUEVO ARCHIVO
        f = new File(ruta);
        if(!f.exists())
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        fw = new FileWriter(f, true);
        for (provedor p : arrayProv) {
            fw.write(p.getId()+"-"+p.getRuc()+"-"+p.getNombre()+"-"+p.getTelefono()+"-"+p.getDireccion()+"-"+p.getRazon()+"\n");
        }
        fw.close();
    }

}
