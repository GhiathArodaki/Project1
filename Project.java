import java.util.*; 

public class Project {
  
  public static void main(String[] args) {
    
    Scanner user_input = new Scanner(System.in);
    
    System.out.println("Welcome!\n\n");

    System.out.println("What Should I call you?");
    
    String something = user_input.nextLine();

    System.out.println("\n\n\n\n");

    System.out.println("Hello," + something);
    System.out.println("I hope you are doing well today!");
  }
}
