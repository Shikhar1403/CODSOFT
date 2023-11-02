import java.util.Scanner;
import java.util.Random;
class CodeSoft_TAsk_1 {
    public static void main(String[] args) {
        System.out.println ("---------------------------Numbers Game--------------------------------");
        System.out.println ( "---------------Guess the number between 1 to 50---------------" );
        System.out.println ( "You have 3 attempt to guess right number" );
        int score1=0;
        for (int i = 1; i <= 3; i++)
        {
            Random r = new Random ();
            int num = r.nextInt ( 1, 50 );
            Scanner sc = new Scanner ( System.in );
            System.out.print ( "Guess the number : " );
            int a = sc.nextInt ();
            if ( num == a )
            {
                System.out.println ( " Guess is Correct " );
                if ( num == a )
                {
                    score1++;

                    System.out.println ( "Congratulations!  you correct  right , Your score is  :" + score1 );

                    break;
                }
                break;
            }
            if ( num < a )
            {
                System.out.print ( "Guess is too high , Please try again" + " >>>> " );

            }
            if ( num > a )
            {
                System.out.print ( "Guess is too low , Please try again " + " >>>> " );
            }
            System.out.println ( "Random number is : " + num );
        }
        System.out.println ("You have two more attempts left");
        System.out.println ( "Do you like to play again ? :  yes/no" );
        Scanner sc = new Scanner ( System.in );
        String confirm = sc.nextLine ().toLowerCase ();
        int score2 = 0;
        switch (confirm)
        {
            case "yes":
                for (int i = 1; i <= 2; i++)
                {
                    Random r = new Random ();
                    int num = r.nextInt ( 1, 50 );
                    Scanner sc1 = new Scanner ( System.in );
                    System.out.print ( "Guess the number : " );
                    int a = sc1.nextInt ();
                    if ( num == a )
                    {
                        System.out.println ( " Guess is Correct " );
                        if ( num == a )
                        {
                            score2++;
                            System.out.println ( "Congratulations!  you guess  right , Your score is  :" + score2 );
                            break;
                        }
                    }
                    if ( num < a ) {
                        System.out.print ( "Guess is too high , Please try again" + " >>>> " );
                    }
                    if ( num > a )
                    {
                        System.out.print ( "Guess is too low , Please try again " + " >>>> " );
                    }
                    System.out.println ( "Random number is : " + num );
                }
                case "no":
                    System.out.println ( "Thanks for Playing" );
                    break;
        }
        if ( score2 == 0 )
        {
            System.out.println ( "you lost the game . your score is :" + score2 + " Out of 5 attempts " );
        }
    }
}