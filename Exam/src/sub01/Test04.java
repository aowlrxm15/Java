package sub01;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 :");
		int score = sc.nextInt();
		char grade;
		
		//grade
		
		if(score >= 90 && score <=100) {
			grade = 'A';
		}else if (score >= 80 && score <=90) {
			grade = 'B';
		}else if (score >= 70 && score <=80) {
			grade = 'C';
		}else if (score >= 60 && score <=70) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("등급은 %c입니다." , grade);
		
		
		
		
		// 80 90 순서대로내려감
	}

}
