package dades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

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
    
    /**
     * Retorna una llista dels Cangurs ordenats en ordre alfabètic per cognom.
     * @return Un ArrayList d'Strings
     */
    public ArrayList<String> getNomCangurs() {
        ArrayList<String> resultat = new ArrayList<>();
        for(int i = 0; i < this.empleats.size(); i++) {
            resultat.add(this.empleats.get(i).getLastName() + ", " + this.empleats.get(i).getName());
        }
        //Ordenem en ordre alfabètic
        Collections.sort(resultat);
        return resultat;
    }
    
    /**
     * Retorna una llista dels Clients ordenats en ordre alfabètic per cognom.
     * @return Un ArrayList d'Strings
     */
    public ArrayList<String> getNomClients() {
        ArrayList<String> resultat = new ArrayList<>();
        for(int i = 0; i < this.clients.size(); i++) {
            resultat.add(this.clients.get(i).getLastName() + ", " + this.clients.get(i).getName());
        }
        //Ordenem en ordre alfabètic
        Collections.sort(resultat);
        return resultat;
    }
    
    public Cangur getCangur(String dni) throws Exception {
        for (Cangur empleat : this.empleats) {
            if (empleat.getDni().equals(dni)) {
                return empleat;
            }
        }
        throw new Exception("no s'ha trobat l'empleat amb el dni " + dni);
    }
    
    public Persona getClient(String dni) throws Exception {
        for (Persona client : this.clients) {
            if (client.getDni().equals(dni)) {
                return client;
            }
        }
        throw new Exception("no s'ha trobat el client amb el dni " + dni);
    }
    
    
    
}
