package controller;

import java.io.*;
import java.util.ArrayList;
import model.*;


public class GestoreCsv {

    public static boolean letturaStudenti(String fileName, ArrayList<Studente> elencoStudenti) {
        try {
            InputStream input = GestoreCsv.class.getClassLoader().getResourceAsStream("csv/" + fileName);
            if (input == null) {
                System.err.println("File non trovato: " + fileName);
                return false;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parti = line.split(";");
                if (parti.length >= 5) {
                    Studente s = new Studente(parti[0], parti[1], parti[2], parti[3]);
                    elencoStudenti.add(s);
                }
            }

            br.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
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

    public static boolean letturaCorsi(String fileName, ArrayList<Corso> elencoCorsi) {
        try {
            InputStream input = GestoreCsv.class.getClassLoader().getResourceAsStream("csv/" + fileName);
            if (input == null) {
                System.err.println("File non trovato: " + fileName);
                return false;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parti = line.split(";");
                if (parti.length >= 3) {
                    Corso corso = new Corso(parti[0], parti[1], Integer.parseInt(parti[2]));
                    System.out.println("Caricamento corso: " + corso.getCodice() + ", " + corso.getNome() + ", " + corso.getDurata());
                    elencoCorsi.add(corso);
                }
            }

            br.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
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
    
    /*public static boolean modificaCsv(String file, String x, String y, String z){
        ArrayList<String> elenco = new ArrayList();
        try {
            InputStream input = GestoreCsv.class.getClassLoader().getResourceAsStream("csv/" + file);
            if (input == null) {
                System.err.println("File non trovato: " + file);
                return false;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parti = line.split(";");
                for(String parte : parti){
                    elenco.add(parte);
                }
            }

            br.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }*/

    
}