package ex09_02_null;
// obj 변수에 null이라는 
public class RefTypeExample4 {
	public static void main(String args[]) {
		Point obj = null; // 아무 데이터도 없는 참조값
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}