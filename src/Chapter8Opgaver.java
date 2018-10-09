import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class Chapter8Opgaver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the exercise you wanna run");
        System.out.print("Enter number of the exercise: ");
        double pick = sc.nextDouble();

        // OPG 8.1
        //Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
        if (pick == 1)
        {
            double[][] matrix = new double[3][4];
            System.out.println("Enter " + matrix.length + " rows and " +  matrix[0].length + " columns: ");
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextDouble();   } }
                sumColumn(matrix,0);
            sumColumn(matrix,1);
            sumColumn(matrix,2);

        }
        if (pick == 1.5)
        {double[][] matrix = new double[3][4];
            System.out.println("Enter " + matrix.length + " rows and " +  matrix[0].length + " columns: ");
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                    matrix[row][column] = sc.nextDouble();   } }
        sumColumnDan(matrix);
        }



        //Opg 8.4
        //Write a program that displays employees and their total hours in decreasing order of the total hours.
        if (pick == 4)
        {
            String[] employees = {"Employee 0","Employee 1 ","Employee 2","Employee 3","Employee 4",
                    "Employee 5","Employee 6","Employee 7"};
            int[][] eHours = {
                    {2,4,3,4,5,8,8},
                    {7,3,4,3,3,4,4},
                    {3,3,4,3,3,2,2},
                    {9,3,4,7,3,4,1},
                    {3,5,4,3,6,3,8},
                    {3,4,4,6,3,4,4},
                    {3,7,4,8,3,8,4},
                    {6,3,5,9,2,7,9}
            };
            int[][] sumEmployee = {
                    {sumColumnInt(eHours,0)},
                    {sumColumnInt(eHours,1)},
                    {sumColumnInt(eHours,2)},
                    {sumColumnInt(eHours,3)},
                    {sumColumnInt(eHours,4)},
                    {sumColumnInt(eHours,5)},
                    {sumColumnInt(eHours,6)},
                    {sumColumnInt(eHours,7)},
            };
            System.out.println(sumEmployee[0][0]);

            int[] lowToHighEmployee = {sumColumnInt(eHours,0),
                    sumColumnInt(eHours,1),sumColumnInt(eHours,2),
                    sumColumnInt(eHours,3),sumColumnInt(eHours,4),
                    sumColumnInt(eHours,5), sumColumnInt(eHours,6),
                    sumColumnInt(eHours,7)};
            Arrays.sort(lowToHighEmployee);
            //So now Employee 0's total hours are  = sumEmployee[0][0] and 1's is sumEmployee[1][0]
            //And right above i've sorted so i can use if to Display the correct employee with the correct hour number.
            //in low to high "var++" or high to low if i use "var--"

        }




    }
//Method slot
    public static void sumColumnDan(double[][] m)
    {for (int k = 0; k < m.length;k++)
    {double total = 0;
    for (int j = 0; j < m[k].length;j++)
    {total += m[k][j];
    }
        System.out.println("The total of column " + k + " is " + total);
    }
}
    public static double sumColumn(double[][] m, int columnIndex)
    {double total = 0;
        for (int j = 0; j < m[columnIndex].length;j++)
        {total += m[columnIndex][j];
        }
        System.out.println("The total of column " + columnIndex + " is " + total);
        return total;
}
    public static int sumColumnInt(int[][] m, int columnIndex)
    {int total = 0;
        for (int j = 0; j < m[columnIndex].length;j++)
        {total += m[columnIndex][j];
        }
        //System.out.println("The total of column " + columnIndex + " is " + total);
        return total;
    }
}
