public class SwitchCase {
    public static void main(String[] args) {
        /*
        The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional, and will be described later in this chapter
         */
        {
            int day = 7;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
            // do while infinite loop since the condition is always true
//            {
//                int i = 0;
//                do {
//                    System.out.println(i);
//                }
//                while (i < 5);
//
//            }
        }
    }
}
