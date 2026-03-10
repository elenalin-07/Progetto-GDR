/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

import java.util.ArrayList;

/**
 *
 * @author lin.elena
 */
public abstract class Personaggio {
    protected int salute, sete, fame, attaco, nAcqua, nCibo, nMedicine, maxSalute;
    protected String nome;
    
    public Personaggio(String nome){
        this.nome = nome;
        salute = 100;
        sete = 0;
        fame = 0;
        attaco = 30;
        nAcqua = 1;
        nCibo = 1;
        nMedicine = 0;
        maxSalute = 100;
    }
    
    public abstract void abilitaSpecial();
    
    public int getSalute(){
        return salute;
    }
    
    public int getSete(){
        return sete;
    }
    
    public int getFame(){
        return fame;
    }
    
    public void addAcqua(){
        nAcqua++;
    }
    
    public void addCibo(){
        nCibo++;
    }
    
    public boolean bere(){
        nAcqua--;
        if(nAcqua < 0){
            nAcqua = 0;
            return false;
        }
        return true;
    }
    
    public boolean mangia(){
        nCibo--;
        if(nCibo < 0){
            nCibo = 0;
            return false;
        }
        return true;
    }
}
