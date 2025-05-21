package model;

import java.util.ArrayList;

/**
 * Classe Studente
 * Author Ghanem Boumalik
 */
public class Studente {
    private String matricola;
    private String nome;
    private String cognome;
    private String corso;
    private ArrayList<Appello> appelliIscritti;

    public Studente(String matricola, String nome, String cognome, String corso) {
        if ("".equals(matricola) || "".equals(nome) || "".equals(cognome) || corso == null) {
            throw new IllegalArgumentException("Dati non validi per lo studente.");
        }
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.corso = corso;
        this.appelliIscritti = new ArrayList<>();
    }

    public String getMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCorso() {
        return corso;
    }

    public ArrayList<Appello> getAppelliIscritti() {
        return appelliIscritti;
    }

    public void iscriviAppello(Appello appello) {
        if (appello != null && !appelliIscritti.contains(appello)) {
            appelliIscritti.add(appello);
            appello.aggiungiStudente(this);
        }
    }
    
    @Override
    public String toString(){
        return matricola+";"+nome+";"+cognome+";"+corso;
    }
}