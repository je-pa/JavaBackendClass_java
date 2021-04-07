package sec06.ch06;//웹 도메인 com.naver.프로젝트명.model.클래스명 //자바는 소문자만!!

public class ConstructorExam2 {
//public 은 자바파일과 같은 이름의 클래스에만 붙일수 있다.
	
	//객체지향 언어는 모두 생성자를 사용
	//생성자는 객체가 만들어
	public static void main(String[] args) { 
		Tv2 tv = new Tv2();
		tv.displayState();
		//일렉트로 50inch 100Channel 50Volume
	}
}
class Tv2{
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	//기본생성자
	//생성자 vs 메소드
	//이름은 클래스명이랑 같다/자바기준 다른데는 constuctor?
	//리턴타입이 없다
	
	//생성자는 객체 생성할때만 사용할 수 있다. 
	 
	//기본생성자는 컴파일러가 생성자가 하나도 없을시 넣어준다
	Tv2(){
		this("일렉트로", 50, 100, 50);
	}
	
	Tv2(String brand, int inch, int maxChannel, int maxVolume){
		this.brand=brand;
		this.inch=inch;
		this.maxChannel=maxChannel;
		this.maxVolume=maxVolume;
	}
	
	void volumeUp(){
		currentVolume++;
	}
	
	void displayVolume() {
		System.out.println("현재 볼륨 : "+currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n",brand,inch,maxChannel,maxVolume);
	}
}