public class ExplicitTypeCasting {
    public static void main(String[] args) {
        {
            /*
            Explicit type casting is performed when value of lager data type is assigned to a variable of smaller data type
            It is performed by programmed
            Also known as narrowing or down casting
            Possible conversions
            double -> float -> long -> int -> short -> Byte
            int -> char
             */
            int x= 100;
            byte b = (byte) x;
            System.out.println("value of b: " + b);

        }
        //Types of Assignment
        {
            //Simple assignment
            int x= 100;

            //Chained assignment -> Assigning values to many variables at once
            //Assigned at once
            int a,b,c,d;
            a=b=c=d =100;
            System.out.println("value of a: " + a + ", b: " + b + ", c: " + c + ", d: " + d);

            //Compound assignment -> using assignment operator to assign value with another operator
            byte e = 10;
            e = (byte) (e+1); //type casting
            e+= 1; // compound assignment
            System.out.println("value of e: " + e );
        }

        //Conditional operator
        // boolean-expression? true-boolean : false-boolean
        {
            int a=10, b=20;
            int max = (a > b) ? a : b;
            System.out.println("value of max: " + max);
        }
    }
}
