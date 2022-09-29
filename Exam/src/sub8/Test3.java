package sub8;
/*
 *  날짜 : 2022-09-29
 *  이름 : 전인준
 *  내용 : 자바 총정리 실습
 */

class Member {
	private String name;
	private String hp;
	private int age;
	
	public Member(String name, String hp, int age) {
		this.name = name;
		this.hp = hp;
		this.age = age;
	}
	
	@Override
		public String toString() {
			return String.format("%s,%s,%d", name, hp, age);
		}
}
public class Test3 {

	public static void main(String[] args) {
		
		Member m1 = new Member("김유신", "010-1234-1011", 25);
		Member m2 = new Member("김춘추", "010-1234-1012", 23);
		
		System.out.println(m1);
		System.out.println(m2);

		
	}

}
