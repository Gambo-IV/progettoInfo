package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe Appello
 * Author Ghanem Boumalik
 */
public class Appello {
    private LocalDate dataEsame;
    private Disciplina disciplina;
    private Docente docente;
    private ArrayList<Studente> iscritti;

    public Appello(LocalDate dataEsame, Disciplina disciplina, Docente docente) {
        if (dataEsame == null || disciplina == null || docente == null) {
            throw new IllegalArgumentException("Dati non validi per l'appello.");
        }
        this.dataEsame = dataEsame;
        this.disciplina = disciplina;
        this.docente = docente;
        this.iscritti = new ArrayList<>();
    }

    public LocalDate getDataEsame() {
        return dataEsame;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Docente getDocente() {
        return docente;
    }

    public ArrayList<Studente> getIscritti() {
        return iscritti;
    }

    public void aggiungiStudente(Studente studente) {
        if (studente != null && !iscritti.contains(studente)) {
            iscritti.add(studente);
        }
    }
}