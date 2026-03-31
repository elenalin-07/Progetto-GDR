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
    
    public Mappa(){
        random = new Random();
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
        
        if(num < 5){
            personaggio.addCibo(3);
        }
        else if(num < 20){
            personaggio.addCibo(2);
        }
        else{
            personaggio.addCibo(1);
        }
        return "hai trovato " + num + " cibo";
    }
    
    public String acqua(){
        int num = random.nextInt(100);
        
        if(num < 5){
            personaggio.addAcqua(3);
        }
        else if(num < 20){
            personaggio.addAcqua(2);
        }
        else{
            personaggio.addAcqua(1);
        }
        return "hai trovato " + num + " bottiglia di acqua";
    }
    
    public String medicine(){
        int num = random.nextInt(100);
        
        if(num < 5){
            personaggio.addAcqua(3);
        }
        else if(num < 20){
            personaggio.addAcqua(2);
        }
        else{
            personaggio.addAcqua(1);
        }
        return "hai trovato " + num + " medicine";
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
    
    public void medicante(){
        
    }
    
    public abstract String eventoCasuale();
}
