/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ya;

/**
 *
 * @author zatri
 */
public class main {
    public static void main(String[] args) {
        Swordsman Gipaw = new Swordsman("Widagda", 10, 50);
        Archer goat = new Archer("xighaav", 10, 30, 0.75f);
        Mage Kir = new Mage ("Kirana", 10, 30, 40);
        Gipaw.tampilkanStats();
        Kir.tampilkanStats();
        goat.tampilkanStats();
        Kir.gunakanSkill();
        Kir.skillUltimate();
        Gipaw.gunakanSkill();
        Gipaw.serang();
        Gipaw.skillUltimate();
        Kir.isiMana();  
        Kir.isiMana();
        goat.gunakanSkill();
        goat.skillUtama();
        goat.skillUltimate();
        goat.serang();
        Gipaw.tampilkanStats();
        Kir.tampilkanStats();
        goat.tampilkanStats();
        
    }
}
