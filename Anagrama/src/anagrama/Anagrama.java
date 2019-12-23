/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;

/**
 *
 * @author Jaqueline
 */
public class Anagrama {

    public static void main(String[] args) {
        String a = "alex";
        String b = "xela";
        
        if(ehAnagrama(a, b)){
            System.out.println("É anagrama");
        }else{
            System.out.println("Não é.");
        }
        
    }
    
    private static boolean ehAnagrama(String a, String b){
        int r = 0;
        for (int i=0; i<a.length(); i++){
            //^ = ou exclusivo se os 2 bits de entrada forem iguais, o resultado é zero, se eles forem diferentes, é 1
            r = r^a.charAt(i);            
        }
        for (int i=0; i<b.length(); i++){
            //^ = ou exclusivo se os 2 bits de entrada forem iguais, o resultado é zero, se eles forem diferentes, é 1
            r = r^b.charAt(i);            
        }
        return (r==0);
    }
    
}
