/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author lin.elena
 */
public class GameManager {
    private int turni, days, click;
    private Personaggio personaggio;
    private Random random;
    private Mappa mappa;
    private String nickname, time;
    private String[] times;
    
    public GameManager(Personaggio p, Mappa m, String nickname){
        turni = 0;
        personaggio = p;
        random = new Random();
        mappa = m;
        this.nickname = nickname;
        times = new String[4];
        click = 0;
        days = 1;
    }
    
    public void setTime(String[] t){
        times = t;
        time = times[click];
    }
    
    public String getTime(){
        return time;
    }
    
    public String esplora(){
        turni++;
        click++;
        if(click > 3){
            click = 0;
        }
        time = times[click];
        if(turni/4 != 0) days = turni/4;
        
        if(personaggio.fame <= 50) personaggio.fame++;
        if(personaggio.sete <= 50) personaggio.sete++;
        
        if(personaggio.fame >= 30){
            personaggio.salute -= personaggio.fame/10;
        }
        if(personaggio.sete >= 30){
            personaggio.salute -= personaggio.sete/10;
        }
        return mappa.eventoCasuale();
    }
    
    public boolean check(){
        if(personaggio.getSalute() <= 0){
            return false;
        }
        return true;
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
    
    public Mappa getMappa(){
        return mappa;
    }

    public Personaggio getPersonaggio() {
        return personaggio;
    }
    
    public String getDati(){
        return turni + "," + days + "," + click + "," + mappa.getNome() + "," + nickname + "," + time + "," + personaggio.getDati();
    }
    
    public void salvaCSV(String path) throws IOException{
        FileManager.writeCSV(path, getDati());
    }
    
    public void setDati(int turni, int days, int click,String nickname, String time){
        this.turni = turni;
        this.days = days;
        System.out.println(days +"/" + time);
        this.click = click;
        this.nickname = nickname;
        this.time = time;
    }
}
