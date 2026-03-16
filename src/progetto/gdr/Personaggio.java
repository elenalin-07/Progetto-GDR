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
    
    public String getNome(){
        return nome;
    }
    
    public int getSalute(){
        return salute;
    }
    
    public int getSete(){
        return sete;
    }
    
    public int getFame(){
        return fame;
    }
    
    public int getAttaco(){
        return attaco;
    }
    
    public int getNAcqua(){
        return nAcqua;
    }
    
    public int getNCibo(){
        return nCibo;
    }
    
    public int getNMedicine(){
        return nMedicine;
    }
    
    public int getMaxSalute(){
        return maxSalute;
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
    public void setDati(int salute, int sete, int fame, int attaco, int nAcqua, int nCibo, int nMedicine, int maxSalute){
        this.salute = salute;
        this.sete = sete;
        this.fame = fame;
        this.attaco = attaco;
        this.nAcqua = nAcqua;
        this.nCibo = nCibo;
        this.nMedicine = nMedicine;
        this.maxSalute = maxSalute;
    }
    
    public void setPersonaggio(Personaggio p){
        this.equals(p);
    }
}
