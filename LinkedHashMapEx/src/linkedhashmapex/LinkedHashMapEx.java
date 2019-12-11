/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashmapex;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author I505781
 */
public class LinkedHashMapEx {

public static void main(String[] args) {
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>();
        //not garanteed that will be inserted in the same order
        phonebook.put("Carlos", 12345);
        phonebook.put("Cláudia", 98765);
        phonebook.put("Charles", 123123);
        phonebook.put("Chico", 22222);
        
        System.out.println("Carlos' number is: " + phonebook.get("Carlos"));
        System.out.println("\nList of contacts: ");
        for(Map.Entry<String, Integer> entry: phonebook.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
    }
}
