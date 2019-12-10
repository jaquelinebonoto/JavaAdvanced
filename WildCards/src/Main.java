
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author I505781
 */
public class Main {
    
    public static void main(String[] args) {
           
    //Lista de construçoes
    List<Building> buildings = new ArrayList();
    buildings.add(new Building());
    buildings.add(new Building());
    printBuildings(buildings);
    
    //Lista de escritórios
    List<Office> offices = new ArrayList();
    offices.add(new Office());
    offices.add(new Office());
        
    List<House> houses = new ArrayList();
    houses.add(new House());
    houses.add(new House());
    
    //by using the method printBuildings(List<Building> buildings is not possible to insert houses or offices,
    //even though they are Building childs.
    //for this matter, we can create on method signature to each type, or use wildCards.
    printBuildings(offices);
    printBuildings(houses);
    
    
    //also, we may want to use a method from a child class on its parent, we can also use wild cards for that
    addHouseToList(houses);
    addHouseToList(buildings);
    
    }
    
    //without WildCards
    /*static void printBuildings(List<Building> buildings){
        for(int i=0; i<buildings.size(); i++){
            System.out.println(buildings.get(i).toString() + " " + (i+1));
        }
        System.out.println();
    }*/
    
    //With WildCards - this way all child class of building can use the method
    static void printBuildings(List<? extends Building> buildings){
        for(int i=0; i<buildings.size(); i++){
            System.out.println(buildings.get(i).toString() + " " + (i+1));
        }
        System.out.println();
    }
    
    //with wildcards - here we allow class Build (parent) to use a method created for House
    static void addHouseToList(List<? super House> buildings){
        buildings.add(new House());
        System.out.println();
    }
}
