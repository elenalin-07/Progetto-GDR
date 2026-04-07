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
    public Mare() {
        nome = "mare";
    }
    
    public String pirati(){
        String output = "Mentre navighi su una piccola barca, noti delle vele all’orizzonte: pirati.\n";
        int attacoPirate = random.nextInt(50, 70);
        if(personaggio.getAttaco() >= attacoPirate){
            personaggio.addAttaco(25);
            return output + "Riesci a difenderti e respingere i pirati! Ottieni provviste rubate.\n" + cibo() + "\n" + acqua() + "\n" + medicine();
        }
            output += "Hai perso contro i pirati. Tutti i rifornimenti sono stati rubati";
            personaggio.azzeramento();
            int danni = random.nextInt(30,60);
            personaggio.danni(danni);
            output = "\nHai subito " + danni + " danni";
        return output;
    }
    
    public String tempeste(){
        personaggio.azzeramento();
        personaggio.danni(5);
        return "Nuvole scure si accumulano e il vento si alza.\nLa barca è capovolta dalle onde, salute leggermente diminuite. E hai perso i riferimenti";
    }
    
    public String pioggia(){
        personaggio.diminuiSete(15);
        personaggio.addAcqua(2);
        return "Una pioggia improvvisa cade sul mare, rinfrescando l’aria e bagnando la barca.\nRaccogli acqua piovana e ti disseti un po’.";
    }
    
    public String cassaRifornimento(){
        String output = "Noti una cassa galleggiante tra le onde.\n";
        int n = random.nextInt(10);
        output += cibo();
        if(n < 4){
            output ="\n" + acqua();
        }
        else if(n < 2){
            output ="\n" + medicine();
        }
        return output;
    }
    
    public String pesce(){
        personaggio.addCibo(1);
        personaggio.diminuiFame(15);
        return "Un gruppo di pesci nuota vicino.\nRiesci a pescare qualcosa, fame diminuita e risorse aumentate.";
    }
    
    public String isola(){
        personaggio.diminuiFame(15);
        personaggio.diminuiSete(15);
        return "Scopri un piccolo isolotto con provviste naturali.\nRaccolti frutti e acqua dolce, fame e sete diminuite.\n" + cibo() + "\n" + acqua();
    }
    
    public String riposo(){
        personaggio.addSalute(20);
        personaggio.addSaluteMax(5);
        return "Ti sdrai al sole durante una giornata calma.\nRecuperi salute e resistenza, salute massima aumentata.";
    }
    
    public String pesceGigante(){
        int num = random.nextInt(100);
        if (num < personaggio.getAttaco()) {
            personaggio.addCibo(3);
            return "Mentre navighi, un’ombra enorme si muove sotto la barca: un pesce gigante.\nRiesci a catturare il pesce! Forza e agilità aumentano, ottieni cibo extra.";
        }
        personaggio.danni(10);
        return "Mentre navighi, un’ombra enorme si muove sotto la barca: un pesce gigante.\nIl pesce ti fa perdere l’equilibrio. Subisci ferite e perdi energia; cibo nullo.";
    }

    public String squalo() {
        String output = "Uno squalo ha attaccato la tua nave";
        int attacoSqualo = random.nextInt(30, 60);
        if (personaggio.getAttaco() >= attacoSqualo) {
            personaggio.addAttaco(10);
            output += "\nHai sconfitto lo squalo. La nave è al sicuro";
            output += "\n" + cibo();
        } else {
            int danni = random.nextInt(30, 40);
            personaggio.danni(danni);
            output += "\nAttacco squalo riuscito. Hai subito " + danni + " danni";
        }
        return output;
    }

    public String ventoContrario() {
        personaggio.aumentaFame(8);
        personaggio.aumentaSete(8);
        return "Devi remare più a lungo; fame e sete aumentano leggermente.";
    }

    @Override
    public String eventoCasuale() {
        int num = random.nextInt(20);
        String output = "Non succede nulla.1121/images/mare.JPG";

        switch (num) {
            case 0:
                output = isola() + "1121/images/isola.JPG";
                break;
            case 1:
                output = pesceGigante() + "1121/images/pesceBig.JPG";
                break;
            case 3:
                output = cassaRifornimento() + "1121/images/cassa.JPG";
                break;
            case 5:
                output = squalo() + "1121/images/squalo.JPG";
                break;
            case 6:
                output = pesce() + "1121/images/pesce.JPG";
                break;
            case 7:
                output = tempeste() + "1121/images/tempesteMare.JPG";
                break;
            case 8:
                output = pioggia() + "1121/images/pioggiaMare.JPG";
                break;
            case 9:
                output = squalo() + "1121/images/squalo.JPG";
                break;
            case 11:
                output = pirati() + "1121/images/pirati.JPG";
                break;
            case 12:
                output = riposo() + "1121/images/mare.JPG";
                break;
            case 14:
                output = pesce() + "1121/images/pesce.JPG";
                break;
            case 15:
                output = ventoContrario() + "1121/images/onde.JPG";
                break;
            case 16:
                output = pioggia() + "1121/images/pioggiaMare.JPG";
                break;
            case 18:
                output = pesceGigante() + "1121/images/pesceBig.JPG";
                break;
        }

        return "\n" + output;
    }
}
