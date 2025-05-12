package model;

/**
 * Author Ghanem Boumalik
 */
public class Docente {
    private String matricola;
    private String nome;
    private String cognome;
    private Disciplina disciplina;

    public Docente(String matricola, String nome, String cognome, Disciplina disciplina) {
        if ("".equals(matricola) || "".equals(nome) || "".equals(cognome) || disciplina == null) {
            throw new IllegalArgumentException("Dati non validi per il docente.");
        }
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.disciplina = disciplina;
        disciplina.setDocente(this);
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

    public Disciplina getDisciplina() {
        return disciplina;
    }
}