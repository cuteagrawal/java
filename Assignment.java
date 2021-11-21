import java.util.Scanner;

public class Assignment {
    public static void main(String args[]) {

//        int Num = (int) (Math.random() * 100 + 1);
//        System.out.println("Guess the value between 1 to 100");
//        System.out.println("Value =  " + Num);
//        Scanner in = new Scanner(System.in);
//        int UserVal = in.nextInt();
        char YorNo = 'Y';

        do {
            int Num = (int) (Math.random() * 100 + 1);
            System.out.println("Guess the value between 1 to 100");
            System.out.println("Value =  " + Num);
            Scanner in = new Scanner(System.in);
            int UserVal = in.nextInt();

            do {

                if (Num < UserVal) {

                    System.out.println("Woops.!! The value you entered is greater than the number. Try again ");
                    UserVal = in.nextInt();

                } else if (Num > UserVal && UserVal > 0) {

                    System.out.println("Oh no.!! The value entered by you is lesser than the number. Try again ");
                    UserVal = in.nextInt();

                } else if (UserVal == Num){

                    System.out.println("Congratutions");
                    System.out.println("Want to play again?");
                    YorNo = in.next().charAt(0);

                } else if (!(UserVal >= 0)){

                    System.out.println("You decided to end the game");
                    YorNo = 'N';

                } else{

                    System.out.println("Enter a valid input between 1 to 100");

                }
            } while (UserVal != Num && UserVal > 0);


            System.out.println("The actual number " + Num);


        } while (YorNo == 'Y' || YorNo == 'y');

        System.out.println("Thanks for playing the game");
    }
}
