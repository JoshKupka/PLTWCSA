
/**
 * Write a description of class AnimalActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class AnimalActivity
{
    public static void main()
    {
        
        Duck duck = new Duck();
        Fish fish = new Fish();
        Seal seal = new Seal();
        Fox fox = new Fox();
        /*
        System.out.println("The Duck says " + duck.say());
        System.out.println("The Fish goes " + fish.say());
        System.out.println("Seal Says " + seal.say());
        */
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        animals.add(duck);
        animals.add(fish);
        animals.add(seal);
        animals.add(fox);
        
        /*
        System.out.println("The Duck says " + animals.get(0).say());
        System.out.println("The Fish goes " + animals.get(1).say());
        System.out.println("Seal Says " + animals.get(2).say());
        */
       
       
        for(int x = 0; x < animals.size(); x++){
            System.out.println(animals.get(x) + " says " + animals.get(x).say());
        }
        
        for(Animal x : animals){
            //System.out.println(x + " says " + x.say());
            if(x instanceof Fish){
                System.out.println(x + " goes " +((Fish)x).say());
            } else {
                System.out.println(x + " says " + x.say());
            }
            
            if(x instanceof Seal){
                System.out.println(((Seal)x).play());
            }
            
            if(x instanceof Fox){
                System.out.println(((Fox)x).play());
            }
        }
        
        
    }
}
