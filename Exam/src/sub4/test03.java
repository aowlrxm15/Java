package sub4;
/*
 * 날짜 : 2022-09-16
 * 이름 : 전인준
 */

public class test03 {
	public static void main(String[] args) {

		String fileName = "자바 프로그래밍.pdf";
		
		int idx = fileName.lastIndexOf("."); 
		
		String title = fileName.substring(0,8); // 0,idx  
		String ext= fileName.substring(9,12);  // idx+1
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
	}
}
