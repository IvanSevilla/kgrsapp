package dades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Classe que s'encarregarà de guardar els registres dels empleats, clients i serveis.
 * @author Ivan Sevilla & Martí Huerta
 */
public class Registres implements Serializable {
    private ArrayList<Cangur> empleats;
    private ArrayList<Servei> serveis;
    private ArrayList<Persona> clients;
    
    /**
     * Constructor de registres.
     */
    public Registres() {
        this.empleats = new ArrayList<>();
        this.serveis = new ArrayList<>();
        this.clients = new ArrayList<>();
    }
    
    /**
     * Mètode que afegeix un cangur.
     * @param nouEmpleat
     * @throws Exception
     */
    public void afegirCangur(Cangur nouEmpleat) throws Exception {
        if (!this.empleats.contains(nouEmpleat)) {
            this.empleats.add(nouEmpleat);
        }
        else {
            throw new Exception("l'empleat ja existeix al registre.");
        }
    }
    
    /**
     * Mètode que afegeix un servei.
     * @param nouServei
     * @throws Exception
     */
    public void afegirServei(Servei nouServei) throws Exception {
        if (!this.serveis.contains(nouServei)) {
            this.serveis.add(nouServei);
        }
        else {
            throw new Exception("el servei ja ha sigut afegit anteriorment.");
        }
    }
    
    /**
     * Mètode que afegeix un client.
     * @param nouClient
     * @throws Exception
     */
    public void afegirClient(Persona nouClient) throws Exception {
        if (!this.clients.contains(nouClient)) {
            this.clients.add(nouClient);
        }
        else {
            throw new Exception("el client ja existeix al registre.");
        }
    }
    
    /**
     * Mètode que treu un cangur.
     * @param empleat
     * @throws Exception
     */
    public void treureCangur(Cangur empleat) throws Exception {
        if (this.empleats.contains(empleat)) {
            throw new Exception("l'empleat no existeix al registre.");
        }
        else {
            this.empleats.remove(empleat);
        }
    }
    
    /**
     * Mètode que treu un servei.
     * @param servei
     * @throws Exception
     */
    public void treureServei(Servei servei) throws Exception {
        if (this.serveis.contains(servei)) {
            throw new Exception("el servei no existeix al registre.");
        }
        else {
            this.serveis.remove(servei);
        }
    }
    
    /**
     * Mètode que treu un client.
     * @param client
     * @throws Exception
     */
    public void treureClient(Persona client) throws Exception {
        if (this.clients.contains(client)) {
            throw new Exception("el client no existeix al registre.");
        }
        else {
            this.clients.remove(client);
        }
    }
    
    /**
     * Retorna una llista dels Cangurs ordenats en ordre alfabètic per cognom.
     * @return Un ArrayList de Cangurs
     */
    public ArrayList<Cangur> getCangurs() {
        Collections.sort(this.empleats, new Comparator<Cangur>() {
            @Override
            public int compare(Cangur cang1, Cangur cang2) {
                return  (cang1.getLastName()).compareTo(cang2.getLastName());
            }
        });
        
        return this.empleats;
    }
    
    /**
     * Retorna una llista dels Clients ordenats en ordre alfabètic per cognom.
     * @return Un ArrayList de Clients
     */
    public ArrayList<Persona> getClients() {
        Collections.sort(this.clients, new Comparator<Persona>() {
            @Override
            public int compare(Persona client1, Persona client2) {
                return  (client1.getLastName()).compareTo(client2.getLastName());
            }
        });
        
        return this.clients;
    }
    
    /**
     * Retorna un cangur amb el dni especificat.
     * @param dni
     * @return
     * @throws Exception
     */
    public Cangur getCangurPerDni(String dni) throws Exception {
        for (Cangur empleat : this.empleats) {
            if (empleat.getDni().equals(dni)) {
                return empleat;
            }
        }
        throw new Exception("no s'ha trobat l'empleat amb el dni " + dni + ".");
    }
    
    /**
     * Mètode que retorna un cangur utilitzant la seva posició a la llista.
     * @param id
     * @return
     * @throws Exception
     */
    public Cangur getCangur(int id) throws Exception {
        if (id >= this.empleats.size() || id < 0) {
            throw new Exception("el client no existeix.");
        }
        else {
            return this.empleats.get(id);
        }
    }
    
    /**
     * Retorna un client amb el dni especificat.
     * @param dni
     * @return
     * @throws Exception
     */
    public Persona getClientPerDni(String dni) throws Exception {
        for (Persona client : this.clients) {
            if (client.getDni().equals(dni)) {
                return client;
            }
        }
        throw new Exception("no s'ha trobat el client amb el dni " + dni + ".");
    }
    
    /**
     * Retorna el cliend amb l'id especificat.
     * @param id
     * @return
     * @throws Exception
     */
    public Persona getClient(int id) throws Exception {
        if (id >= this.clients.size() || id < 0) {
            throw new Exception("el client no existeix.");
        }
        else {
            return this.clients.get(id);
        }
    }
    
    /**
     * Retorna un servei per posició.
     * @param id
     * @return
     * @throws Exception
     */
    public Servei getServei(int id) throws Exception {
        if (id >= this.clients.size() || id < 0) {
            throw new Exception("el servei no existeix.");
        }
        else {
            return this.serveis.get(id);
        }
    }
    
    /**
     * Retorna el nombre de serveis.
     * @return
     */
    public int getNombreServeis() {
        return this.serveis.size();
    }

    /**
     * Retorna una llista amb els empleats.
     * @return
     */
    public ArrayList<Cangur> getCangurArray() {
        return this.empleats;
    }

    public Cangur getMillorCangur() throws Exception {
        if (this.empleats.isEmpty()) {
            throw new Exception("no hi ha cangurs.");
        }
        
        Cangur millor = this.empleats.get(0);
        for (Cangur cang : this.empleats) {
            if (cang.getServeis() > millor.getServeis()) {
                millor = cang;
            }
        }
        return millor;
    }
    
    public Persona getMillorClient() throws Exception {
        if (this.clients.isEmpty()) {
            throw new Exception("no hi ha clients.");
        }
        
        Persona millor = this.clients.get(0);
        for (Persona client : this.clients) {
            if (client.getServeis() > millor.getServeis()) {
                millor = client;
            }
        }
        return millor;
    }
}
