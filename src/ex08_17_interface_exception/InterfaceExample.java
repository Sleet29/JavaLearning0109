package ex08_17_interface_exception;
// 저자 출력해 보세요
public class InterfaceExample {
	public static void main(String args[]) {
	SeparateVolume obj = new SeparateVolume("863ㅂ","나무", "베르베르");
	// 대출가능을 확인하고 대출상태가 가능하면 "대출가능"을 출력하고
	// 대출중이면 대출중과 대출인, 대출일을 출력합니다.
	// obj.checkOut("홍길동", "2024-01-09");
	System.out.println("case1>");
	printState(obj);
	System.out.println();
	System.out.println("case2>");
	
	obj.checkOut("홍길동", "2024-01-09");
	printState(obj);
	
	// printState(obj);
			
	}
	/*
	static void printState(SeparateVolume obj) {
		System.out.println("---------------");
		System.out.print("대출상태:");
		if(obj.state == 0) 
			System.out.println("대출가능");
		else {
			System.out.println("대출중");
			System.out.println("대출인:" + obj.borrower);
	        System.out.print("대출일:" + obj.checkOutDate + "\n");
		}
		System.out.println("---------------");
	*/
	static void printState(SeparateVolume obj) {
		System.out.println("-------------------------");
		if (obj.state == Lendable.STATE_NORMAL) 
			System.out.println("대출상태:대출가능");
		else if (obj.state == Lendable.STATE_BORROWED) {
			System.out.println("대출상태:대출중");
			System.out.println("대출인:" + obj.borrower);
			System.out.print("대출일:" + obj.checkOutDate + "\n");
		}
		System.out.println("-------------------------");
	}
}