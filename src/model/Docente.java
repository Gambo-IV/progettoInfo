package model;

/**
 * Author Ghanem Boumalik
 */
public class Docente {
    private String matricola;
    private String nome;
    private String cognome;
    private String disciplina;

    public Docente(String matricola, String nome, String cognome, String disciplina) {
        if ("".equals(matricola) || "".equals(nome) || "".equals(cognome) || disciplina == null) {
            throw new IllegalArgumentException("Dati non validi per il docente.");
        }
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.disciplina = disciplina;
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

    public String getDisciplina() {
        return disciplina;
    }
    
    @Override
    public String toString(){
        return matricola+";"+nome+";"+cognome+";"+disciplina;
    }
}