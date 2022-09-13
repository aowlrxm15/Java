# Java

## 1장 Java 소개 및 개발환경 구축
    -hello java : 자바 개발환경 구축실습

## 2장 기본문법과 변수,연산자
    -VariableTest : java 변수 실습
        
    -DataTypeTest : java 자료형 실습
    
    -OperatorTest : java 연산자 실습

## 3장 제어문
    -ifTest : java 조건문 if 실습
    if , if ~ else , if ~ else if ~ else

    -SwitchTest : java 조건문 switch 실습

    -ForTest : java 반복문 for 실습

    -WhileTest : java 반복문 while 실습
    
## 4장 배열과 메서드
    -ArrayTest : 배열 실습

    -MethodTest : Method 실습
    자주 사용하는 코드 로직을 모듈화한 구조체
    메서드에서 선언한 변수는 지역변수이고 해당 메서드가 종료되면 메모리에서 소멸

    -MethodTypeTest : MethodType 실습

    -MethodOverloadingTest : MethodOvroding 실습
    동일한 이름의 메서드를 매개변수로 구분(메서드의 반환타입은 오버로딩에 영향X)

## 5장 객체지향 프로그래밍
    -ClassTest : class실습
    클래스는 객체를 생성하는 구조체이고 속성(필드)과 기능(메서드)으로 구성
    객체는 클래스의 실제 인스턴스이고 new연산으로 생성
    Car sonata = new Car();

    -EncapsuleTest : 캡슐화 실습
    객체의 속성을 외부에서 참조하지 못하도록 객체의 정보를 은닉 
    클래스 속성은(private)선언, 은닉된정보 외부참조할땐 getter, setter

    -StaticTest : 클래스 변수, 메서드, 싱글톤 객체 실습
    static을 선언한 변수, 메서드로 Java Class Area에 생성
    별도의 객체생성(new) 하지 않고 해당 클래스 타입으로 참조, 실행
    객체(인스턴스)들간의 공유 목적으로 클래스 변수, 클래스 메서드 사용
  
    싱글톤 객체(Singleton)
    싱글톤 패턴이 적용된 객체는 하나의 인스턴스로 존재
    싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대

    -AdderTest : 싱글톤 객체와 인스턴스 객체 실습

    -Inheritance : java 클래스 상속 실습
    기존 클래스의 속성과 기능을 그대로 자식 클래스에 물려주는 클래스 확장 문법
    공통적인 로직 내용을 부모클래스에 두고 자식클래스에서 상속 받아 일관성 있는 프로그래밍 수행
    부모클래스의 속성 접근권환 protected 선언하고 자식클래스 부모클래스 속성을 초기화

    -OverrideTest : 오버라이드 메서드 실습
    부모클래스의 메서드를 자식클래스에서 재정의하는 문법, 객체지향 프로그래밍의
    다형성을 구현

    -PolyTest : 다형성 실습

## 6장 객체지향 고급
    -AbstrackTest : 추상클래스 실습
    추상클래스를 상속받아 자식클래스에서 추상메서드르 오버라이드

    -InterfaceTest : 인터페이스 실습
    클래스간 공통의 표준 규격을 통해 클래스 구조를 설계하는 문법
    인터페이스를 활용해서 객체간 결합도를 완화하는 효과를 얻는다.(다형성)

## 7장 예외처리
    -TryTest : 예외처리 실습
    try {

    } catch(Exception e) {
        e.printStackTrace();

    }

    ThrowTest : 예외던지기 실습
    메서드 내부에서 발생하는 예외를 메서드를 호출한 쪽으로 던지기위해 메서드throws 선언
    사용자가 생성한 예외를 던지기 위해 throw와 throws 선언

## 8장 자바 API클래스
    -ObjectTest : API Object 클래스 실습
    자바의 최상위 클래스로 모든 클래스는 Object를 상속받음
    주요기능은 객체비교를위한 equals(),객체정보 출력을위한 toString()제공

    -StringTest : 문자열 클래스 String 실습
    -WrapperTest
    -MathTest
    -DateTest
    -RegularExpressTest

## 9장 제네릭과 컬렉션 프레임워크
## 10장 입출력 스트림
