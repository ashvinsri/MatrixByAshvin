/**
 * Print Matrix in Snake Pattern
 *   1  2  3
 *   4  5  6
 *   7  8  9
 * 
 * O/P-->
 *        1-->2-->3-->6-->5-->4-->7-->8-->9
 * 
 */
package L02_SnakePattern;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n=3;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i%2!=0)
                    System.out.print(arr[i][n-1-j]+" ");
                else
                    System.out.print(arr[i][j]+" ");
            }
        }
    }
}
