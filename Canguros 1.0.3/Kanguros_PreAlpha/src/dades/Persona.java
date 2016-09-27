
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
    private int serveis; //Rebuts o realitzats
    private int phoneNumber;
    
    //Constructor
    /**
     * Constructor de la Classe Persona
     * @param dni
     * @param name
     * @param lastName
     * @param gender
     * @param direccio
     * @param poblacio
     * @param phoneNumber
     */
    public Persona(String dni, String name, String lastName, String gender, String direccio, String poblacio, int phoneNumber){
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.direccio=direccio;
        this.poblacio=poblacio;
        this.phoneNumber=phoneNumber;
        this.serveis = 0;
    }
    
    //equals
    /**
     * Mètode que comprova si el objecte persona que entra es igual, mitjançant 
     * el Dni
     * @param pers
     * @return 
     */
    public boolean equals(Persona pers){
        return this.dni.equals(pers.getDni());
    }
    
    //Getters
    /**
     * Mètode que retorna el Dni
     * @return
     */
    public String getDni(){
        return this.dni;
    }
    
    /**
     * Mètode que retorna el nom
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     * Mètode que retorna el Congom
     * @return
     */
    public String getLastName(){
        return this.lastName;
    }
    
    /**
     * Mètode que retorna el genere
     * @return
     */
    public String getGender(){
        return this.gender;
    }
    
    /**
     * Mètode que retorna la direcció.
     * @return
     */
    public String getDireccio() {
        return this.direccio;
    }
    
    /**
     * Mètode que retorna la població.
     * @return
     */
    public String getPoblacio() {
        return this.poblacio;
    }

    /**
     * Mètode que retorna el nombre de telèfon.
     * @return
     */
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    
    //Setters

    /**
     * Mètode que canvia el dni.
     * @param dni
     */
    public void setDni(String dni){
        this.dni = dni;
    }

    /**
     * Mètode que canvia el nom
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Mètode que canvia el cognom
     * @param lastName
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * Mètode que canvia el gènere.
     * @param gender
     */
    public void setGender(String gender){
        this.gender = gender;
    }
    
    /**
     * Mètode que canvia la direcció.
     * @param direccio
     */
    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }
    
    /**
     * Mètode que canvia la població.
     * @param poblacio
     */
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    /**
     * Mètode que canvia el nombre de telèfon.
     * @param phoneNumber
     */
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    
    public int getServeis() {
        return this.serveis;
    }
    
    public void setServeis(int serv) throws Exception {
        if (serv < 0) {
            throw new Exception("els serveis no poden ser negatius.");
        }
        else {
            this.serveis = serv;
        }
    }
}
