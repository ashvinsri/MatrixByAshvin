/**
 * Wrte a java program to print matrix in spiral order
 * I/P--->  1-->2-->3-->  4
 *                        |
 *         5   6---> 7    8
 *         |         |    |
 *         9   10--> 11    12
 *         |    |     |    |
 *        13   14<-- 15    16
 *         |               |
 */       17<--18<--19<-- 20
package SpiralOrderTraversal;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        int l=0,r=0;
        while(l<=m && r<=n)
        {
        for(int i=l;i<n;i++)
            System.out.print(arr[r][i]+" ");
            r++;
        for(int i=r;i<m;i++)
            System.out.print(arr[i][n-1]+" ");
            n--;
        for(int i=n-1;i>=l;i--)
            System.out.print(arr[m-1][i]+" ");
           m--;
        for(int i=m-1;i>=r;i--)
            System.out.print(arr[i][l]+" ");
        l++;
        }
    }
}
