/**
 * Matrix is created using 2D array. In java we mostly create 2D Array by 2 methods one by array Other by ArrayList
 * int arr[][]=new int[m][n];
 * ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
 * 
 */
package L01_MatrixInJava;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        // Better way is to use collection for creating a 2D array
        
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<3;i++)
        {
            al.add(i,new ArrayList<Integer>());
            for(int j=0;j<3;j++)
            {
                al.get(i).add(obj.nextInt());
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(al.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
