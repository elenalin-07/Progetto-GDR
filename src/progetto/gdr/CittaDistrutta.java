/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

/**
 *
 * @author lin.elena
 */
public class CittaDistrutta extends Mappa{
    public CittaDistrutta() {
        nome = "cittaDistrutta";
    }
    public String nemico(){
        int danni = random.nextInt(20, 30);
        personaggio.danni(random.nextInt(danni));
        personaggio.addAttaco(5);
        return "Sei stato attacato, hai subito " + danni + " danni dal nemico";
    }
    
    public String ospedale(){
        String output;
        output = "Hai trovato un ospedale da campo abbandonato.\nPotresti cercare medicine e cure, ma il pericolo è ovunque.\n" + medicine();
        int num = random.nextInt(10);
        if(num < 2){
            output += " e " + nemico();
        }
        return output;
    }
    
    public String negozio(){
        int num = random.nextInt(2);
        String output = "Trovi un negozio abbandonato, devastato dalla guerra.\nPotrebbe nascondere qualcosa di utile…\n";
        if(num == 0){
           return output + medicine();
        }
        output += cibo() + "\n";
        output += acqua();
        return output;
    }
    
    public String accampamentoMilitare(){
        personaggio.addAttaco(20);
        return "Trovi un vecchio accampamento militare abbandonato.\nTra le rovine recuperi un’arma migliore.";
    }
    
    public String pozzo() {
        personaggio.diminuiSete(15);
        personaggio.addAcqua(1);
        return "Trovi un pozzo di acqua pulita.";
    }
    
    public String deposito(){
        return "Scopri un piccolo deposito nascosto tra le macerie.\n" + cibo();
    }
    
    public String farmacia(){
        return "Scopri una farmacia distrutta, tra le rovine di una farmacia puoi trovare medicinali.\n" + medicine();
    }
    
    public String animali(){
        personaggio.diminuiFame(20);
        return "Segui tracce di animali tra le rovine.\nTrovi piccoli animali da cacciare, la fame diminuisce.";
    }
    
    public String pioggiaAcida(){
        personaggio.danni(5);
        return "La pioggia caduta sulle macerie è tossica.\nLa pioggia ti colpisce, la salute diminuisce leggermente.";
    }
    
    @Override
    public String eventoCasuale(){
        int num = random.nextInt(20);
        String output = "Non succede nulla.";
        switch(num){
            case 0:
                output = deposito();
                break;
            case 2:
                output = pozzo();
                break;
            case 3:
                output = animali();
                break;
            case 5:
                output = negozio();
                break;
            case 6:
                output = deposito();
                break;
            case 7:
                output = negozio();
                break;
            case 8:
                output = pozzo();
                break;
            case 9:
                output = nemico();
                break;
            case 11:
                output = ospedale();
                break;
            case 13:
                output = farmacia();
                break;
            case 14:
                output = banditi();
                break;
            case 15:
                output = stradaBloccata();
                break;
            case 17:
                output = accampamentoMilitare();
                break;
            case 18:
                output = rifugioSicuro();
                break;
            case 19:
                output = pioggiaAcida();
        }
        return "\n" + output;
    }
}
