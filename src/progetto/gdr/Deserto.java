/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

/**
 *
 * @author lin.elena
 */
public class Deserto extends Mappa{
    public Deserto(String nome, Personaggio p){
        super(nome, p);
    }
    
    public void lupo(){
        int attacoLupo = random.nextInt(30,70);
        if(personaggio.getAttaco() < attacoLupo){
            personaggio.danni(random.nextInt(attacoLupo));
        }
    }
    
    public void villaggioAbandonato(){
        int num = random.nextInt(2);
        if(num == 0){
            cibo();
            acqua();
            medicine();
        }
        else{
            personaggio.danni(random.nextInt(5, 20));
        }
    }
    
    public void caldo(){
        personaggio.aumentaSete(8);
    }
    
    @Override
    public void eventoCasuale(){
        
    }
}
