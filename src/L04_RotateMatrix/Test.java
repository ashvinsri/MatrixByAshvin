/**
 * Write a java program to rotate a matrix 90 degree counter clockwise
 * I/P--->  1  2  3
 *          4  5  6
 *          7  8  9
 * O/P--->  3  6  9
 *          2  5  8
 *          1  4  7
 * 
 */
package L04_RotateMatrix;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    static void swap(int arr[][],int a,int b)
    {
        arr[a][b]=arr[a][b]+arr[b][a];
        arr[b][a]=arr[a][b]-arr[b][a];
        arr[a][b]=arr[a][b]-arr[b][a];
    }
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
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                swap(arr,i,j);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0,k=n-1;j<k;j++,k--)
            {
                arr[j][i]=arr[j][i]+arr[k][i];
                arr[k][i]=arr[j][i]-arr[k][i];
                arr[j][i]=arr[j][i]-arr[k][i];

            }   
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


