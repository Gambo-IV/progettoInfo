package model;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Classe Appello
 * Author Ghanem Boumalik
 */
public class Appello {
    private String dataEsame;
    private String id;
    private String codiceDisciplina;
    private ArrayList<Studente> iscritti;

    public Appello(String dataEsame, String id, String codiceDisciplina) {
        if (!"".equals(dataEsame)) {
            throw new IllegalArgumentException("Dati non validi per l'appello.");
        }
        this.dataEsame = dataEsame;
        this.id = id;
        this.codiceDisciplina = codiceDisciplina;
        this.iscritti = new ArrayList<>();
    }

    public String getDataEsame() {
        return dataEsame;
    }

    public String getID() {
        return id;
    }

    public String getDisciplina() {
        return codiceDisciplina;
    }

    public ArrayList<Studente> getIscritti() {
        return iscritti;
    }

    public void aggiungiStudente(Studente studente) {
        if (studente != null && !iscritti.contains(studente)) {
            iscritti.add(studente);
        }
    }
    
    @Override
    public String toString(){
        return id+";"+dataEsame+";"+codiceDisciplina;
    }
}