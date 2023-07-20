/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l12.pkgabstract;

/**
 *
 * @author omen
 */
public class Hp extends Laptop {
    
    int year;
     
     public Hp(){}
             
    public Hp(int year ,int modelNumber , String modelName ){
        
    super( modelNumber , modelName);
    this.year=year;
    }
   

    @Override
    public void powerOn() {
        System.out.println("HP: Model (" + super.modelName + ") Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("HP: Model (" + super.modelName + ") Power Off");
    }

    @Override
    public void showSpecifications() {
    }

   

    @Override
    public int getRamSize() {
        return 8;
    }
}
