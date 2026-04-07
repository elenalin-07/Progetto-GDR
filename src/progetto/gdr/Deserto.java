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
    public Deserto() {
        nome = "deserto";
    }
    
    public String lupo(){
        String output = "Un lupo selvaggio ti sorprende tra le dune.\n";
        int attacoLupo = random.nextInt(30,70);
        if(personaggio.getAttaco() < attacoLupo){
            int danni = random.nextInt(30, 40);
            personaggio.danni(random.nextInt(danni));
            return "Il lupo ti ha ferito ti ha causato " + danni + " danni";
        }
        personaggio.addCibo(1);
        personaggio.addAttaco(15);
        return "Sei riuscito a difenderti dal lupo! La tua esperienza in combattimento aumenta e ottieni un po’ di carne fresca.";
    }
    
    public String iena(){
        String output = "Una iena ti circonda vicino alle rovine del deserto.\n";
        int attacoIena = random.nextInt(20,60);
        if(personaggio.getAttaco() < attacoIena){
            int danni = random.nextInt(20, 30);
            personaggio.danni(random.nextInt(danni));
            return "La iena ti graffia, perdi salute.";
        }
        personaggio.addAttaco(10);
        return "Scacci la iena! Guadagni esperienza e trovi qualche risorsa abbandonata.\n" + cibo() + "\n" + acqua();
    }
    
    public String villaggioAbandonato(){
        String output = "Scopri un villaggio abandonato";
        int num = random.nextInt(2);
        if(num == 0){
            output += cibo() + "\n";
            output += acqua() + "\n";
            output += medicine();
            return output;
        }
        int danni = random.nextInt(5, 20);
        personaggio.danni(danni);
        return output + "Sei stato attacato dai spravvisuti del viaggio, hai subito " + danni + " danni";
    }
    
    public String caldo(){
        personaggio.aumentaSete(10);
        return "Il sole picchia senza pietà.\nSete e fatica aumentano rapidamente";
    }
    
    public String oasi(){
        personaggio.diminuiSete(30);
        personaggio.addSalute(5);
        return "Trovi una piccola oasi tra le dune.\nHai trovato acqua fresca e un po’ di ombra. Sete diminuita, salute leggermente aumentata.";
    }
    
    public String tempesteSabbia(){
        personaggio.danni(5);
        personaggio.aumentaFame(5);
        personaggio.aumentaSete(8);
        return "Una tempesta improvvisa ti colpisce.\nLa fatica aumenta, salute leggermente ridotta.";
    }
    
    public String armi(){
        personaggio.addAttaco(10);
        return "Trovi lance e spade tra le rovine.\nAffini la tua tecnica di combattimento, attacco migliorato.";
    }
    
    public String carovana(){
        return "I resti di una carovana dispersa nel deserto.\nTra le merci abbandonate trovi cibo, acqua e medicinali.\n" + cibo() + "\n" + acqua() + "\n" + medicine();
    }
    
    public String racolte(){
        personaggio.diminuiFame(15);
        personaggio.addCibo(1);
        return "Trovi le piante e radici sopravvissute al caldo.\nLe piante ti danno nutrimento, fame diminuita.";
    }
    
    @Override
    public String eventoCasuale(){
        int num = random.nextInt(20);
        String output = "Non succede nulla.";
        switch(num){
            case 0:
                output = carovana();
                break;
            case 1:
                output = oasi();
                break;
            case 3:
                output = medicine();
                break;
            case 5:
                output = caldo();
                break;
            case 6:
                output = racolte();
                break;
            case 7:
                output = caldo();
                break;
            case 8:
                output = oasi();
                break;
            case 9:
                output = villaggioAbandonato();
                break;
            case 11:
                output = lupo();
                break;
            case 12:
                output = carovana();
                break;
            case 14:
                output = banditi();
                break;
            case 15:
                output = stradaBloccata();
                break;
            case 16:
                output = tempesteSabbia();
                break;
            case 17:
                output = iena();
                break;
            case 19:
                output = rifugioSicuro();
                break;
        }
        return "\n" + output;
    }
}
