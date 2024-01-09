package ex08_17_interface_exception;

public class SeparateVolume2 implements Lendable2 {
	String requestNo;      // 청구번호
    String bookTitle;      // 제목
    String writer;         // 저자
    String borrower;       // 대출인
    String checkOutDate;   // 대출일
    byte state;            // 대출상태
    
    SeparateVolume2(String requestNo, String bookTitle, String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
    
    // 부모 클래스의 메소드보다 더 큰 범위의 예외를 선언할 수 없습니다.
    @Override
	public void checkOut(String borrower, String date) throws Exception{
    	if(state != STATE_NORMAL) {			// STATE_NORMAL=0(대출되지 않은 상태) - Lendable 인터페이스 상수 필드
    		throw new Exception ("대출불가!");	// 메서드 종료
    	}
    	this.borrower = borrower;
    	this.checkOutDate = date;
    	this.state = STATE_BORROWED;		// STATE_BORROWED=1(대출중) - Lendable 인터페이스 상수 필드
    	System.out.println("*"+ bookTitle + " 이(가) 대출되었습니다.");
        System.out.println("집필자:" + writer);
    	System.out.println("대출인:" + borrower);
        System.out.println("대출일:" + date + "\n"); 
    }
    
    @Override
    public void checkIn(){
    	this.borrower = null;
    	this.checkOutDate = null;
    	this.state = STATE_NORMAL;		// 반납 상태 = 0
    	System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");
    }
}
