import java.util.Random;
public class Jar{
 
  private String name;
  private int maxNoOfItems;
  private int noOfItems;
  private int numOfGuesses;
  private boolean correctGuess;
  
  public Jar(String name, int max){
   this.name=name;
   maxNoOfItems=max;
   correctGuess=false;
   numOfGuesses=0;
  }
  public void fill(){
    Random random=new Random();
    noOfItems=random.nextInt(maxNoOfItems)+1; 
    
  }
  
  public int getMaxNoOfItems(){
   return maxNoOfItems; 
  }
  public int getNumOfItems(){
    return noOfItems;
  }
  
  public boolean isEmpty(){
    return noOfItems==0;
  }
  public boolean isCorrectGuess(){
    return correctGuess; 
  }
  public boolean applyGuess(int num){
    
    numOfGuesses++;
    return num==noOfItems;
 
  }
  public int getNumOfGuesses(){
    return numOfGuesses;
  }
  public String getName(){
        return name;
  }
  
  
}