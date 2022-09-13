package sub3;

public class Apple {
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	//@Override
	public void show() {
		
		// 객체 정보 조회
		System.out.println("원산지 :" + country);
		System.out.println("가격 :" + price);
		
	}
}
