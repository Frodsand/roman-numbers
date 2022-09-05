import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please write a number of your choice");

        int number = input.nextInt();

        String rm = RomanNumbers.romanNumber(number);

        System.out.println(rm);

    }
}
