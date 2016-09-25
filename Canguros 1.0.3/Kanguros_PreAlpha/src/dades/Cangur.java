package dades;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe abstracta que representa a l'empleat.
 * @author Ivan Sevilla & Martí Huerta
 */
public class Cangur extends Persona implements Serializable {
    
    //private Servei serv;
    private float salari;
    private Date naixement;
    
    /**
     *
     * @param dni
     * @param nom
     * @param cognom
     * @param gender
     * @param naixement
     * @param direccio
     * @param poblacio
     * @param salari
     * @throws ParseException
     */
    public Cangur(String dni, String nom, String cognom, String gender, String naixement, String direccio, String poblacio, float salari) throws ParseException {
        super(dni, nom, cognom, gender, direccio, poblacio);
        this.salari = salari;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.naixement = formatter.parse(naixement);
    }
    
    //Setters
    
    /**
     *
     * @param salari
     */
    public void setSalari(float salari) {
        this.salari = salari;
    }
    
    /**
     *
     * @param naixement
     * @throws ParseException
     */
    public void setNaixement(String naixement) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.naixement = formatter.parse(naixement);
    }
    
    //Getters

    
    /**
     *
     * @return
     */
    public float getSalari() {
        return this.salari;
    }
    
    /**
     *
     * @return
     */
    public Date getNaixement() {
        return this.naixement;
    }
    
    /**
     *
     * @return
     */
    public int getEdat() {
        SimpleDateFormat deformat = new SimpleDateFormat("yyyy");
        return Integer.parseInt(deformat.format(this.naixement));
    }
}
