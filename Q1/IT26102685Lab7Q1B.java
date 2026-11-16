import java.util.Scanner;
	public class IT26102685Lab7Q1B{
		public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
	
		for (int i = 1; i <=3; i++){
		System.out.println("Student " +i);
		System.out.print("Enter marks: ");
		
		double marks1 = input.nextDouble();
		double marks2 = input.nextDouble();
		double marks3 = input.nextDouble();
		double marks4 = input.nextDouble();
		
		
		double average = (marks1+marks2+marks3+marks4)/4.0;
		System.out.println("Average is :" + average);
		
		
		String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
            
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
		}
	}
} 
	