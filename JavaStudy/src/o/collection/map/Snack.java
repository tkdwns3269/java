package o.collection.map;

public class Snack {
	private String falavor;
	private int calory;

	public Snack() {
		super();
	}

	public Snack(String falavor, int calory) {
		super();
		this.falavor = falavor;
		this.calory = calory;
	}

	public String getFalavor() {
		return falavor;
	}

	public void setFalavor(String falavor) {
		this.falavor = falavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "Snack [falavor=" + falavor + ", calory=" + calory + "]";
	}

}
