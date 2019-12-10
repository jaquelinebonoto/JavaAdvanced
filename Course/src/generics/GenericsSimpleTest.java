/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author I505781
 */
public class GenericsSimpleTest {
        public static void main(String[] args) {
        
        // Example without Generics
        List names = new ArrayList();
        names.add("Kelly");        
        String name = (String) names.get(0); 
        System.out.println("First name: " + name);
        names.add(7);
        System.out.println("Position 2: " + names.get(1));
        //on this case they accpept any kind of variable as input
        
        // Example with Generics
        List<String> names2 = new ArrayList();
        names2.add("Kellen");        
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
        //System.out.println("Position 2: " + names2.get(1));
        //names2.add(7);
        //on this case we described as String to be part of the list, so the line above does not work and it is commented
        
    }
    
}
