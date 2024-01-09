package ex09_03_upcasting;
// obj 변수의 타입이 Account이기 때문에
// Account에 없는 pay 메소드나 cardNo필드는 컴파일 에러 발생
class RefTypeExample6 {
	public static void main(String args[]) {
		Account obj = 
				new CheckingAccount("111-22-333333333","홍길동",10,"4444-5555-6666-7777");
		try {
			//int amount = obj.pay("4444-5555-6666-7777",47000);
			//System.out.println("인출액: "+amount);
			//System.out.println("카드번호: "+obj.cardNo);
			// 3줄 다 주석제거해야 원형이지만 컴파일 오류 방지하기 위해 주석처리함
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}