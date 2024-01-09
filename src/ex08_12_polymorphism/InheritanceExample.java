// 직불 계좌 클래스의 생성자를 사용하는 프로그램
// 다형성
package ex08_12_polymorphism;


public class InheritanceExample {
	public static void main(String args[]) {
		Account obj1 = new Account("111-22-333333","임꺽정",10000);
		printAccountInfo(obj1);
		
		CheckingAccount obj2 = new CheckingAccount("444-55-666666","홍길동",20000," ");
		printAccountInfo(obj2);
		
		CreditLineAccount obj3 = new CreditLineAccount("777-88-999999","김선달",30000,20000000);
		printAccountInfo(obj3);
		
		BonusPointAccount obj4 = new BonusPointAccount("000-00-000000","김미영",0,0);
		printAccountInfo(obj4);
		
	}	
	// 다양한 타입의 객체를 한 타입의 파라미터로 받습니다.
	static void printAccountInfo(Account obj) {
		System.out.println("계좌번호:"+obj.accountNo);
		System.out.println("예금주 이름:"+obj.ownerName);
		System.out.println("잔액:"+obj.balance);
		System.out.println();
	}
	
}