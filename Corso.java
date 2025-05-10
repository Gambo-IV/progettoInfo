class Corso{
    private String codiceCorso, nomeCorso;
    private int durataAnni;

    public Corso(String codiceCorso, String nomeCorso, int durataAnni){
        this.codiceCorso = codiceCorso;
        this.nomeCorso = nomeCorso;
        this.durataAnni = durataAnni;
    }

    @Override
    public String toString(){
        return codiceCorso+";"+nomeCorso+";"+durataAnni;
    }
}