/*
____________________________________
//      \\/////   \\\\\\|    \\|  ||
//  ||   \\///     \\\\\|     \|  ||
//  |||  ||//  /_\  \\\\|  |\  |  ||
//  ||  ////   ___   \\\|  |\\    ||
//_____////__/     \__\\|  |\\\___||
////////////////////////////////////
*/

import java.util.Scanner;

public class Chapter8ReadingTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(Check number of desired assignment");
        System.out.print("Enter which code u want to see: ");
        int pick = sc.nextInt();

        if (pick == 1)
        {
        //Show output of following code
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--)
                System.out.print(array[i][j] + " ");  System.out.println(); }

    }
if (pick == 2)
{int[][] array = {{1, 2}, {3, 4}, {5, 6}};
int sum = 0;
for (int i = 0; i < array.length; i++)
    sum += array[i][0]; System.out.println(sum);}

    if (pick == 3) //This method counts number of arrays in the array, and the 2nd time is how many numbers
        //there is inside the 1st array (index 0)
    {  int[][] array = {{1, 2, 3, 4, 5}, {5, 6, 7, 8}};
    System.out.println(m1(array)[0]);
    System.out.println(m1(array)[1]);}

        if (pick == 4)
        {}


}
    public static int[] m1(int[][] m) {
        int[] result = new int[2];
        result[0] = m.length;
    result[1] = m[0].length;
    return result;  }}
