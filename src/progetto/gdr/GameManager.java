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
    Random random;
    
    public GameManager(Personaggio p){
        turni = 0;
        personaggio = p;
        random = new Random();
    }
    
    public void esplora(){
        turni++;
        days = turni/3;
    }
    
    public int getTurni(){
        return turni;
    }
     
    public int getDays(){
        return days;
    }
}
