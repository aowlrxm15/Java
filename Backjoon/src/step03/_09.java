package step03;
import java.util.Scanner;
public class _09 {

	public static void main(String[] args) {
				
	Scanner in = new Scanner(System.in);
	
	int N = in.nextInt();
	in.close();
	
	for(int i = 1; i <= N; i++) {
		for(int j = 1; j<= i; j++) {
			System.out.println("");
		}
		System.out.println();
		for(int k = 0; k<i; k++) {
			System.out.println("*");	
		}
		System.out.println();
	}
				

			}

		


	}


