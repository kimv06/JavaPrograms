import java.util.*;
class javaassignment1a{
    public static void main(String args[]){
        float a;
        float b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two float numbers: ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        float m=(a*b);
        System.out.printf("%.3f",m);
    }
}