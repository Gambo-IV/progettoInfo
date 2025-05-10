class Studente{
    private String matricolaStudente, nome, cognome, codiceCorso;
    public Studente(String matricolaStudente,String nome,String cognome,String codiceCorso){
        this.matricolaStudente = matricolaStudente;
        this.nome = nome;
        this.cognome = cognome;
        this.codiceCorso = codiceCorso;
    }
    
    public String getMatricolaStudente(){
        return matricolaStudente;
    }
    public String getNomeStudente(){
        return nome;
    }
    public String getCognomeStudente(){
        return cognome;
    }
    public String getCodiceCorso(){
        return codiceCorso;
    }
    
    @Override
    public String toString(){
        return matricolaStudente+";"+nome+";"+cognome+";"+codiceCorso;
    }
}