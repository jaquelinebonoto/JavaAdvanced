

import java.awt.BorderLayout;

/**
 *
 * @author I505781
 */
public class Varargs {
    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Bananas";
        String item3 = "Pears";
        String[] shopping = {"Bread", "Cheese", "Eggs", "Pasta", "Soda"};
        printShoppingList(item1, item2, item3);
        printShoppingList(shopping);
        
    }

    private static void printShoppingList(String item1, String item2) {
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + item1);
        System.out.println("2. " + item2);
    }
    
    private static void printShoppingList(String item1, String item2, String item3) {
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + item1);
        System.out.println("2. " + item2);
        System.out.println("3. " + item3);   
        System.out.println();
    }
    
    private static void printShoppingList(String... items){
        System.out.println("lSHOPPING LIST");
        for(int i=0; i<items.length; i++){
            System.out.println(i + 1 + ": " +items[i]);
        }
        System.out.println();
    }
}
