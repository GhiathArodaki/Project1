import java.util.*; 

public class Project {
  
  public static void main(String[] args) {
    
    Scanner user_input = new Scanner(System.in);
    
    System.out.println("Welcome to the 5th Dimension!\n");

    System.out.println("What is your name?");
    
    String something = user_input.nextLine();
    
    System.out.println("Hello," + something);
    System.out.println("I hope you are doing well today!\n\n");
    System.out.println("Let us play a game, guess the first letter of my name!");
    
    Scanner user_input = new Scanner(System.in);
    
    char myguess = user_input.nextLine();
    
    if (char myguess != 'N') {
      System.out.println("Sorry, you guessed wrong!, try again.");
      return Scanner; 
    }
    
  }
}
