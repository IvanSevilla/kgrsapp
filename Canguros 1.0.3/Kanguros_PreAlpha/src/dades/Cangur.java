package dades;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.lang.Exception;

/**
 * Classe abstracta que representa a l'empleat.
 * @author Ivan Sevilla & Martí Huerta
 */
public class Cangur extends Persona implements Serializable {
    
    private ArrayList<Servei> servei;
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
        this.servei=new ArrayList<>();
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

    /**
     *
     * @param serv
     * @throws Exception
     */
    public void setServei(Servei serv) throws Exception{
        if(!this.servei.contains(serv)){
            this.servei.add(serv);
        }
        else{
        throw new Exception();
        }
        
        
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

    /**
     * Metode que retorna un servei realitzat
     * @param i
     * @return
     */
    public Servei getServei(int i){
        return this.servei.get(i);
    }
}
