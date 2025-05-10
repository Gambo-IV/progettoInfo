class Discipline{
    private String codiceDisciplina, nomeDisciplina, codiceCorso;
    private int cfu;

    public Discipline(String codiceDisciplina,String nomeDisciplina,int cfu,String codiceCorso){
        this.codiceDisciplina = codiceDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.cfu = cfu;
        this.codiceCorso = codiceCorso;
    }

    @Override
    public String toString(){
        return codiceDisciplina+";"+nomeDisciplina+";"+cfu+";"+codiceCorso;
    }
}