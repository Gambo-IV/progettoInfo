package controller;

import java.io.*;
import java.util.ArrayList;

public class GestoreCsv {

    public static boolean letturaStudenti(String file, ArrayList<Studente> elencoStudenti) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            char[] buffer = new char[1024];
            int bytesRead;
            StringBuilder lineBuilder = new StringBuilder();

            while ((bytesRead = br.read(buffer, 0, buffer.length)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    char c = buffer[i];
                    if (c == '\n') {
                        processaRigaStudenti(lineBuilder.toString(), elencoStudenti);
                        lineBuilder.setLength(0); // Resetta per la prossima riga
                    } else {
                        lineBuilder.append(c);
                    }
                }
            }
            // Processa eventuale ultima riga senza newline
            if (lineBuilder.length() > 0) {
                processaRigaStudenti(lineBuilder.toString(), elencoStudenti);
            }
            return true;
        } catch (FileNotFoundException ex) {
            System.err.println("Errore: File non trovato - " + ex.getMessage());
        } catch (IOException ex2) {
            System.err.println("Errore di I/O durante la lettura del file - " + ex2.getMessage());
        }
        return false;
    }

    private static void processaRigaStudenti(String linea, ArrayList<Studente> elencoStudenti) {
        String[] campi = linea.split(";");
        if (campi.length == 4) {
            String nome = campi[0];
            String cognome = campi[1];
            String matricola = campi[2];
            String codiceCorso = campi[3];
            elencoStudenti.add(new Studente(nome, cognome, matricola, codiceCorso));
        }
    }

    public static boolean letturaCorsi(String file, ArrayList<Corso> elencoCorsi) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            char[] buffer = new char[1024];
            int bytesRead;
            StringBuilder lineBuilder = new StringBuilder();

            while ((bytesRead = br.read(buffer, 0, buffer.length)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    char c = buffer[i];
                    if (c == '\n') {
                        processaRigaCorsi(lineBuilder.toString(), elencoCorsi);
                        lineBuilder.setLength(0); // Resetta per la prossima riga
                    } else {
                        lineBuilder.append(c);
                    }
                }
            }
            // Processa eventuale ultima riga senza newline
            if (lineBuilder.length() > 0) {
                processaRigaCorsi(lineBuilder.toString(), elencoCorsi);
            }
            return true;
        } catch (FileNotFoundException ex) {
            System.err.println("Errore: File non trovato - " + ex.getMessage());
        } catch (IOException ex2) {
            System.err.println("Errore di I/O durante la lettura del file - " + ex2.getMessage());
        }
        return false;
    }

    private static void processaRigaCorsi(String linea, ArrayList<Corso> elencoCorsi) {
        String[] campi = linea.split(";");
        if (campi.length == 3) {
            String codiceCorso = campi[0];
            String nomeCorso = campi[1];
            int durataAnni = Integer.parseInt(campi[2]);
            elencoCorsi.add(new Corso(codiceCorso, nomeCorso, durataAnni));
        }
    }

    // Stessi approcci per le altre entità (Discipline, Docenti, Appelli, IscrizioniAppelli)
    // Ad esempio:
    private static void processaRigaGenerica(String linea, ArrayList<?> elenco) {
        // Esegui parsing e aggiungi l'oggetto alla lista
    }
}