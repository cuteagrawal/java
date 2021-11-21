/* Name: Cute Agrawal
 * Program: Software Development and Network Engineering
 * Assignment: Lab 3

 * This program asks user a value between 1 and 100.
 * If the user enters correct value, it congratulates them and ask them if they want to play again
 * If the user enters value lesser than the correct answer. It warns them
 * If the user enters value greater than the correct answer. It warns them
 * BONUS{ If the user enters negative value. It takes them out of the program } BONUS
 * BONUS{ It gives them one more opportunity to play the game again } BONUS
 * This program gets two types of values. Integer and Character
 */


import java.util.Scanner;

public class Assignment {
    public static void main(String args[]) {


        char YorNo = 'Y';

        do {
            int Num = (int) (Math.random() * 100 + 1);
            System.out.println("Guess the value between 1 to 100");

            Scanner in = new Scanner(System.in);


            int UserVal;
            do {
                UserVal = in.nextInt();
                if (UserVal < 0) {

                    System.out.println("You decided to end the game");


                } else if (UserVal > Num) {

                    System.out.println("Woops.!! The value you entered is greater than the number. Try again ");


                } else if (UserVal < Num) {

                    System.out.println("Oh no.!! The value entered by you is lesser than the number. Try again ");


                } else {

                    System.out.println("Congratutions");

                }
            } while (!(UserVal == Num) && UserVal > 0);


            System.out.println("The actual number " + Num);
            System.out.println("Want to play again? (y or n)");
            YorNo = in.next().charAt(0);


        } while (YorNo == 'Y' || YorNo == 'y');

        System.out.println("Thanks for playing the game");
    }
}
