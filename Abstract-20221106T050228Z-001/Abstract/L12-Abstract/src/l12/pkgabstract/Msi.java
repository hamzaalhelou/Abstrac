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
public class Msi extends Laptop {

    @Override
    public void powerOn() {
        System.out.println("MSI: Model (" + super.modelName + ") Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("MSI: Model (" + super.modelName + ") Power Off");
    }

    @Override
    public void showSpecifications() {
    }


    @Override
    public int getRamSize() {
        return 16;
    }
}
