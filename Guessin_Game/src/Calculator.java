import java.util.*;
import java.lang.*;

class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char operator;
        int firstNumber, secondNumber;

        System.out.println("Enter firstnumber : ");
        firstNumber = input.nextInt();

        System.out.println("Enter operator : ");
        operator = input.next().charAt(0);

        System.out.println("Enter secondnumber : ");
        secondNumber = input.nextInt();

        switch (operator) {
            case '+':
                System.out.println( " The sum is  : " + (firstNumber + secondNumber));
                break;

            case '-':
                System.out.println( " The sum is  : " + (firstNumber - secondNumber));
                break;

            case '*':
                System.out.println( " The sum is  : " + (firstNumber * secondNumber));
                break;

            case '/':
                System.out.println( " The sum is  : " + (firstNumber / secondNumber));
                break;
        }

        input.close();
    }
}