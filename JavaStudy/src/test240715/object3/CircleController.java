package test240715.object3;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		return "면적 : " + (radius * radius * Math.PI);
		
	}
	
	public String calcCircum(int x, int y, int radius) {
		return "둘레 : " + (2 * radius * Math.PI);
		
	}

}
