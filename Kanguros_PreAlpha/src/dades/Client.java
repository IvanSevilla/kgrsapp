
package dades;

import java.util.ArrayList;

/**
 * Aquesta classe defineix el client a partir de la herencia de Persona,
 * implementa el constructor de la classe, el metode getServei i el metode 
 * addServei. Els atributs de la classe son els mateixos dels de Persona més una 
 * arrayList de Servei on guardarem els serveis que es realitzaran per al client
 * @author Ivan Sevilla & Martí Huerta
 * @see Persona
 * @see Servei
 * @version 0.1_Pre_Alpha
 */
public class Client extends Persona {
    private ArrayList<Servei> service;
    //Constructor

    /**
     * Métode constructor de la classe Client
     * @param dni
     * @param name
     * @param lastName
     * @param gender
     */
    public Client(String dni, String name, String lastName, String gender) {
        super(dni, name, lastName, gender);
        this.service = new ArrayList<>();
    }
    //Metodes de Modificació

    /**
     * Metode de addició del servei donat al client
     * @param ser
     */
    public void addServei(Servei ser) {
        this.service.add(ser);
    }
    //Getter

    /**
     * Metode que ens retorna un Servei donat al client
     * @param i
     * @return retorna un objecte Servei
     * @throws Exception
     */
    public Servei getServei(int i) throws Exception {
        return this.service.get(i);
    }
    
}
