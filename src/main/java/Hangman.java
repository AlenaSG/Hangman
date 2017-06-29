import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {

private String mAnswer;
private String mGuessedWord;
public String[] mColors = {"yellow", "red", "green", "white", "blue", "violet"};
//private String mCurrentGuessedWord;

  public Hangman (String guessedWord){
    mGuessedWord = guessedWord;
    //mCurrentGuessedWord = "";
  }

  public Integer getRandom(){

    Random random = new Random();
    Integer number = random.nextInt(mColors.length);
    return number;
  }


  //List<String> myAnswer = new ArrayList<String>();
  //List<String> myGuess = new ArrayList<String>();

  //Hangman Anton = new Hangman();


  public String getAnswer(){
      return mAnswer;
  }

  public String getGuess(){
    return mGuessedWord;
  }

  // public String setGuessedWord(String userWord) {
  //   mCurrentGuessedWord = userWord;
  // }

}
