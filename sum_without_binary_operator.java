import java.util.*;
class sum_without_binary_operator
{
    static int add(int a , int b)
    {
        int c = 0;
        while(b != 0)
        {
            c = a&b;
            a = a^b;
            b = c<<1;
        }
        return a;
    }
    public static void main(String args[])
    {
        int a = 0 , b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        System.out.println("Enter another number: ");
        b = sc.nextInt();
        System.out.println("The sum of two numbers = " +add(a,b));
    }
}
