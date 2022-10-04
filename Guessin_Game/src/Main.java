//guessing game without swing
import java.lang.*;
import java.util.*;
public class Main {
    public static void Checksolution(int user_input, int guessCount) {

        //initializing computer's number
       int computers_number = (int) (Math.random() * 11);

       //checking if User have guessed the guess
       if(user_input == computers_number) {
           System.out.println("Congratulations you have won on " + guessCount + " guess");
           System.exit(0);
       }else {
           System.out.println("Failed !");
       }

    }
    public static void main(String[] args) {

        //initializing variables;
        int guess_count = 1, users_number;

        //initializing Scanner for getting inputs;
        Scanner input = new Scanner(System.in);

        while(guess_count <= 10) {

            //getting user inputs
            System.out.println("Enter a guess " + guess_count + " : ");
            users_number = input.nextInt();

            //calling Check solution method to check if user guessed well
            Checksolution(users_number, guess_count);

            guess_count++;
        }

        System.out.println("You are out of guess counts !!");
        input.close();

    }

}