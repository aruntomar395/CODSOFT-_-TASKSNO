import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {

            int marks;

            do {
                System.out.print("Enter marks for Subject " + i + " (0-100): ");
                marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                }

            } while (marks < 0 || marks > 100);

            totalMarks += marks;
        }

        double average = (double) totalMarks / subjects;

        String grade;

        if (average >= 90) {
            grade = "A+";
        }
        else if (average >= 80) {
            grade = "A";
        }
        else if (average >= 70) {
            grade = "B";
        }
        else if (average >= 60) {
            grade = "C";
        }
        else if (average >= 50) {
            grade = "D";
        }
        else if (average >= 40) {
            grade = "E";
        }
        else {
            grade = "F";
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        if (grade.equals("F")) {
            System.out.println("Result: Fail");
        }
        else {
            System.out.println("Result: Pass");
        }

        sc.close();
    }
}
