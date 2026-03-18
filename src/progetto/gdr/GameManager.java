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
public class GameManager {
    private int turni, days;
    private Personaggio personaggio;
    private Random random;
    private Mappa mappa;
    
    public GameManager(Personaggio p, Mappa m){
        turni = 0;
        personaggio = p;
        random = new Random();
        mappa = m;
    }
    
    public void esplora(){
        turni++;
        days = turni/3;
        mappa.eventoCasuale();
    }
    
    public int getTurni(){
        return turni;
    }
     
    public int getDays(){
        return days;
    }
    
    public boolean mangia(){
        return personaggio.mangia();
    }
    
    public boolean bere(){
        return personaggio.bere();
    }
    
    public boolean cura(){
        return personaggio.cura();
    }
    
    public void abilitaSpecial(){
        personaggio.abilitaSpecial();
    }
}
