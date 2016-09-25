
package dades;

import java.io.Serializable;

/**
 * Aquesta classe defineix el a un Objecte anomenat persona, implementa el 
 * constructor de la classe, el metode getDni, getGender, getName, getLastName,
 * setDni, setGender, setName, setLastName i el metode equals.
 * Els atributs de la classe son quatre strings on es guardaran les 
 * caracteristiques principals de una persona, el Dni, el Nom, el Cognom i el 
 * seu genere.
 * @author Ivan Sevilla & Martí Huerta
 * @version 0.1_Pre_Alpha
 */
public class Persona implements Serializable {
    
    private String dni, name, lastName, gender, direccio, poblacio;
    //Constructor
    /**
     * Constructor de la Classe Persona
     * @param dni
     * @param name
     * @param lastName
     * @param gender
     * @param direccio
     * @param poblacio
     */
    public Persona(String dni, String name, String lastName, String gender, String direccio, String poblacio){
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.direccio=direccio;
        this.poblacio=poblacio;
    }
    //equals
    /**
     * Metode que comprova si el objecte persona que entra es igual, mitjançant 
     * el Dni
     * @param pers
     * @return 
     */
    public boolean equals(Persona pers){
        return this.dni.equals(pers.getDni());
    }
    //Getters
    /**
     * Metode que retorna el Dni
     * @return
     */
    public String getDni(){
        return this.dni;
    }
    
    /**
     * Metode que retorna el nom
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     * Metode que retorna el Congom
     * @return
     */
    public String getLastName(){
        return this.lastName;
    }
    
    /**
     * Metode que retorna el genere
     * @return
     */
    public String getGender(){
        return this.gender;
    }
    
    /**
     *
     * @return
     */
    public String getDireccio() {
        return this.direccio;
    }
    
    /**
     *
     * @return
     */
    public String getPoblacio() {
        return this.poblacio;
    }
    //Setters

    /**
     * Metode que canvia el dni
     * @param dni
     */
    public void setDni(String dni){
        this.dni = dni;
    }

    /**
     * Metode que canvia el nom
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Metode que canvia el cognom
     * @param lastName
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * Metode que canvia el genere
     * @param gender
     */
    public void setGender(String gender){
        this.gender = gender;
    }
      /**
     *
     * @param direccio
     */
    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }
    
    /**
     *
     * @param poblacio
     */
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }
    
}
