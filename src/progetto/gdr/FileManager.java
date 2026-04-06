/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author lin.elena
 */
public class FileManager {
    public static void writeCSV(String path, String dati) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write(dati);
        }
    }
    
    public static String readCSV(String path) throws FileNotFoundException, IOException{
        String dati;
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            dati = reader.readLine();
        }
        return dati;
    }
    
    public static void serializza(String path, GameManager gm) throws FileNotFoundException, IOException{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(gm);
        }
    }
    
    public static GameManager deserializza(String path) throws FileNotFoundException, IOException, ClassNotFoundException{
        GameManager gm;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            gm = (GameManager) ois.readObject();
        }
        return gm; 
    }
}
