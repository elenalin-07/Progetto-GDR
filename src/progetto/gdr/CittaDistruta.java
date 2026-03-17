/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

/**
 *
 * @author lin.elena
 */
public class CittaDistruta extends Mappa{
    public CittaDistruta(String nome, Personaggio p){
        super(nome, p);
    }
    
    public void nemico(){
        personaggio.danni(random.nextInt(20,30));
    }
    
    public void ospdale(){
        medicine();
        int num = random.nextInt(10);
        if(num < 2){
            nemico();
        }
    }
    
    public void negozio(){
        int num = random.nextInt(2);
        if(num == 0){
            medicine();
        }
        else{
            cibo();
            acqua();
        }
    }
    
    @Override
    public void eventoCasuale(){
        
    }
}
