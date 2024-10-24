public class FirstJavaClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //declare variable
        int firstVariable;

        //initialize a variable
        firstVariable = 10;
        int secondVariable = 20;
        int total = firstVariable + secondVariable;

        System.out.println("firstVariable:" + firstVariable);
        System.out.println("Total:" + total);

        {
            char myChar = '\u0043';
            System.out.println(myChar);
        }
    }

}


