class Docente{
    private String matricolaDocente, nome, cognome, codiceDisciplina;
    public Docente(String matricolaDocente,String nome,String cognome,String codiceDisciplina){
        this.matricolaDocente = matricolaDocente;
        this.nome = nome;
        this.cognome = cognome;
        this.codiceDisciplina = codiceDisciplina;
    }

    @Override
    public String toString(){
        return matricolaDocente+";"+nome+";"+cognome+";"+codiceDisciplina;
    }
}