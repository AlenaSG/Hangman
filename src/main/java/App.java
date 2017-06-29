import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class App {
  public static void main(String[] args) {
  Console myConsole = System.console();


  System.out.println("Hello! Are you ready to start the game? Enter YES or NO");
  String userStart = myConsole.readLine();
  if (userStart.equals("YES")){
    System.out.println("Guess a letter.");
    String userLetter = myConsole.readLine();
    Hangman newGame = new Hangman(userLetter);
    Integer number = newGame.getRandom();
    String stringFromColorArray = new String(newGame.mColors[number]);
    char[] result = stringFromColorArray.toCharArray();
    System.out.println(result.getClass());



      // System.out.println("Please enter a letter to guess our word.");
      // String userLetter = myConsole.readLine();

    } else {
      System.out.println("Goodbye");
   }


  /*String userAnswer = newGame.compareChoice(userStart);
  if(userAnswer.equals("Start Game")) {
    System.out.println("Guess a letter for us to check!");
    String userGuess = myConsole.readLine();
    newGame.setGuessedWord(userGuess);

  }*/
  //System.out.println(startGame);
 }
}
