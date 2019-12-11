
/**
 *
 * @author I505781
 */
public class Customer {
    private boolean served;
    private String name;
    
    //constuctor initializing the value of served
    public Customer(String name){
        served = false;
        this.name = name;
    }
    
    public void serve(){
        served = true;
        System.out.println("Customer " + name + " has been served.");
    }

    @Override
    public String toString() {
        return "Customer{" + "served=" + served + ", name=" + name + '}';
    }
    
    
}
