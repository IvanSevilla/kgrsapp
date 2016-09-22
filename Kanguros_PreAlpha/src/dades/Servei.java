
package dades;

import java.util.Date;

/**
 * Aquesta classe defineix el servei donat al client,implementa el constructor 
 * de la classe, el metode getStartDate, getFinishDate, getValoracio, setStart, 
 * setFinish i el metode setValoracio. Els atributs de la classe son dos 
 * Objectes Date on es guarden la data de inici i finalització del servei, i un
 * int on es guarda la valoracio del servei per part del client
 * @author Ivan Sevilla & Martí Huerta
 */
public class Servei {
    
    private Date startDate, finishDate;
    private int valoracio;
    //Contructor
    /**
     * Constructor de la Classe Servei
     * @param startDate
     * @param finalDate
     * @param valoracio
     */
    public Servei(Date startDate, Date finalDate, int valoracio){
        this.startDate = startDate;
        this.finishDate = finalDate;
        this.valoracio = valoracio;
    }
    //Setters 

    /**
     * Metode per a posar la data del començament del servei
     * @param startDate
     */
    public void setStart(Date startDate){
        this.startDate = startDate;
    }

    /**
     * Metode per a posar la data de la finalització del servei
     * @param finalDate
     */
    public void setFinish(Date finalDate){
        this.finishDate=finalDate;
    }

    /**
     * Metode per a posar la valoració del servei
     * @param valoracio
     */
    public void setValoracio(int valoracio){
        this.valoracio=valoracio;
    }
    //Getters

    /**
     * Mètode que retorna la data de començament del servei
     * @return Retorna un objecte Date que és la data de començament del 
     * servei
     */
    public Date getStartDate(){
        return this.startDate;
    }

    /**
     * Mètode que retorna la data de finalitzacio del servei
     * @return Retorna un objecte Date que és la data de finalització 
     * del servei
     */
    public Date getFinishDate(){
        return this.finishDate;
    }

    /**
     * Mètode que retorna la valoracio del client
     * @return Retorna un objecte int que es la valoracio del servei per part 
     * del client
     */
    public int getValoracio(){
        return this.valoracio;
    }
}
