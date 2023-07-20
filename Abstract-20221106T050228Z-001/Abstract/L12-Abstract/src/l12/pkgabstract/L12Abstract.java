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
public class L12Abstract {

    
    public static void main(String[] args) {
       
      //  Laptop  lap = new Laptop ();
      
        Laptop lap = new Msi();
                
        Msi jl = new Msi();
        jl.modelNumber = 123;
        jl.modelName = "Msi";
        jl.powerOn();
        jl.powerOff();
        
        Hp omen =new Hp( 2022, 888,"pro");
    
        System.out.println(jl.modelNumber);
        
      
    }
    
}
