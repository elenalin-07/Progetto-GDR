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
    public Medico(String nome){
        super(nome);
        salute = 120;
        nMedicine = 1;
        maxSalute = 120;
    }
    
    public void abilitaSpecial(){
        salute = maxSalute;
        nMedicine++;
    }
}
