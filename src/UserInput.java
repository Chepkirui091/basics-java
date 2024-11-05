import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        {
            //Accepting input string
            Scanner sc = new Scanner(System.in);
            String firstStr = sc.nextLine();
            System.out.println("You have entered Str:" + firstStr);

            //input integer
            int a = sc.nextInt();
            System.out.println("You have entered int:" + a);
        }
        {
            Scanner details = new Scanner(System.in);
            System.out.println("What's your Name:");
            String Name = details.nextLine();
            System.out.println("Hi" + Name);
            System.out.println("What's your Age:");
            int Age = details.nextInt();
            System.out.println("You are " + Age + " years old");
        }
    }
}
