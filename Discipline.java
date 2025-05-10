class Discipline{
    private String codiceDisciplina, nomeDisciplina, codiceCorso;
    private int cfu;

    public Discipline(String codiceDisciplina,String nomeDisciplina,int cfu,String codiceCorso){
        this.codiceDisciplina = codiceDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.cfu = cfu;
        this.codiceCorso = codiceCorso;
    }

    public String getCodiceDisciplina(){
        return codiceDisciplina;
    }
    public String getNome(){
        return nomeDisciplina;
    }
    public String getCodiceCorso(){
        return codiceCorso;
    }
    public int getCfu(){
        return cfu;
    }
    @Override
    public String toString(){
        return codiceDisciplina+";"+nomeDisciplina+";"+cfu+";"+codiceCorso;
    }
}