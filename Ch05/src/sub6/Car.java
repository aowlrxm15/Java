package sub6;

public class Car {

	// 속성
	protected String name;
	protected String color;
	protected int speed;
	
	//클래스 변수(정적 변수), 클래스 메서드(정적 메서드)는 
	//static을 선언한 클래스의 멤버를 말하며,
	//Data 영역에 생성되기 때문에 객체 생성 없이 클래스로 참조 가능하다
	
	// 생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
	}
	
	
	
	
	
	
	// 기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed; 
	}
	public void show () {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("현재속도 : "+speed);
		
		
	}

}


