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
    
    public void ospedale(){
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
        int num = random.nextInt(16);
        
        switch(num){
            case 0:
                cibo();
                break;
            case 1:
                acqua();
                break;
            case 3:
                medicine();
                break;
            case 5:
                negozio();
                break;
            case 6:
                cibo();
                break;
            case 7:
                negozio();
                break;
            case 8:
                acqua();
            case 9:
                nemico();
                break;
            case 11:
                ospedale();
                break;
            case 12:
                medicine();
                break;
            case 14:
                banditi();
                break;
            case 15:
                stradaBloccata();
                break;
        }
    }
}
