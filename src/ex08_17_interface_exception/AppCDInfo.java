package ex08_17_interface_exception;

public class AppCDInfo extends CDInfo implements Lendable{
	String borrower;
	String checkOutDate;
	byte state;
	String writer;
	
	AppCDInfo(String registerNo, String checkOutDate, String writer){
		super(registerNo,checkOutDate);
		this.writer = writer;
	}

	// public : 인터페이스 메소드 구현시 반드시 사용!!
	// 대출한다.
	
	@Override
	public void checkOut(String borrower, String date) {
		if (state != 0)
			return;
		
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + title + " CD가 대출되었습니다.");
        System.out.println("집필자:" + writer);
		System.out.println("대출인:" + borrower);
        System.out.println("대출일:" + date + "\n"); 
	}
	
	@Override
	public void checkIn() {
		this.borrower = null;
    	this.checkOutDate = null;
    	this.state = 0;		// 반납 상태 = 0
    	System.out.println("*" + title + " 이(가) 반납되었습니다.\n");
	}
}
