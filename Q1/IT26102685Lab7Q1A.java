import java.util.Scanner;
public class IT26102685Lab6Q1A{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int i=1;
		double marks,total=0 , average;
		String grade;
		
		while (i<=4){
			
		
			System.out.print("Enter Subject Mark " +i +": ");
			marks = input.nextDouble();
			i++;
			total = total + marks;
		}
		
		average = total/ (i-1);
		System.out.println("\nAverage is : " +average);
				
		if (average >= 75) {
			grade = "Distinction";
		} else if (average >= 50) {
			grade = "Credit";
		}else {
			grade = "Fail";
		}
		System.out.println("Overall grade is : " +grade); 
	}
}