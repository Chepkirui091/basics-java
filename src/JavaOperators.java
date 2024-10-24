public class JavaOperators {
    public static void main(String[] args) {
        // OPERATORS
         /*
        Arithmetic operators:+ - * / % ++ --
        Relational operators: == != > < >= <=
        Logical operators: && || !
        Assignment operators: = += -+ /+ %=
        conditional operators: ? :

         */
        {
            int a = 10, b = 5, c = 50, d = 25;
            System.out.println("a+b= " + (a + b));
            System.out.println("a-b= " + (a - b));
            System.out.println("a*b= " + (a * b));
            System.out.println("c/b= " + (c / b));
            System.out.println("a%b= " + (b % a));
        }

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
        /*
        We can use increment and decrement with variables and not constants
        Nesting of increment and decrement operators is not allowed
         */
        {
            int x=200;
            int y=x++;
            int z = ++x;
            System.out.println("value of xxx= " + x);
            System.out.println("value of y= " + y);
            System.out.println("value of z= " + z);
        }
        //Relational operators
        {
            int a =10, b=20, c=15, d=25;
            System.out.println("a==b= " + (a == b));
            System.out.println("a!=c= " + (a != c));
            //Logical
            System.out.println("&&: " + ((a != d) && (a < b))); //both are true
            System.out.println("||: " + ((a == d) || (a == b))); // either is true

            //assignment
            a+= b; //a=a+b
            System.out.println("a+b= " + (a));

        }
    }
}
