/**
 * Write a program to print the boundary elements of Matrix
 * I/P--->  1   2  3   4 
 *          5   6  7   8
 *          9  10  11  12
 * O/P--->  1-->2-->3-->4-->8-->12-->11-->10-->9-->5-->1
 * 
 */
package L06_BoundaryElements;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int m=3,n=4;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[0][i]+"-->");
        }
        for(int i=1;i<m;i++)
        {
            System.out.print(arr[i][n-1]+"-->");
        }
         for(int i=n-2;i>=0;i--)
        {
            System.out.print(arr[m-1][i]+"-->");
        }
         for(int i=m-2;i>=0;i--)
        {
            System.out.print(arr[i][0]+"-->");
        }
    }
}
