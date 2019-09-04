import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2;

        System.out.print( "First number? " );
        num1 = keyboard.nextInt();

        System.out.print( "Second number? " );
        num2 = keyboard.nextInt();

        System.out.println("The average of the two numbers is: " + (num1+num2)/2);
    }
}