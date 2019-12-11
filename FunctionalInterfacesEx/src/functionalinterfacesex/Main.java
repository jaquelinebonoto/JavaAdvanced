/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalinterfacesex;

/**
 *
 * @author I505781
 */
public class Main {
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage(){

            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Jack");
    }
}
