package ch04;

public class p105 {

	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case"Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다");
			break;
		default:
			System.out.println("메달이없습니다.");
			break;
			
			
		}

	}

}
