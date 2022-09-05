import java.util.Scanner;

public class Program {

    public void runApp(){
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while(running) {

            System.out.println("Welcome, please choose an option");
            System.out.println("1- Convert a number to roman numerical");
            System.out.println("0- Exit");

            int i = input.nextInt();

            System.out.println("");

            switch (i) {
                case 1 -> runConverter();
                case 0 -> running = false;
            }

            System.out.println("");

            System.out.println("Do you want to try again?");
            System.out.println("1- Yes");
            System.out.println("0- No");

            int goAgain = input.nextInt();

            switch (goAgain){
                case 2 -> runConverter();
                case 0 -> running = false;
            }
        }


    }
    public static void runConverter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a number of your choice");

        int number = input.nextInt();

        String rm = RomanNumbers.romanNumber(number);

        System.out.println("Your number in roman numerical: " + rm);
    }

}
