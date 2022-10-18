import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String [] args) {

        //2d arrays - arrays made of smaller arrays
        int [][] numbers = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}};
        //the first index refers to the row
        //second index refers to a position within a row
        System.out.println("row 0, col 2 is " + numbers[0][2]);
        System.out.println("row 2, col 0 is " + numbers[2][0]);

        //a 2d array's length is the number of subarrays (rows)
        System.out.println(numbers.length);

        //number of cols is the length of one of the subarrays (rows)
        System.out.println(numbers[0].length);

        //print the row with index 1
        System.out.println("row 1:");
        for(int i = 0; i < numbers[1].length; i++) {
            System.out.print(numbers[1][i] + " ");
        }
        System.out.println();

        //print column 0
        System.out.println("col 0:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][0] + " ");
        }
        System.out.println();

        System.out.println();

        //print the 2d array as a table
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                //"\t" is a tab character to get consistent
                //spacing
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        //for-each loops for 2d arrays:
        //outer loop treats each element of the 2d array
        //as a 1d array
        //inner loop iterates like a regualar array to
        //get each value
        for (int [] row: numbers) {
            for (int n: row) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }
        System.out.println();

        //print row 1 with a for-each
        System.out.println("row 1:");
        for (int n: numbers[1]) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        String [] names = {"bob", "joe", "SOREN!!!!"};
        String [] subjects = {"engineering", "basket weaving", "history", "paper mache"};

        //2d int array of grades where
        //each row represents a student
        //each col represents a subject
        int [][] grades = new int[names.length][subjects.length];

        //ask for each student's grade in each class and save to the grades array
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[0].length; j++) {
//                System.out.println("What did " + names[i] + " get in " + subjects[j] + "?");
//                int grade = s.nextInt();
                int grade = (int)(Math.random()*30 + 70);
                grades[i][j] = grade;
            }
        }

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }

        //calculate and print the average grade each student has in their
        //4 classes (row avg)

        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            //divide by the number of subjects (columns)
            int avg = sum / grades[i].length;
            System.out.println(names[i] + "'s grade avg: " + avg);

        }

        //calculate and print each subject's avg grade (column avg)

        //outer loop iterates through columns
        //inner loop iterates through rows
        for (int j = 0; j < grades[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i][j];
            }
            int avg = sum / grades.length;
            System.out.println("the avg grade for " + subjects[j] + " is "
            + avg);
        }

    }
}
