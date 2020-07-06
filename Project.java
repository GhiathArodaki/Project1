import java.util.*;

public class Project {

    public static void main(String[] args) {
       Scanner user_input = new Scanner(System.in); 
        System.out.println("Hello! my name is Nardin, what is yours?");
        
        String name = user_input.nextLine();
        System.out.println("Hello!" + name);
       
        Scanner user_age = new Scanner(System.in);
        System.out.println("How old are you?" + name);
        
        int age = user_age.nextLine();
        
        System.out.println("Amazing! I pray you live a long life!");
        
        
            
}
