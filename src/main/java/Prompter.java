import java.util.Scanner;

public class Prompter {
    private Jar jar;
  
    public Prompter(Jar jar){
      this.jar = jar;
    }
    Scanner scanner = new Scanner(System.in);

    public void setItem(){
        System.out.println("What item should be in the jar?  ");
        jar.setItem(scanner.nextLine());
    }
    public void setItemCount(){
        String item = jar.getItem();
        System.out.printf("How Many %s Should be in the Jar?  ", item);
        jar.setItemCount(Integer.parseInt(scanner.nextLine()));
    }

    public boolean isCorrectGuess(){

        System.out.printf("Guess a number:  ");
        int guess = Integer.parseInt(scanner.nextLine());
       
       if(guess == jar.getItemCount()){
           System.out.println("Correct!");
           return true;
       } else {
           System.out.println("Nope, Try again");
           return false;
       }
       
   }
    

    
}