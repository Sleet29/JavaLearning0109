package ex08_17_interface_exception;
interface Lendable2 {
	final static byte STATE_BORROWED = 1;
	final static byte STATE_NORMAL = 0;

	// public이 생략된 형태임
	// abstract 추가
	abstract void checkOut(String borrower, String date) throws Exception;
	abstract void checkIn();
}
