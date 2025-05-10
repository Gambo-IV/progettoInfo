class Studente{
    private String matricolaStudente, nome, cognome, codiceCorso;
    public Studente(String matricolaStudente,String nome,String cognome,String codiceCorso){
        this.matricolaStudente = matricolaStudente;
        this.nome = nome;
        this.cognome = cognome;
        this.codiceCorso = codiceCorso;
    }
    
    @Override
    public String toString(){
        return matricolaStudente+";"+nome+";"+cognome+";"+codiceCorso;
    }
}