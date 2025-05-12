package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Corso
 * Author Ghanem Boumalik
 */
public class Corso {
    private String codice;
    private String nome;
    private int durata;
    private ArrayList<Disciplina> discipline;

    public Corso(String codice, String nome, int durata) {
        if ("".equals(codice) || "".equals(nome) || durata <= 0) {
            throw new IllegalArgumentException("Dati non validi per il corso.");
        }
        this.codice = codice;
        this.nome = nome;
        this.durata = durata;
        this.discipline = new ArrayList<>();
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public int getDurata() {
        return durata;
    }

    public ArrayList<Disciplina> getDiscipline() {
        return discipline;
    }

    public void aggiungiDisciplina(Disciplina disciplina) {
        if (disciplina != null) {
            discipline.add(disciplina);
        }
    }
}