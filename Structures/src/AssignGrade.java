import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static double assignGrade (int grade){
		
		if (grade >= 95){
			return 1.0;
		}
		if (grade >= 90){
			return 1.3;
		}
		if (grade >= 85){
			return 1.7;
		}
		if (grade >= 80){
			return 2.0;
		}
		if (grade >= 75){
			return 2.3;
		}
		if (grade >= 70){
			return 2.7;
		}
		if (grade >= 65){
			return 3.0;
		}
		if (grade >= 60){
			return 3.3;
		}
		if (grade >= 55){
			return 3.7;
		}
		if (grade >= 50){
			return 4.0;
		}
		if (grade >= 0){
			return 5.0;
		}
		return -1.0;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int grade = scan.nextInt();
		
		System.out.println(assignGrade(grade));
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
	}
}
