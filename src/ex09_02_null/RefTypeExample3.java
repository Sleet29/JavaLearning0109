package ex09_02_null;

public class RefTypeExample3 {
	public static void main(String args[]) {
		Point obj = null; // 아무 데이터도 없는 참조값
		// The local variable obj may not have been initialized
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}