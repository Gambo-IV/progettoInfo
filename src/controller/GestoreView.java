/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author gambonig
 */
public class GestoreView {
    public static boolean modificaCsv(String file, String x, String y, String z) throws IOException{
        ArrayList<String> elenco = new ArrayList();
        FileWriter fw = new FileWriter(file, true);
        try {
            InputStream input = GestoreCsv.class.getClassLoader().getResourceAsStream("csv/" + file);
            if (input == null) {
                System.err.println("File non trovato: " + file);
                return false;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] parti = line.split(";");
                for(String parte : parti){
                    fw.append(parte+";");
                    fw.append(parte+";");
                    fw.append(parte+"\n");
                }
            }
            fw.append(x+";");
            fw.append(y+";");
            fw.append(z+"\n");
            fw.close();
            br.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public static boolean modificaCsv2(String file,String s,String x, String y, String z) throws IOException{
        ArrayList<String> elenco = new ArrayList();
        FileWriter fw = new FileWriter(file, true);
        try {
            InputStream input = GestoreCsv.class.getClassLoader().getResourceAsStream("csv/" + file);
            if (input == null) {
                System.err.println("File non trovato: " + file);
                return false;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] parti = line.split(";");
                for(String parte : parti){
                    fw.append(parte+";");
                    fw.append(parte+";");
                    fw.append(parte+";");
                    fw.append(parte+"\n");
                }
            }
            fw.append(s+";");
            fw.append(x+";");
            fw.append(y+";");
            fw.append(z+"\n");
            fw.close();
            br.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean modificaCsv3(String file,String y, String z) throws IOException{
        ArrayList<String> elenco = new ArrayList();
        FileWriter fw = new FileWriter(file, true);
        try {
            InputStream input = GestoreCsv.class.getClassLoader().getResourceAsStream("csv/" + file);
            if (input == null) {
                System.err.println("File non trovato: " + file);
                return false;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] parti = line.split(";");
                for(String parte : parti){
                    
                    fw.append(parte+";");
                    fw.append(parte+"\n");
                }
            }
            
            fw.append(y+";");
            fw.append(z+"\n");
            fw.close();
            br.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
