/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

/**
 *
 * @author lin.elena
 */
public abstract class Mappa {
    protected String nome;
    private Personaggio personaggio;
    
    public Mappa(String nome, Personaggio p){
        this.nome = nome;
        personaggio = p;
    }
    
    public abstract void neventoCasuale();
}
