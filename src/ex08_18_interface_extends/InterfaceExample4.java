package ex08_18_interface_extends;

public class InterfaceExample4 {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle(100, 200, 10, 10); 
		printRectangle(obj);
        
        obj.moveTo(25, 35);            
        printRectangle(obj);
        
        obj.moveBy(-5, -5);           
        printRectangle(obj);
        
        obj.resize(30, 30);           
        printRectangle(obj);
    }
	
	static void printRectangle(Rectangle rect) {
	    rect.printRectangle();
	}
}
