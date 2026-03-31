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
    public String nemico(){
        personaggio.danni(random.nextInt(20,30));
        return "hai subito i danni dal nemico";
    }
    
    public String ospedale(){
        String output;
        output = medicine();
        int num = random.nextInt(10);
        if(num < 2){
            output += " e " + nemico();
        }
        return output;
    }
    
    public String negozio(){
        int num = random.nextInt(2);
        String output;
        if(num == 0){
           return medicine();
        }
        output = cibo() + " e ";
        output += acqua();
        return output;
    }
    
    @Override
    public String eventoCasuale(){
        int num = random.nextInt(16);
        String output = null;
        switch(num){
            case 0:
                output = cibo();
                break;
            case 1:
                output =  acqua();
                break;
            case 3:
                output = medicine();
                break;
            case 5:
                output = negozio();
                break;
            case 6:
                output = cibo();
                break;
            case 7:
                output = negozio();
                break;
            case 8:
                output = acqua();
            case 9:
                output = nemico();
                break;
            case 11:
                output = ospedale();
                break;
            case 12:
                output = medicine();
                break;
            case 14:
                output = banditi();
                break;
            case 15:
                output = stradaBloccata();
                break;
        }
        return output;
    }
}
