public class GradeExam {
    /** Main method */
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            System.out.print("Student ");
            if (i == 0)
            {
                System.out.print("Tom");}
            if (i == 1)
            {
                System.out.print("Per");}
            if (i == 2)
            {
                System.out.print("Mads");}
            if (i == 3)
            {
                System.out.print("Anders");}
            if (i == 4)
            {
                System.out.print("Dan");}
            if (i == 5)
            {
                System.out.print("Hans");}
            if (i == 6)
            {
                System.out.print("Lars");}
            if (i == 7)
            {
                System.out.print("Tim");}




                System.out.println("'s correct count is " +


                    correctCount);
        }
    }
}