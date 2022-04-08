import java.util.*;
class javaassignment1b{
    public static void main(String args[]){
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
    }
}