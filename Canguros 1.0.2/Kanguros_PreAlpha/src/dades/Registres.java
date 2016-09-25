package dades;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que s'encarregarà de guardar els registres dels empleats, clients i serveis.
 * @author Iván Sevilla & Marti Huerta
 */
public class Registres implements Serializable {
    private ArrayList<Cangur> empleats;
    private ArrayList<Servei> serveis;
    private ArrayList<Persona> clients;
    
    public Registres() {
        this.empleats = new ArrayList<>();
        this.serveis = new ArrayList<>();
        this.clients = new ArrayList<>();
    }
    
    /**
     *
     * @param nouEmpleat
     * @throws Exception
     */
    public void afegirCangur(Cangur nouEmpleat) throws Exception {
        if (!this.empleats.contains(nouEmpleat)) {
            this.empleats.add(nouEmpleat);
        }
        else {
            throw new Exception("L'empleat ja existeix al registre.");
        }
    }
    
    /**
     *
     * @param nouServei
     * @throws Exception
     */
    public void afegirServei(Servei nouServei) throws Exception {
        if (!this.serveis.contains(nouServei)) {
            this.serveis.add(nouServei);
        }
        else {
            throw new Exception("El servei ja ha sigut afegit anteriorment.");
        }
    }
    
    /**
     *
     * @param nouClient
     * @throws Exception
     */
    public void afegirClient(Persona nouClient) throws Exception {
        if (!this.clients.contains(nouClient)) {
            this.clients.add(nouClient);
        }
        else {
            throw new Exception("El client ja existeix al registre.");
        }
    }
    
    /**
     *
     * @param empleat
     * @throws Exception
     */
    public void treureCangur(Cangur empleat) throws Exception {
        if (this.empleats.contains(empleat)) {
            throw new Exception("L'empleat no existeix al registre.");
        }
        else {
            this.empleats.remove(empleat);
        }
    }
    
    /**
     *
     * @param servei
     * @throws Exception
     */
    public void treureServei(Servei servei) throws Exception {
        if (this.serveis.contains(servei)) {
            throw new Exception("El servei no existeix al registre.");
        }
        else {
            this.serveis.remove(servei);
        }
    }
    
    /**
     *
     * @param client
     * @throws Exception
     */
    public void treureClient(Persona client) throws Exception {
        if (this.clients.contains(client)) {
            throw new Exception("El client no existeix al registre.");
        }
        else {
            this.clients.remove(client);
        }
    }
}
