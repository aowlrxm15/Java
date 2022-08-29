package sub3;

public class Car {

	// 속성
	private String name;
	private String color;
	private int speed;
	public static int count; 
	//클래스 변수(정적 변수), 클래스 메서드(정적 메서드)는 
	//static을 선언한 클래스의 멤버를 말하며,
	//Data 영역에 생성되기 때문에 객체 생성 없이 클래스로 참조 가능하다
	
	// 생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	
	//Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
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


