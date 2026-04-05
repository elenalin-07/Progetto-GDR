/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.gdr;

/**
 *
 * @author lin.elena
 */
public class Medico extends Personaggio{
    public Medico(){
        nome = "medico";
        nMedicine = 1;
        maxSalute = 120;
        salute = maxSalute;
    }
    
    @Override
    public void abilitaSpecial(){
        salute = maxSalute;
        nMedicine++;
    }
}
