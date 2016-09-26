/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dades.Cangur;
import dades.Persona;
import dades.Registres;
import dades.Servei;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Marti Huerta Climent
 */
public class Controlador {
    
    private Registres dades;
    private String fitxer;
    
    /**
     *
     */
    public Controlador() {
        this.dades = new Registres();
        this.fitxer = "dades.dat"; //Fitxer de dades per defecte
    }
    
    /**
     * @throws java.lang.Exception
     */
    public void guardarDades() throws Exception {
        FileOutputStream fileOut;
        ObjectOutputStream out;
        
        try {
            fileOut = new FileOutputStream(fitxer);
        } catch (FileNotFoundException ex) {
            throw new Exception("no s'ha trobat el fitxer per guardar les dades.");
        }
        
        try {
            out = new ObjectOutputStream(fileOut);
        } catch (IOException ex) {
            throw new Exception("no s'ha pogut obrir el canal d'escriptura.");
        }
        
        try {
            out.writeObject(this.dades);
        } 
        catch (IOException i) {
            throw new Exception("no s'han pogut escriure les dades.");
        }
        
        finally {
            try {
                out.close();
            } catch (IOException ex) {
                throw new Exception("no s'ha pogut tancar el canal d'escriptura correctament.");
            }
            try {
                fileOut.close();
            } catch (IOException ex) {
                throw new Exception("no s'ha pogut tancar el fitxer correctament.");
            }
        }
    }
    
    /**
     *
     * @throws java.lang.Exception
     */
    public void carregarDades() throws Exception {
        FileInputStream fileIn;
        ObjectInputStream in;
        
        try {
            fileIn = new FileInputStream(fitxer);
        } catch (FileNotFoundException ex) {
            throw new Exception("no s'ha trobat el fitxer.");
        }
        
        try {
            in = new ObjectInputStream(fileIn);
        } catch (IOException ex) {
            throw new Exception("no s'ha pogut obrir el fitxer.");
        }
        
        try {            
            this.dades = (Registres)(in.readObject());           
        }
        catch (IOException | ClassNotFoundException i) {
            throw new Exception("no s'ha pogut llegir el fitxer.");
        }      
        finally {
            
            try {
                in.close();
            } catch (IOException ex) {
                throw new Exception("no s'ha pogut tancar el canal de lectura correctament.");
            }
            
            try {
                fileIn.close();
            } catch (IOException ex) {
                throw new Exception("no s'ha pogut tancar el fitxer correctament.");
            }
        }   
    }

    /**
     *
     * @param nouEmpleat
     * @throws Exception
     */
    public void addWorker(Cangur nouEmpleat) throws Exception {
        this.dades.afegirCangur(nouEmpleat);
    }

    /**
     *
     * @param nouClient
     * @throws Exception
     */
    public void addClient(Persona nouClient) throws Exception {
        this.dades.afegirClient(nouClient); 
    }

    /**
     * Metode que retorna la llista dels treballadors
     * @return
     */
    public ArrayList<String> mostraCangur() {
        ArrayList<String> retorna = new ArrayList<>();
        for(Cangur c : this.dades.getCangurs()) {
            retorna.add(c.getLastName() + ", " + c.getName());
        }
        
        return retorna;
    }

    /**
     * Metode que retorna un treballador
     * @param selectedIndex
     * @return
     * @throws java.lang.Exception
     */
    public Cangur getWorker(int selectedIndex) throws Exception {
        return this.dades.getCangur(selectedIndex);
    }
     /**
     * Metode que retorna un client
     * @param selectedIndex
     * @return
     * @throws java.lang.Exception
     */
    public Persona getClient(int selectedIndex) throws Exception {
        return this.dades.getClient(selectedIndex);
    }
    
     /**
     * Metode que retorna un servei
     * @param selectedIndex
     * @return
     * @throws java.lang.Exception
     */
    public Servei getService(int selectedIndex) throws Exception {
        return this.dades.getServei(selectedIndex);
    }
    
    /**
     * Metode que retorna la llista dels clients
     * @return
     */
    public ArrayList<String> mostraClient() {
        ArrayList<String> retorna = new ArrayList<>();
        for(Persona c : this.dades.getClients()) {
            retorna.add(c.getLastName() + ", " + c.getName());
        }
        
        return retorna;
    }

    /**
     * Metode que retorna la llista dels serveis
     * @return
     */
    public ArrayList<String> mostraService() {
        ArrayList<String> retorna = new ArrayList<>();
        for(int i = 0; i < this.dades.getNombreServeis(); i++) {
            retorna.add("#" + (i + 1));
        }
        return retorna;
    }
}
