package test240716;

public class RectangleController {
//	private Rectangle r;  //밑에 줄과 동일함
	private Rectangle r = new Rectangle();
	public RectangleController() {
		this.r= new Rectangle();
	}
	
	public String calcArea(int x, int y, int height, int width) {
		r.setHeight(height);
		r.setWidth(width);
		r.setX(x);
		r.setY(y);
		
		int area = r.getHeight() * r.getWidth();
		
		int perimeter = 2 * (r.getWidth() + r.getHeight());
		
		return "면적 : " + r.toString() + " / " + area;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setHeight(height);
		r.setWidth(width);
		r.setX(x);
		r.setY(y);
		int perimeter = 2 * (r.getWidth() + r.getHeight());
		return "둘레 :" + r.toString() + " / " + perimeter;
	}

}
