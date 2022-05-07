import java.util.*;
class binarysearchrecursive
{
    int binarysearch(int a[],int start,int end,int ele)
    {
        int mid = start+((end-start)/2);
        if(start >= end)
        {
            return -1;
        }
        else if(ele == a[mid])
        {
            return mid;
        }
        else if(ele>mid)
        {
            return binarysearch(a,mid+1,end,ele);
        }
        else
        {
            return binarysearch(a,start,mid-1,ele);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        binarysearchrecursive ob = new binarysearchrecursive();
        System.out.println("Enter the number of elements to be added: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            System.out.print("Enter the element: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int ele = sc.nextInt();
        int f = ob.binarysearch(a,0,n-1,ele);
        if(f != -1)
        {
            System.out.println("Element found at index-"+(f+1));
        }
        else
        {
            System.out.println("Element not found!");
        }
    }
}