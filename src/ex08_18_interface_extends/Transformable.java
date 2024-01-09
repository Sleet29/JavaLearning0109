package ex08_18_interface_extends;
interface Transformable extends Movable {
	void resize(int width, int height);
}

/*
	void moveTo(int x, int y);
	void moveBy(int xOffset, int yOffset);
	도 담겨있음
 */
