package edu.bothellcs.myFirstSpring;

public class GuessingGame{

  private int answer;
  private int tries = 0;
  
  public GuessingGame(){
    this.answer = (int) Math.floor(Math.random() * 100);
  }

  public String guess(String g){
    try{
      int guess = Integer.parseInt(g);
      if(guess < answer){
        return "Your guess is lower than the correct answer. Tries:" + (tries++);
      }
      else if (guess > answer){
        return "Your guess is heigher than the correct answer. Tries:" + (tries++);
      }
      else return "YOU GOT IT! In " + tries;
    }
    catch(Exception e){
      return "something went wrong";
    }
  }
  
  public String tellMeLies(){
    return "the answer is not " + this.answer;
  }
  

  
}