//clear && javac GuessingGame.java && java GuessingGame
public class GuessingGame {
    public static void main(String[] args) {
        Jar jar = new Jar();
        Prompter prompter = new Prompter(jar);

        prompter.setItem();
        prompter.setItemCount();
        prompter.showOptions();
        jar.fill();
        do {
            prompter.makeGuess();
        } while (!prompter.isCorrectGuess());
        


        
    }
}
