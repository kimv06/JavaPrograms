import java.util.*;
class linearsearch{
    public static void main(String args[]){
        int ele,n;
        int f=0;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added: ");
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        ele=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==ele){
                System.out.println("ELEMENT FOUND.");
                f=1;
            }
        }
        if(f==0){
            System.out.println("Element not found!");
            
        }
    }
}