import java.util.Scanner;

public class LoopChallenge {
    public static void main(String[] args) {
        {
            System.out.println("Please enter your age");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age > 18) {
                System.out.println("Eligible");
            } else if (age < 18) {
                System.out.println("Not Eligible");
            }
        }
        {
            System.out.println("Please enter your age");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age > 21 && age < 55) {
                System.out.println("savings account");
            }
            else if (age > 55) {
                System.out.println("Senior citizen account");
            }
            else if (age < 21) {
                System.out.println("ineligible");
            }
        }
    }
}
