public class Loop {
    public static void main(String[] args) {
        /*
        for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.

The example below will print the numbers 0 to 4:
         */

        {//for loop
            {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            }
            {
                for (int x = 0; x <= 10; x = x + 2) {
                    System.out.println("x values:" + x);
                }
            }
        }

        //nested loops
        {
            {
                // Outer loop
                for (int i = 1; i <= 2; i++) {
                    System.out.println("Outer: " + i); // Executes 2 times

                    // Inner loop
                    for (int j = 1; j <= 3; j++) {
                        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
                    }
                }
                {
                    for (int i = 1; i <= 2; i++) {
                        for (int j = 1; j <= 3; j++) {
                            System.out.print(i + "," + j + " ");
                        }
                    }
                }
            }
        }
    }
}
