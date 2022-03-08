package ch08;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		//인터페이스 인스턴스화 하는 방법
		//인터페이스						//인터페이스 구현객체
		RemoteControl remoteControl = new SmartTelevision();
		Searchable searchable = new SmartTelevision();
		
		remoteControl.turnOff();
		remoteControl.turnOn();
//		remoteControl.search("김기정");	error

//		searchable.turnOff();	error
//		searchable.turnOn();	error
		searchable.search("김기정");
		
	}

}
