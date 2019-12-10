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
public class NotGenericMethod {
     
        static Character[] charArray = {'h', 'e', 'm', 'j'};
        static Integer[] intArray = {1, 2, 3, 4, 5};
        static Boolean[] boolArray = {true, false, true};

        //interage com todos os objetos do Array e transforma em uma lista
        public static List arrayToList(Object[] array, List<Object> list){
            for (Object object: array){
                list.add(object);
            }
            return list;
        }
        
    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        //next line is the main test here
        List<String> strList = arrayToList(intArray, new ArrayList<>());
                
        System.out.println(intList.get(0));
        
        //We can declare a List type String and try to use the method arrayToList, it won't show us any erros,
        //unless we try to use the results like on the line below. We got a Cast exception
        
        //System.out.println(strList.get(0));
    }

}
