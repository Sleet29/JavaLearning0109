package ex08_13_01_polymorphism;

abstract class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title, String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	// 추상 메서드 - 메시지를 송신한다.
	abstract void sendMessage(String recipient); 
	// abstract void sendMessage(String recipient); - 주석 처리시 오류 발생함 

}
