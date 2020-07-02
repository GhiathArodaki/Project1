import java.util.*; 

public class Project {
  
  public static void main(String[] args) {
    
    Scanner user_input = new Scanner(System.in);
    
    System.out.println("Project\n\n");

    System.out.println("Enter Something:");
    
    String something = user_input.nextLine();

    System.out.println("\n\n\n\n");

    System.out.println("You Entered:" + something);
    System.out.println("I hope that's what you wanted!");
  }
}
