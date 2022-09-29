package sub8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  날짜 : 2022-09-29
 *  이름 : 전인준
 *  내용 : 자바 총정리 실습
 */
public class Test9 {

	public static void main(String[] args) {

		String path = "C:\\Users\\java2\\Desktop\\Gugudan.txt";
		
		try {
			File file = new File(path);			
			FileWriter fw = new FileWriter(file);			
			
			for(int x=2 ; x<=9 ; x++) {
				
				fw.write(x + "단\n");
				
				for(int y=1 ; y<=9 ; y++) {
					int z = x * y;					
					fw.write(x + " x " + y + " = " + z + "\n");			
				}
			}			
			
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("구구단 파일생성 완료...");
	}

}
