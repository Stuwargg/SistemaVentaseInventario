/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.DatosEmpresa;
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
public class ProcesoC {

    String ruta = "F:\\Pryectos\\DatosEmpresa.txt";
    DatosEmpresa objE;
    FileReader fr;  //lector de archivos
    BufferedReader br;    //recepctor de memoria
    FileWriter fw;        //escribir
    File f;

    public ArrayList<DatosEmpresa> lista = new ArrayList<>();

    public void insertar(DatosEmpresa de) throws IOException {
        fw = new FileWriter(ruta, true);
        fw.write(de.getRuc() + "-" + de.getNombre() + "-" + de.getDireccion() + "-" + de.getTelefono() + "-" + de.getCorreo() + "-" + de.getRazon() + "\n");
        fw.close();
    }

    public void leer() throws FileNotFoundException, IOException {
        lista.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String[] vec;
        while (cad != null) {
            vec = cad.split("-");
            Object[] fila = {vec[0], vec[1], vec[2], Integer.parseInt(vec[3]), vec[4], vec[5]};
            lista.add(new DatosEmpresa(fila));
            cad = br.readLine();
        }
        fr.close();

    }

    public void actualizar(ArrayList<DatosEmpresa> array) throws IOException {
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
        for (DatosEmpresa de : array) {
            fw.write(de.getRuc() + "-" + de.getNombre() + "-" + de.getDireccion() + "-" + de.getTelefono() + "-" + de.getCorreo() + "-" + de.getRazon() + "\n");

        }
        fw.close();

    }
}
