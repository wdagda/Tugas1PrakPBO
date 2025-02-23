/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ya;

/**
 *
 * @author zatri
 */

class Archer extends Karakter implements Skill {
    float Accuracy;
    
    public Archer(String inama, int ilevel, int ihp, float iAccuracy){
        super(inama, ilevel, ihp);
        this.Accuracy = iAccuracy;
    }
    
    @Override
    void serang(){
        System.out.println(nama +" menyerang dengan panah!");
    }
    
    @Override
    void bertahan(){
        System.out.println(nama + " berhasil menghindar!");
    }
    
    @Override
    void gunakanSkill(){
        System.out.println(nama + " menggunakan skill 'Tembakan kuat'!");
    }
    
    @Override
    public void skillUtama(){
        System.out.println(nama + " menggunakan skill 'Fokus'!");
        Accuracy += 0.15f;
    }
    
    @Override
    public void skillUltimate(){
        System.out.println(nama + " menggunakan skill ultimate 'Pluie de flèche!'");
    }
    
    @Override
    void tampilkanStats(){
        System.out.println("\n+++===== Status =====+++");
        System.out.println("Nama    : " + nama);
        System.out.println("Level   : " + level);
        System.out.println("HP      : " + hp);
        System.out.println("Akurasi : " + Accuracy);
        System.out.println("========================\n");
    }
}