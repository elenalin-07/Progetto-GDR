/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author lin.elena
 */
public class FileManager {
    public static void writeCSV(String fileCSV, String dati) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileCSV))){
            writer.write(dati);
        }
    }
    
    public static String readCSV(String fileCSV) throws FileNotFoundException, IOException{
        String dati;
        try(BufferedReader reader = new BufferedReader(new FileReader(fileCSV))){
            dati = reader.readLine();
        }
        return dati;
    }
    
    public void writeBinary(String fileBinary, Personaggio p) throws FileNotFoundException, IOException{
        try(RandomAccessFile raf = new RandomAccessFile(fileBinary, "rw")){
            raf.writeUTF(p.getNome());
            raf.writeInt(p.getSalute());
            raf.writeInt(p.getSete());
            raf.writeInt(p.getFame());
            raf.writeInt(p.getAttaco());
            raf.writeInt(p.getNAcqua());
            raf.writeInt(p.getNCibo());
            raf.writeInt(p.getNMedicine());
            raf.writeInt(p.getMaxSalute());
        }
    }
    
    public Personaggio readBinary(String fileBinary) throws FileNotFoundException, IOException{
        Personaggio p = null;
        String nome;
        String dati;
        try(RandomAccessFile raf = new RandomAccessFile(fileBinary, "r")){
            raf.seek(0);
            nome = raf.readUTF();
            int salute = raf.readInt();
            int sete = raf.readInt();
            int fame = raf.readInt();
            int attaco = raf.readInt();
            int nAcqua = raf.readInt();
            int nCibo = raf.readInt();
            int nMedicine = raf.readInt();
            int maxSalute = raf.readInt();
        }
        switch(nome){
            case "cuoco":
                p = new Cuoco(nome);
                break;
            case "medico":
                p = new Medico(nome);
                break;
            case "veterano":
                p = new Veterano(nome);
                break;
        }
        return p; 
    }
}
