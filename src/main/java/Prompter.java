import java.util.Scanner;

public class Prompter {
    private Jar jar;
    private int guess;
    private int tries = 1;
  
    public Prompter(Jar jar){
      this.jar = jar;
    }
    Scanner scanner = new Scanner(System.in);

    public void setItem(){
        System.out.println("What item should be in the jar?  ");
        jar.setItem(scanner.nextLine());
    }
    public void setItemCount(){
        System.out.printf("How Many %s Should be in the Jar?  ", jar.getItem());
        jar.setItemCount(Integer.parseInt(scanner.nextLine()));
    }
    
    public void showOptions(){
        System.out.printf("%n%n%n%n%n%n%nGuess how many %s are in the Jar? There are between %d and %d.%n", jar.getItem(), 1, jar.getMaxItems());
    }

    public void makeGuess(){
        System.out.printf("Guess a number:  ");
        guess = Integer.parseInt(scanner.nextLine());
   }

   public boolean isCorrectGuess(){
        boolean isCorrect;
        if(guess > jar.getMaxItems()){
                System.out.printf("Your guess must be less than %d%n", jar.getMaxItems() + 1);
                isCorrect = false;
        } else {
                if(guess == jar.getItemCount()){
                    isCorrect = true;
                    if(tries > 1){
                        System.out.printf("Correct! It took you %d tries!%n", tries);
                    } else {
                        System.out.printf("Correct! It took you %d try!%n", tries);
                    }
                    
                } else {
                    isCorrect = false;
                    tries += 1;
                    System.out.printf("Nope, Try again%n");
                    if (guess > jar.getItemCount()){
                        System.out.printf("Your guess is too high%n");
                    } else {
                        System.out.printf("Your guess is too low%n");
                    }
                }
        }
        return isCorrect;
    }
    

    
}