/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

/**
 *
 * @author lin.elena
 */
public class Veterano extends Personaggio{
    public Veterano(String nome){
        super(nome);
        attaco = 60;
    }
    
    @Override
    public void abilitaSpecial(){
        nCibo++;
        salute = maxSalute;
        attaco += 20;
    }
}
