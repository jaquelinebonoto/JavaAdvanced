
package functionalinterfacesex;

/**
 *
 * @author I505781
 */

@FunctionalInterface
public interface GreetingMessage {
    //this just allows one method
    public abstract void greet(String name);
}
