package model;

/**
 * Classe Disciplina
 * Author Ghanem Boumalik
 */
public class Disciplina {
    private String codice;
    private String nome;
    private int cfu;
    private Corso corso;
    private Docente docente;

    public Disciplina(String codice, String nome, int cfu, Corso corso) {
        if ("".equals(codice) || "".equals(nome) || cfu <= 0 || corso == null) {
            throw new IllegalArgumentException("Dati non validi per la disciplina.");
        }
        this.codice = codice;
        this.nome = nome;
        this.cfu = cfu;
        this.corso = corso;
        corso.aggiungiDisciplina(this);
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public int getCfu() {
        return cfu;
    }

    public Corso getCorso() {
        return corso;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}