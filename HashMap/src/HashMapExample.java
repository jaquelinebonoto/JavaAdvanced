
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author I505781
 */
public class HashMapExample {
        public static void main(String[] args) {  
        
        HashMap<String, Integer> phonebook = new HashMap<>();
        //the result when printing the list is unordered
        phonebook.put("Carlos", 12345);
        phonebook.put("Cláudia", 98765);
        phonebook.put("Charles", 123123);
        phonebook.put("Chico", 22222);
        //hashmap allows to insert a value with null as a key.
        phonebook.put(null, 000);
        System.out.println(phonebook);
        //hashmap does not allow 2 alements with the same key. so the line below will replace Charles phonenumber
        phonebook.put("Charles", 87654);
        
        //check if the key already exists
        System.out.println(phonebook);
        if(phonebook.containsKey("Chico")) {
            phonebook.remove("Chico");
        }
        System.out.println(phonebook);
        
        //clear the hashmap
        phonebook.clear();
        System.out.println(phonebook);
    }
}
