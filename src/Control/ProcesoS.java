/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Cliente;
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
public class ProcesoS {

    String ruta = "F:\\Pryectos\\Clientes.txt";
    Cliente obCliente;
    FileReader fr;  //lector de archivos
    BufferedReader br;    //recepctor de memoria
    FileWriter fw;        //escribir
    File f;
    
    public ArrayList<Cliente> listado = new ArrayList<>();
    
    public void adicionar(Cliente c) throws IOException{
        fw = new FileWriter(ruta, true);
        fw.write(c.getId()+"-"+c.getDni()+"-"+c.getNombre()+"-"+c.getTelefono()+"-"+c.getDireccion()+"-"+c.getRazon()+"\n");
        fw.close();
    }
    
    public void leer() throws FileNotFoundException, IOException{
        listado.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String[] vec;
        while(cad != null){
            vec = cad.split("-");
            listado.add(new Cliente(Integer.parseInt(vec[0]),vec[1],vec[2],Integer.parseInt(vec[3]),vec[4],vec[5]    )  );
            cad = br.readLine();
        }
        fr.close();
    }
    
    public void actualizar(ArrayList<Cliente> array) throws IOException{
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
        
        for (Cliente c : array) {
            fw.write(c.getId()+"-"+c.getDni()+"-"+c.getNombre()+"-"+c.getTelefono()+"-"+c.getDireccion()+"-"+c.getRazon()+"\n");
            
        }
        fw.close();
    }
}
