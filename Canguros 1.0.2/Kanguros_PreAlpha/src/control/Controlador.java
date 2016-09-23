/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dades.Registres;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Marti Huerta Climent
 */
public class Controlador {
    
    private Registres dades;
    private String fitxer;
    
    public Controlador() {
        this.dades = new Registres();
        this.fitxer = "dades.dat"; //Fitxer de dades per defecte
    }
    
    public void guardarDades() throws IOException {
            FileOutputStream fos = null;
            ObjectOutputStream os = null;
        try {
            fos = new FileOutputStream(fitxer);
            os = new ObjectOutputStream(fos);
            os.writeObject(dades);
        }
        finally {
            os.close();
            fos.close();
        }
    }
    
    public void carregarDades() throws IOException, ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream is = null;
        
        try {
            fis = new FileInputStream(fitxer);
            is = new ObjectInputStream(fis);
            this.dades = (Registres)(is.readObject());
        }
        finally {
            is.close();
            fis.close();   
        }
    }
}
