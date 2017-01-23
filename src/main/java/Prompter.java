import java.util.Scanner;
class Prompter{
  private Jar jar;
  private Scanner scanner;
  
  public Prompter(Jar jar){
    this.jar=jar;
    scanner=new Scanner(System.in);
  }
    

  public boolean promptForGuess()throws NumberFormatException{
  
    System.out.println("Guess the number of " +jar.getName()+" in the jar. (Choose a number between 1 and "+jar.getMaxNoOfItems() + ") :  ");
    int answer=Integer.valueOf(scanner.nextLine());
    if (answer >jar.getMaxNoOfItems())
    {
      System.out.println("The number must be less than "+jar.getMaxNoOfItems());
      return false;
    }
    else
    {
      if(answer>jar.getNumOfItems())  
        System.out.println("Your guess was too high!");
      if(answer<jar.getNumOfItems())  
        System.out.println("Your guess was too low!");
      return  jar.applyGuess(answer);
    }
  }
  
  
}
