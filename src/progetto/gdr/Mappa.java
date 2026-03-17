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
    protected String nome;
    protected Personaggio personaggio;
    protected Random random;
    
    public Mappa(String nome, Personaggio p){
        this.nome = nome;
        personaggio = p;
        random = new Random();
    }
    
    public void stradaBloccata(){
        personaggio.aumentaFame(5);
        personaggio.aumentaSete(5);
    }
            
    public void cibo(){
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
    }
    
    public void acqua(){
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
    }
    
    public void medicine(){
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
    }
    
    public boolean banditi(){
        int attacoNemico = random.nextInt(40,60);
        if(personaggio.getAttaco() < attacoNemico){
            personaggio.danni(random.nextInt(attacoNemico));
            return false;
        }
        else{
            cibo();
            acqua();
            medicine();
        }
        return true;
    }
    
    public abstract void eventoCasuale();
}
