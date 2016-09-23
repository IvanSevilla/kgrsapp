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

    private String direccio, poblacio;
    private float salari;
    private Date naixement;
    
    public Cangur(String dni, String nom, String cognom, String gender, String naixement, String direccio, String poblacio, float salari) throws ParseException {
        super(dni, nom, cognom, gender);
        this.direccio = direccio;
        this.poblacio = poblacio;
        this.salari = salari;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.naixement = formatter.parse(naixement);
    }
    
    //Setters
    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }
    
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }
    
    public void setSalari(float salari) {
        this.salari = salari;
    }
    
    public void setNaixement(String naixement) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.naixement = formatter.parse(naixement);
    }
    
    //Getters
    public String getDireccio() {
        return this.direccio;
    }
    
    public String getPoblacio() {
        return this.poblacio;
    }
    
    public float getSalari() {
        return this.salari;
    }
    
    public Date getNaixement() {
        return this.naixement;
    }
    
    public int getEdat() {
        SimpleDateFormat deformat = new SimpleDateFormat("yyyy");
        return Integer.parseInt(deformat.format(this.naixement));
    }
}
