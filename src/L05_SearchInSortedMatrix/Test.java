/**
 * Write a Java program to search an element in row wise and column wise sorted Matrix O(r+c)
 * 
 */
package L05_SearchInSortedMatrix;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        int i=0,j=n-1;
        int search=obj.nextInt();
        if(n==0||search<arr[0][0]||search>arr[n-1][n-1])
        {
            System.out.println("Not FOund");
        }
        else
        {
        while(i<n && j>=0)
        {
            if(arr[i][j]==search)
            {
                System.out.println("Found at-->("+i+","+j+")");
                break;
            }
            if(search>arr[i][j])
                i++;
            else
                j--;
        }
        }
        if(i==n)
        System.out.println("Element Not Found");
    }
}
