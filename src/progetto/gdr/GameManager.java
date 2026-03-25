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
    private String nickname;
    
    public GameManager(Personaggio p, Mappa m, String nickname){
        turni = 0;
        personaggio = p;
        random = new Random();
        mappa = m;
        this.nickname = nickname;
    }
    
    public void esplora(){
        turni++;
        days = turni/4;
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
    
    public int getSalute(){
        return personaggio.getSalute();
    }
    
    public int getSete(){
        return personaggio.getSete();
    }
    
    public int getFame(){
        return personaggio.getFame();
    }
    
    public int getAttaco(){
        return personaggio.getAttaco();
    }
    
    public int getNAcqua(){
        return personaggio.getNAcqua();
    }
    
    public int getNCibo(){
        return personaggio.getNCibo();
    }
    
    public int getNMedicine(){
        return personaggio.getNMedicine();
    }
    
    public int getMaxSalute(){
        return personaggio.getMaxSalute();
    }
}
