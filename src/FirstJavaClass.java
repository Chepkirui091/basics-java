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

        // OPERATORS
         /*
        Arithmetic operators:+ - * / % ++ --
        Relational operators: == != > < >= <=
        Logical operators: && || !
        Assignment operators: = += -+ /+ %=
        conditional operators: ? :

         */
        int a=10, b=5, c=50, d=25;
        System.out.println("a+b= "+ (a+b));
        System.out.println("a-b= "+ (a-b));
        System.out.println("a*b= "+ (a*b));
        System.out.println("c/b= "+ (c/b));
        System.out.println("a%b= "+ (b%a));

        //Increment operators
        {
            int x=100;
            int y=x++;  //postincrement: value is assigned or used in an expression first and then incremented
            int z = ++x;  //preincrement: value is incremented first and then assigned or used in an expression
            System.out.println("value of x= " + x);
            System.out.println("value of y= " + y);
            System.out.println("value of z= " + z);

        }
        {
            int x=100;
            int y=x--;  //postincrement: value is assigned or used in an expression first and then incremented
            int z = --x;  //preincrement: value is incremented first and then assigned or used in an expression
            System.out.println("value of x= " + x);
            System.out.println("value of y= " + y);
            System.out.println("value of z= " + z);

        }
    }

}


