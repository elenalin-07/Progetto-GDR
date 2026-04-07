/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author lin.elena
 */
public abstract class Personaggio implements Serializable{
    protected int salute, sete, fame, attaco, nAcqua, nCibo, nMedicine, saluteMax;
    protected String nome;
    
    public Personaggio(){
        sete = 0;
        fame = 0;
        attaco = 30;
        nAcqua = 1;
        nCibo = 1;
        nMedicine = 0;
        saluteMax = 100;
        salute = saluteMax;
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
        return saluteMax;
    }
    
    public void addAcqua(int num){
        nAcqua += num;
    }
    
    public void addCibo(int num){
        nCibo += num;
    }
    
    public void addMedicine(int num){
        nMedicine += num;
    }
    
    public void addAttaco(int num){
        attaco += num;
    }
    
    public void addSaluteMax(int num){
        saluteMax += num;
    }
    
    public void diminuiSete(int num){
        sete -= num;
        if(sete < 0){
            sete = 0;
        }
    }
    
    public void diminuiFame(int num){
        fame -= num;
        if(fame < 0){
            fame = 0;
        }
    }
    
    public void addSalute(int num){
        salute += num;
        if(salute > saluteMax){
            salute = saluteMax;
        }
    }
    
    public boolean bere(){
        nAcqua--;
        if(nAcqua < 0){
            nAcqua = 0;
            return false;
        }
        sete -= 10;
        if(sete <0 ){
            sete = 0;
        }
        return true;
    }
    
    public boolean mangia(){
        nCibo--;
        if(nCibo < 0){
            nCibo = 0;
            return false;
        }
        fame -= 10;
        if(fame <0 ){
            fame = 0;
        }
        return true;
    }
    
    public boolean cura(){
        nMedicine--;
        if(nMedicine < 0){
            nMedicine = 0;
            return false;
        }
        salute += 10;
        if(salute > saluteMax){
            fame = saluteMax;
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
        this.saluteMax = maxSalute;
    }
    
    
    public void danni(int d){
        salute -= d;
    }
    
    public void aumentaSete(int num){
        sete += num;
    }
    
    public void aumentaFame(int num){
        fame += num;
    }
    
    public void azzeramento(){
        nCibo = 0;
        nAcqua = 0;
        nMedicine = 0;
    }
    
    public String getDati(){
        return nome + "," + salute + "," + sete + "," + fame + "," + attaco + "," + nAcqua + "," + nCibo + "," + nMedicine + "," + saluteMax;
    }
}
