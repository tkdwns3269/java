package test240715.object3;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		return "면적 : " + (height * width);
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		return "둘레 : " + 2 * (height + width);
	}

}
