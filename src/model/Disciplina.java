package model;

/**
 * Classe Disciplina
 * Author Ghanem Boumalik
 */
public class Disciplina {
    private String codice;
    private String nome;
    private int cfu;
    private String corso;

    public Disciplina(String codice, String nome, int cfu, String corso) {
        if ("".equals(codice) || "".equals(nome) || cfu <= 0 || corso == null) {
            throw new IllegalArgumentException("Dati non validi per la disciplina.");
        }
        this.codice = codice;
        this.nome = nome;
        this.cfu = cfu;
        this.corso = corso;
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

    public String getCorso() {
        return corso;
    }
    
    @Override
    public String toString(){
        return codice+";"+nome+";"+cfu+";"+corso;
    }
}