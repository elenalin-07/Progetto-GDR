/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author lin.elena
 */
public abstract class Mappa implements Serializable{
    protected Personaggio personaggio;
    protected Random random;
    protected String nome;
    
    public Mappa(){
        random = new Random();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setPersonaggio(Personaggio p){
        personaggio = p;
    }
    
    public String stradaBloccata(){
        personaggio.aumentaFame(8);
        personaggio.aumentaSete(8);
        return "La strada è bloccata. Devi cambiare percorso.\nLa fatica aumenta: fame e sete crescono.";
    }
            
    public String cibo(){
        int num = random.nextInt(100);
        int cibo;
        if(num < 5){
            personaggio.addCibo(3);
            cibo = 3;
        }
        else if(num < 20){
            personaggio.addCibo(2);
            cibo = 2;
        }
        else{
            personaggio.addCibo(1);
            cibo = 1;
        }
        return "Hai trovato " + cibo + " cibo";
    }
    
    public String acqua(){
        int num = random.nextInt(100);
        int acqua;
        
        if(num < 5){
            personaggio.addAcqua(3);
            acqua = 3;
        }
        else if(num < 20){
            personaggio.addAcqua(2);
            acqua = 2;
        }
        else{
            personaggio.addAcqua(1);
            acqua = 1;
        }
        return "Hai trovato " + acqua + " bottiglia di acqua";
    }
    
    public String medicine(){
        int num = random.nextInt(100);
        int medicine;
        
        if(num < 5){
            personaggio.addMedicine(3);
            medicine = 3;
        }
        else if(num < 20){
            personaggio.addMedicine(2);
            medicine = 2;
        }
        else{
            personaggio.addMedicine(1);
            medicine = 1;
        }
        return "Hai trovato " + medicine + " medicine";
    }
    
    public String rifugioSicuro(){
        personaggio.addSaluteMax(10);
        return "Trovi un rifugio sicuro dove puoi riposarti.\nRecuperi le forze e ti senti più resistente.\n Salute massima +10";
    }
    
    public String banditi(){
        String output = "Un gruppo di banditi ti tende un’imboscata lungo la strada.\nSembrano pronti ad attaccare.";
        int attacoNemico = random.nextInt(40,60);
        if(personaggio.getAttaco() < attacoNemico){
            personaggio.danni(random.nextInt(attacoNemico));
            personaggio.addAttaco(10);
            return output + "\nSconfitta. Salute ridotta. Sei fuggito.";
        }
        output += "\nBanditi sconfitti. Risorse ottenute.\n"+ cibo() + "\n" + acqua()+ "\n"+ medicine();
        return output;
    }
    
    public String sopravvisuto(){
        personaggio.addSaluteMax(5);
        personaggio.addAttaco(10);
        return "Un sopravvissuto ti offre consigli preziosi.";
    }
    
    public abstract String eventoCasuale();
}
