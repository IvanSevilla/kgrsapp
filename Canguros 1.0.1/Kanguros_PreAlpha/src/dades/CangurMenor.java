package dades;

import java.text.ParseException;

/**
 *
 * @author Iván Sevilla & Marti Huerta
 */
public class CangurMenor extends Cangur {
    
    private Persona aval;
    
    public CangurMenor(String dni, String nom, String cognom, String gender, String naixement, String direccio, String poblacio, float salari, Persona aval) throws ParseException {
        super(dni, nom, cognom, gender, naixement, direccio, poblacio, salari);
        this.aval = aval;
    }
    
    public void setAval(Persona newAval) {
        this.aval = newAval;
    }
    
    public Persona getAval() {
        return this.aval;
    }
    
}
