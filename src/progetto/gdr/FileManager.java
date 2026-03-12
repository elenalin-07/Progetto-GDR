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
    private String fileCSV, fileBinary;
    
    public FileManager(String csv, String binary){
        fileCSV = csv;
        fileBinary = binary;
    }
    
    public void writeCSV(String dati) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileCSV))){
            writer.write(dati);
        }
    }
    
    public String readCSV() throws FileNotFoundException, IOException{
        String dati;
        try(BufferedReader reader = new BufferedReader(new FileReader(fileCSV))){
            dati = reader.readLine();
        }
        return dati;
    }
    
    public void writeBinary(Personaggio p) throws FileNotFoundException, IOException{
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
    
    public Personaggio readBinary() throws FileNotFoundException, IOException{
        Personaggio p;
        try(RandomAccessFile raf = new RandomAccessFile(fileBinary, "r")){
            raf.seek(0);
            String nome = raf.readUTF();
            int salute = raf.readInt();
            int sete = raf.readInt();
            int fame = raf.readInt();
            int attaco = raf.readInt();
            int nAcqua = raf.readInt();
            int nCibo = raf.readInt();
            int nMedicine = raf.readInt();
            int maxSalute = raf.readInt();
        }
        p = new Personaggio
    }
}
