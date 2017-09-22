/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */
import java.util.Random;

public class SciFiName   
{
    /**
     * All input that you provide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    

    public static void main()
    {
        
        String p1;
        p1 = "NULL";
        String p2;
        p2 = "NULL";
        String SciFiName1;
        SciFiName1 = "NULL";
        String p3;
        p1 = "NULL";
        String p4;
        p2 = "NULL";
        String SciFiName2;
        SciFiName2 = "NULL";
        int relLen1;
        relLen1 = 1;
        int relLen2;
        relLen2 = 1;
        
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this method (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
   
        p1 = firstName.substring(1,3);
        
        p2 = lastName.substring(1,2);
        
        SciFiName1 = p1 + p2;
        
        p3 = city.substring(1,2);
        p4 = school.substring(1,3);
        
        SciFiName2 = p3 + p4;
        
        String p1CAP = firstName.substring(0,1);
        String p2CAP = lastName.substring(0,1);
        p1CAP = p1CAP.toUpperCase();
        p2CAP = p2CAP.toUpperCase();
        
        
        System.out.println("Your SciFi name is" + " " + p1CAP + SciFiName1 + " " + p2CAP + SciFiName2);
        

        
        
        String SciFiFullName = p1CAP + SciFiName1 + " " + p2CAP + SciFiName2;
        
        relLen1 = relativeName1.length();
        relLen2 = relativeName2.length();
        
        Random rand = new Random(); 
        
        int P1 = rand.nextInt(relLen1 - 1) + 1;
        int P2 = rand.nextInt(relLen2 - 1) + 1;
        
        String P3 = relativeName1.substring(0, P1);
        String P4 = relativeName2.substring(0, P2);
    
        String Planet = P3 + P4;
        
        System.out.println("Hello" + " " + SciFiFullName + " " + "from the planet" + " " + Planet);
        
    }
}
