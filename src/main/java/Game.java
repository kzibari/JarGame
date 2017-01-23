import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
      String name=null;
      Scanner scanner=new Scanner(System.in);
      int max=0;
      
      System.out.println("\n\nAdministrator of the Game\n==========================\n\n");
      //Questions to ask the administrator at start of program
      System.out.println("What type of item would be in the jar? ");
      name=scanner.nextLine();
      try{
        System.out.println("What is maximum number of "+ name+ "? ");
        max=Integer.valueOf(scanner.nextLine());
      }catch (NumberFormatException nfe){
        System.out.println("Number format incorrect. "+ nfe.getMessage());
        System.exit(1);
      }
      
      Jar jar=new Jar(name, max);
      jar.fill();
      
      //Now the game starts for the player. The player is asked to make a guess
      System.out.println("\nPlayer\n==========================\n");
      Prompter prompter=new Prompter(jar);
      try {
        boolean isCorrect=false;
        while(!isCorrect)
          isCorrect=prompter.promptForGuess();
      }catch (NumberFormatException nfe){
        System.out.println("Incorrect number format.  "+nfe.getMessage());
        System.exit(1);
      }
      System.out.println("Great job! You got it in "+ jar.getNumOfGuesses() + " attemp(s)!\n" ); 
        
    }
    
}
