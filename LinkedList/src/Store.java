
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author I505781
 */
public class Store {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Jaque"));
        queue.add(new Customer("Jair"));
        queue.add(new Customer("Jailson"));
        queue.add(new Customer("Jandira"));
        queue.add(new Customer("Jamile"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }
    
    static void serveCustomer(LinkedList<Customer> queue){
        Customer c = queue.poll();
        c.serve();
        
    }
    
}
