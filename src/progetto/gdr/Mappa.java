/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

import java.util.Random;

/**
 *
 * @author lin.elena
 */
public abstract class Mappa {
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
        personaggio.aumentaFame(5);
        personaggio.aumentaSete(5);
        return "la strada che stai andando e' bloccato devi cambia lastrada, ti aumenta la sete e la fame";
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
        return "hai trovato " + cibo + " cibo";
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
        return "hai trovato " + acqua + " bottiglia di acqua";
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
        return "hai trovato " + medicine + " medicine";
    }
    
    public String banditi(){
        int attacoNemico = random.nextInt(40,60);
        if(personaggio.getAttaco() < attacoNemico){
            personaggio.danni(random.nextInt(attacoNemico));
            return "hai subito " + attacoNemico + " danni";
        }
        String output = cibo();
        output += acqua();
        output += medicine();
        return """
               hai sconfitto nemici
               """ + output;
    }
    
    public abstract String eventoCasuale();
}
