import java.util.*;
class binarysearchiterative{
    public static void main(String args[]){
        int ele,n;
        int f=0;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added: ");
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        ele=sc.nextInt();
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        if(start>end){
            System.out.println("Element not found!");
        }
        while(start<=end){
            if(ele==a[mid]){
                System.out.println("element found at: "+(mid+1));
                break;
            }
            else if(ele>a[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }   
}