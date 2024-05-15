import java.util.*;
public class numberGuesser {
    public static void GuessGame(int bestScore){
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int random=rand.nextInt(100)+1, guess, noOfGuess=0;
        System.out.println("\nThe computer has chosen a number between 1 and 100 so start guessing!\n");
        do{
            System.out.println("Your guess: ");
            guess=sc.nextInt();
            noOfGuess++;
            if(guess==random){
                break;
            }
            else if(guess>random){
                System.out.println("Too High");
            }
            else{
                System.out.println("Too Low");
            }
        }while(guess!=random);
        System.out.println("\nHURRAY! You have successfully guessed the number!");
        System.out.println("Number of guesses: " +noOfGuess);
        if(noOfGuess<bestScore){bestScore=noOfGuess;}
        System.out.println("Best Score= "+bestScore);
        System.out.println("\n---To continue playing press 1 or press 2 to EXIT game---");
        int input=sc.nextInt();
        if(input==1){GuessGame(bestScore);}
        else{choose();}
        sc.close();
    }

    public static void GuessGame2(int noOfGuesses){
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int random=rand.nextInt(100)+1, guess=0;
        System.out.println("\nThe computer has chosen a number between 1 and 100 so start guessing!\n");
        for(int i=0;i<noOfGuesses;i++){
            System.out.println("Your guess: ");
            guess=sc.nextInt();
            if(guess==random){
                System.out.println("\nHURRAY! You have successfully guessed the number!");
                break;
            }
            else if(guess>random){
                System.out.println("Too High");
            }
            else{
                System.out.println("Too Low");
            }
        }
        if(guess!=random){
            System.out.println("Chances over!Better luck next time!\nMaybe increase the number of tries!?");
        }
        System.out.println("\n---To continue playing press 1 or press 2 to EXIT game---");
        int input=sc.nextInt();
        if(input==1){
            System.out.println("Enter the number of guesses allowed: ");
            int inp=sc.nextInt();
            GuessGame2(inp);}
        else{choose();}
        sc.close();
    }
    public static void choose() {
        Scanner sc=new Scanner(System.in);
        System.out.println("To play with unlimited guesses PRESS 1\nTo play with limited guesses PRESS 2\nTo EXIT press 3");
        int input=sc.nextInt();
        if(input==1){ GuessGame(10000000);}
        else if(input==2){
        System.out.println("Enter the number of guesses allowed: ");
        int num=sc.nextInt();
        GuessGame2(num);}
        else{
            System.out.println("\n----Thank you for playing----");
        }
        sc.close();
    }
    public static void main(String[] args) {
        System.out.println("\n\tWelcome to the Number guessing game\n\t-------All The Best!-------");
        choose();
    }
}
