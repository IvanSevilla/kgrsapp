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
     * @param phoneNumber
     * @throws ParseException
     */
    public Cangur(String dni, String nom, String cognom, String gender, String naixement, String direccio, String poblacio, float salari, int phoneNumber) throws ParseException {
        super(dni, nom, cognom, gender, direccio, poblacio,phoneNumber);
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
     * Metode que retorna la edat del treballador
     * @return Retorna un int amb la edat del treballador
     */
    public int getEdat() {
        SimpleDateFormat deformat = new SimpleDateFormat("yyyy");
        Date data=new Date();
        return Integer.parseInt(deformat.format(data.getTime()-this.naixement.getTime()));
    }

}
