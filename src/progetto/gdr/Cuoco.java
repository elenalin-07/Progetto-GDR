/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

/**
 *
 * @author lin.elena
 */
public class Cuoco extends Personaggio{
    public Cuoco(){
        nAcqua = 2;
        nCibo = 2;
    }
    
    @Override
    public void abilitaSpecial(){
        nCibo ++;
        nAcqua += 2;
        fame = 0;
        sete = 0;
        nMedicine = 0;
    }
}
