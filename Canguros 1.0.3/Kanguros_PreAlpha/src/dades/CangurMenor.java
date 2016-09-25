package dades;

import java.io.Serializable;
import java.text.ParseException;

/**
 *
 * @author Iván Sevilla & Marti Huerta
 */
public class CangurMenor extends Cangur implements Serializable {
    
    private Persona aval;
    
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
     * @param aval
     * @param phoneNumber
     * @throws ParseException
     */
    public CangurMenor(String dni, String nom, String cognom, String gender, String naixement, String direccio, String poblacio, float salari, Persona aval, int phoneNumber) throws ParseException {
        super(dni, nom, cognom, gender, naixement, direccio, poblacio, salari,phoneNumber);
        this.aval = aval;
    }
    
    /**
     *
     * @param newAval
     */
    public void setAval(Persona newAval) {
        this.aval = newAval;
    }
    
    /**
     *
     * @return
     */
    public Persona getAval() {
        return this.aval;
    }
    
}
