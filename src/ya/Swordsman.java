/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ya;

/**
 *
 * @author zatri
 */
class Swordsman extends Karakter implements Skill {
    public Swordsman(String inama, int ilevel, int ihp){
        super(inama, ilevel, ihp);
    }
    
    @Override
    void serang(){
        System.out.println(nama +" menyerang dengan pedang!");
    }
    
    @Override
    void bertahan(){
        System.out.println(nama + " bertahan menggunakan tamengnya!");
    }
    
    @Override
    void gunakanSkill(){
        System.out.println(nama + " melakukan tangkisan!");
    }
    
    @Override
    public void skillUtama(){
        System.out.println(nama + " menggunakan skill 'Seruan perang!'");
    }
    
    @Override
    public void skillUltimate(){
        System.out.println(nama + " menggunakan skill ultimate 'Pemecah Langit!'");
    }
    
    
}
