
/**
 * Write a description of class Fox here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fox extends Animal implements Fun
{
    public Fox(){
    }

    public String say(){
        return "REEEEEEEEEEE";
    }

    public String toString() {
        return "Fox";
    }

    public String play(){
        return "The fox chases mice and digs holes!";
    }
}
