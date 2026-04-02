/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

/**
 *
 * @author lin.elena
 */
public class Mare extends Mappa{
    public String pirati(){
        String output = "Hai incontrato dei pirati";
        int attacoPirate = random.nextInt(50, 70);
        if(personaggio.getAttaco() >= attacoPirate){
            output += "\nHai sconfitto i pirati. Rifornimenti recuperati con successo";
            output += "\n" + cibo();
            output += "\n" + acqua();
            output += "\n" + medicine();
        }
        else{
            output += "\nHai perso contro i pirat.! Tutti i rifornimenti sono stati rubati";
            personaggio.azzeramento();
            int danni = random.nextInt(30,60);
            personaggio.danni(danni);
            output = "\nHai subito " + danni + " danni";
        }
        return output;
    }
    
    public String tempeste(){
        personaggio.azzeramento();
        return "Hai incontrato una tempesta e hai perso i riferimenti";
    }
    
    public String cassaRifornimento(){
        String output = "Hai trovato una cassa di rifornimenti";
        int n = random.nextInt(10);
        output ="\n" + cibo();
        if(n < 4){
            output ="\n" + acqua();
        }
        else if(n < 2){
            output ="\n" + medicine();
        }
        return output;
    }
    
    public String squalo(){
        String output = "Uno squalo ha attaccato la tua nave";
        int attacoSqualo = random.nextInt(30,60);
        if(personaggio.getAttaco() >= attacoSqualo){
            output += "\nHai sconfitto lo squalo. La nave è al sicuro";
            output += "\n" + cibo();
        }
        else{
            int danni = random.nextInt(30, 40);
            personaggio.danni(danni);
            output += "\nAttacco squalo riuscito. Hai subito " + danni + " danni";
        }
        return output;
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
                output = squalo();
                break;
            case 6:
                output = cibo();
                break;
            case 7:
                output = tempeste();
                break;
            case 8:
                output = acqua();
                break;
            case 9:
                output = squalo();
                break;
            case 11:
                output = pirati();
                break;
            case 12:
                output = medicine();
                break;
            case 14:
                output = tempeste();
                break;
            case 15:
                output = stradaBloccata();
        }
        return output;
    }
}
