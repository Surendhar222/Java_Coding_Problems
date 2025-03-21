package Collection_Evaluation;

import java.util.Scanner;

public class Input {

    static Scanner scan = new Scanner(System.in);

    public static int details() throws TooYoungException{
        System.out.println("Enter Your name");
        String name = scan.next();

        System.out.println("Enter your age");
        int age = 0;
        age = scan.nextInt();
       
            if (age < 18) {
                throw new TooYoungException("You are below 18 not eligible to vote");
            }

        Voter voter = new Voter(name, age);

        System.out.println("Enter 1 for termination , 0 for continue");
        int termination = scan.nextInt();

        return termination;
    }

    // public boolean check(int age){
    //     if (Voter.getAge() < 18) {
    //         throw new TooYoungException();
    //     }
    // }

}