package ex12_1_Exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ExceptionExample9_0 {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}