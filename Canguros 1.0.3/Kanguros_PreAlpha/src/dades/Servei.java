
package dades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Aquesta classe defineix el servei donat al client,implementa el constructor 
 * de la classe, el metode getStartDate, getFinishDate, getValoracio, setStart, 
 * setFinish i el metode setValoracio. Els atributs de la classe son dos 
 * Objectes Date on es guarden la data de inici i finalització del servei, i un
 * int on es guarda la valoracio del servei per part del client
 * @author Ivan Sevilla & Martí Huerta
 */
public class Servei implements Serializable {
    
    private Date startDate, finishDate;
    private int valoracio;
    private Persona client;
    private Cangur empleat;
    
    /**
     * Constructor de la Classe Servei
     * @param client
     * @param empleat
     * @param startDate
     * @param finalDate
     * @param valoracio
     */
    public Servei(Persona client, Cangur empleat, Date startDate, Date finalDate, int valoracio) {
        this.startDate = startDate;
        this.finishDate = finalDate;
        this.valoracio = valoracio;
        this.client = client;
        this.empleat = empleat;
    }
    
    //Setters 

    /**
     * Metode per a posar la data del començament del servei
     * @param startDate
     */
    public void setStart(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Metode per a posar la data de la finalització del servei
     * @param finalDate
     */
    public void setFinish(Date finalDate) {
        this.finishDate=finalDate;
    }

    /**
     * Metode per a posar la valoració del servei
     * @param valoracio
     */
    public void setValoracio(int valoracio) {
        this.valoracio=valoracio;
    }
    
    /**
     * Mètode que canvia el client.
     * @param client
     */
    public void setClient(Persona client) {
        this.client = client;
    }
    
    /**
     * Mètode que canvia l'empleat.
     * @param empleat
     */
    public void setEmpleat(Cangur empleat) {
        this.empleat = empleat;
    }
    
    //Getters

    /**
     * Mètode que retorna la data de començament del servei
     * @return Retorna un objecte Date que és la data de començament del 
     * servei
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Mètode que retorna la data de finalitzacio del servei
     * @return Retorna un objecte Date que és la data de finalització 
     * del servei
     */
    public Date getFinishDate() {
        return this.finishDate;
    }

    /**
     * Mètode que retorna la valoracio del client
     * @return Retorna un objecte int que es la valoracio del servei per part 
     * del client
     */
    public int getValoracio() {
        return this.valoracio;
    }
    
    /**
     * Mètode que retorna el client.
     * @return
     */
    public Persona getClient() {
        return this.client;
    }
    
    /**
     * Mètode que retorna l'empleat.
     * @return
     */
    public Cangur getEmpleat() {
        return this.empleat;
    }
    
    //Equals
    /**
     * Mètode que compara dos serveis.
     * @param servei
     * @return 
     */
    @Override
    public boolean equals(Object servei) {
       if(servei instanceof Servei) {
           Servei cmpServei = (Servei) servei;
           return this.startDate == cmpServei.getStartDate()
                   && this.finishDate == cmpServei.getFinishDate()
                   && this.client == cmpServei.getClient()
                   && this.empleat == cmpServei.getEmpleat()
                   && this.valoracio == cmpServei.getValoracio();
       }
       else {
           return false;
       }
    }
    
    /**
     * Hash code
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.startDate);
        hash = 89 * hash + Objects.hashCode(this.finishDate);
        hash = 89 * hash + this.valoracio;
        hash = 89 * hash + Objects.hashCode(this.client);
        hash = 89 * hash + Objects.hashCode(this.empleat);
        return hash;
    }
}
