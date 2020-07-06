import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
      int age;
      String first_name;
      String last_name;
      String citizenship;
      String citizenship_n;
      String state;
       Scanner user_input = new Scanner(System.in); 
        System.out.println("Hello! my name is Nardin, what is your First name?");
        first_name = user_input.nextLine();
        System.out.println("Hello!" + first_name);
      
      System.out.println("What is your last name?");
      last_name = user_input.nextLine();
      System.out.println("Hello!" + first_name + last_name);
    System.out.println("Are you a U.S. citizen?");
    citizenship = user_input.nextLine();

    switch(citizenship) {
      case "yes":
      System.out.println("Which state do you reside in?");
      state = user_input.nextLine();
      System.out.println("Beautiful state! I would love to visit!");
      break;
      case "no":
      System.out.println("Where are you from?");
      citizenship_n = user_input.nextLine();
      System.out.println("Very beautiful country! I would love to visit!");
      break;
    }

    System.out.println("How old are you?");
    age = user_input.nextInt();
    if(age >= 21) {
    System.out.println("My creator turned 21 this year!");
    }
    else {
    System.out.println("May you live long!");
    }
  }
}
