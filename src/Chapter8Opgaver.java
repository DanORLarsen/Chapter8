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
            String[] employees = {"Employee 0","Employee 1","Employee 2","Employee 3","Employee 4",
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


            int[] lowToHighEmployee = {sumColumnInt(eHours,0),
                    sumColumnInt(eHours,1),sumColumnInt(eHours,2),
                    sumColumnInt(eHours,3),sumColumnInt(eHours,4),
                    sumColumnInt(eHours,5), sumColumnInt(eHours,6),
                    sumColumnInt(eHours,7)};
            Arrays.sort(lowToHighEmployee);
            //So now Employee 0's total hours are  = sumEmployee[0][0] and 1's is sumEmployee[1][0]
            //And right above i've sorted so i can use if to Display the correct employee with the correct hour number.
            //in low to high "var++" or high to low if i use "var--"
            for (int var = (lowToHighEmployee.length-1); var >-1;var--)
            {
                int counter = 0;
            for (int k = 0; k < lowToHighEmployee.length;k++) {
                //Runtime error, since var does go below 0. (Outside the array) HelpFix.
                if (lowToHighEmployee[var]==sumEmployee[k][0]&&  lowToHighEmployee[var] != lowToHighEmployee[var-1])
                {
                    if (counter==1)
                {
                    System.out.print(" and ");
                }
                System.out.print(employees[k]);
                counter++;
                }

            }
              if (counter!=0)
                System.out.println(" worked " + lowToHighEmployee[var] + " hours this week");
            }


        }
        //OPG 8.28
        //Make a method that says if a double array is strictly identical. or not.
        if (pick == 28)
        {
            //Creating array
            int[][] m1 = new int[3][3];
            System.out.println("Enter " + m1.length + " rows and " +  m1[0].length + " columns: ");
            for (int row = 0; row < m1.length; row++) {
                for (int column = 0; column < m1[row].length; column++) {
                    m1[row][column] = sc.nextInt();   } }
            //Creating another array
            int[][] m2 = new int[3][3];
            System.out.println("Enter " + m2.length + " rows and " +  m2[0].length + " columns: ");
            for (int row = 0; row < m2.length; row++) {
                for (int column = 0; column < m2[row].length; column++) {
                    m2[row][column] = sc.nextInt();   } }
            //Calling my equals and displaying it along with text
            System.out.println("They are strictly identical = " + equals(m1,m2));

        }


    }
//Method slot

    //If you only want the output and dont need to work with output after.
    private static void sumColumnDan(double[][] m)
    {for (int k = 0; k < m.length;k++)
    {double total = 0;
    for (int j = 0; j < m[k].length;j++)
    {total += m[k][j];
    }
        System.out.println("The total of column " + k + " is " + total);
    }
} //Outputs for a double
    private static double sumColumn(double[][] m, int columnIndex)
    {double total = 0;
        for (int j = 0; j < m[columnIndex].length;j++)
        {total += m[columnIndex][j];
        }
        System.out.println("The total of column " + columnIndex + " is " + total);
        return total;
} //Outputs for an int
    private static int sumColumnInt(int[][] m, int columnIndex)
    {int total = 0;
        for (int j = 0; j < m[columnIndex].length;j++)
        {total += m[columnIndex][j];
        }
        //System.out.println("The total of column " + columnIndex + " is " + total);
        return total;
    }
//Equals method, could easily become method for "contains same numbers" with a sort call first and then checking.
    private static boolean equals(int[][] array1, int[][] array2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array1[i][j] != array2[i][j])
                    return false;
            }
        }
        return true;
    }

}
