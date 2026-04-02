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
    public String lupo(){
        int attacoLupo = random.nextInt(30,70);
        if(personaggio.getAttaco() < attacoLupo){
            int danni = random.nextInt(30, 40);
            personaggio.danni(random.nextInt(danni));
            return "hai incontrato un lupo hai subito " + attacoLupo + " danni";
        }
        return "hai incontato un lupo ma lo hai sconfitto";
    }
    
    public String villaggioAbandonato(){
        String output = "hai trovato un villaggio abandonato";
        int num = random.nextInt(2);
        if(num == 0){
            output += cibo() + ", ";
            output += acqua() + " e ";
            output += medicine();
            return output;
        }
        int danni = random.nextInt(5, 20);
        personaggio.danni(danni);
        return output + "hai subito " + danni + " danni";
    }
    
    public String caldo(){
        personaggio.aumentaSete(8);
        return "la temperature è aum aumentata";
    }
    
    @Override
    public String eventoCasuale(){
        int num = random.nextInt(16);
        String output = "Non successo niente";
        switch(num){
            case 0:
                output = cibo();
                break;
            case 1:
                output = acqua();
                break;
            case 3:
                output = medicine();
                break;
            case 5:
                output = caldo();
                break;
            case 6:
                output = cibo();
                break;
            case 7:
                output = caldo();
                break;
            case 8:
                output = acqua();
                break;
            case 9:
                output = villaggioAbandonato();
                break;
            case 11:
                output = lupo();
                break;
            case 12:
                output = medicine();
                break;
            case 14:
                output = banditi();
                break;
            case 15:
                output = stradaBloccata();
        }
        return output;
    }
}
