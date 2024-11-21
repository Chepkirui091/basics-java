public class IfElseRealTimeExamples {
    public static void main(String[] args) {
        //even numbers
        {
            int myNumber = 10;

            if (myNumber % 2 == 0) {
                System.out.println("The number is even number");
            } else {
                System.out.println("The number is odd number");
            }
        }

        //Voting age
        {
            int myAge = 23;
            int votingAge = 18;

            if (myAge >= votingAge) {
                System.out.println("You are eligible for voting");
            } else {
                System.out.println("You are not eligible for voting");
            }
        }

        //positive or negative number
        {
            int num = 0;

            if (num > 0) {
                System.out.println("The number is positive");
            } else if (num < 0) {
                System.out.println("The number is negative");
            } else {
                System.out.println("The number is zero");
            }
        }

        //open door
        {
            int doorCode = 8439;

            if (doorCode == 8439) {
                System.out.println("Correct door code. The door is now open");
            } else {
                System.out.println("Incorrect door code. The door remains closed");
            }
        }
    }
}
