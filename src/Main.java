import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int marks, totalMarks=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of subjects");
        int noOfSub = sc.nextInt();
        for (int i=0; i<noOfSub; i++) {     //Taking user input
            System.out.println("Enter the marks of sub" + (i + 1) + " (out of 100)");
            marks = sc.nextInt();
            totalMarks += marks;  //Calculation of total marks obtained
        }
        double avg = (double) totalMarks / noOfSub;   //Calculation of average
        System.out.println("_______________Result_______________");
        System.out.println("Total marks: "+totalMarks+" (out of "+(noOfSub*100)+")");
        System.out.println("Average percentage: "+avg+"%");

        if (avg > 90){       //Calculation of grade
            System.out.println("Grade: O");
        }else if (avg > 80) {
            System.out.println("Grade: A+");
        }else if (avg > 70) {
            System.out.println("Grade: A");
        }else if (avg > 60) {
            System.out.println("Grade: B+");
        }else if (avg > 50) {
            System.out.println("Grade: B");
        }else if (avg > 40) {
            System.out.println("Grade: C");
        }else if (avg > 35) {
            System.out.println("Grade: P");
        }else {
            System.out.println("Fail");
        }
    }
}